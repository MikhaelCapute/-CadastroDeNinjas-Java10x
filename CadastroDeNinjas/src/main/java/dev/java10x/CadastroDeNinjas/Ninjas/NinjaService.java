package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/// CRIANDO UMA CAMADA DE SERVICE
@Service // Definindo com uma anotation de camada de serviço
public class NinjaService {

    // injeção de dependencia, permitir o service acessar o repository
    private IninjaRepository ninjaRepository;

    // toda vez que injeta uma dependencia, inicializa um construtor
    public NinjaService(IninjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //Criando um novo ninja
    public NinjaModel criarNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
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

    // Deletar Ninja - Tem que ser um metodo VOID
    public void deletarPorId(Long id) {
        ninjaRepository.deleteById(id);
    }


    //findall - busca todos de certa tabela do banco de dados (SELECT * FROM TB_CADASTRO)
    //findbyid - busca por id
    //save - insert no DB
}
