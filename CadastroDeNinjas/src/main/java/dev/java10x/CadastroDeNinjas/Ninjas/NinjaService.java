package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

/// CRIANDO UMA CAMADA DE SERVICE
@Service // Definindo com uma anotation de camada de serviço
public class NinjaService {

    // injeção de dependencia, permitir o service acessar o repository
    private IninjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    // toda vez que injeta uma dependencia, inicializa um construtor
    public NinjaService(IninjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    //Criando um novo ninja
    public NinjaDTO criarNinja(NinjaDTO ninjaDTO){
        NinjaModel ninjaMapped = ninjaMapper.map(ninjaDTO);
        ninjaMapped = ninjaRepository.save(ninjaMapped);
        return ninjaMapper.map(ninjaMapped);
    }



    // Logica para listar todos os meus ninjas
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    // Listar ninjas por id
    public NinjaModel listarNinjaPorId(Long id){
        Optional<NinjaModel> ninjaPorID = ninjaRepository.findById(id);
        return ninjaPorID.orElse(null);
    }

    // Atualizar Ninja - UPDATE
    public NinjaModel alterarPorId(Long id, NinjaModel ninjaAtualizado){
        if (ninjaRepository.existsById(id)){
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }
        return null;
    }


    // Deletar Ninja - Tem que ser um metodo VOID
    public void deletarPorId(Long id) {
        ninjaRepository.deleteById(id);
    }




    //findall - busca todos de certa tabela do banco de dados (SELECT * FROM TB_CADASTRO)
    //findbyid - busca por id
    //save - insert no DB
}
