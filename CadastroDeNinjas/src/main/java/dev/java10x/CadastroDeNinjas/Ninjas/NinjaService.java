package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/// CRIANDO UMA CAMADA DE SERVICE
@Service // Definindo com uma anotation de camada de serviço
public class NinjaService {

    // injeção de dependencia, permitir o service acessar o repository
    private IninjaRepository ninjaRepository;

    // toda vez que injeta uma dependencia, inicializa um construtor
    public NinjaService(IninjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Logica para listar todos os meus ninjas
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }


    //findall - busca todos de certa tabela do banco de dados (SELECT * FROM TB_CADASTRO)
    //findbyid - busca por id
    //save - insert no DB
}
