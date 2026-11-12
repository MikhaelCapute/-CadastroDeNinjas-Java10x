package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesService {

    // abrindo acessoa ao repostory
    private ImissoesRepository missoesRepository;

    // injetando repository
    public MissoesService(ImissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    // Lista missoes
    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }

}
