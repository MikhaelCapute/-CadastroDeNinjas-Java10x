package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    // abrindo acessoa ao repostory
    private ImissoesRepository missoesRepository;
    // injetando repository
    public MissoesService(ImissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    public MissoesModel criarMissoes(MissoesModel missoes){
        return missoesRepository.save(missoes);
    }

    // Lista missoes
    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }

    public MissoesModel listarMissoesPorId(Long id){
        Optional<MissoesModel> missoesPorID = missoesRepository.findById(id);
        return missoesPorID.orElse(null);
    }

    // Atualizar Missoes - UPDATE
    public MissoesModel alterarPorId(Long id, MissoesModel missoesAtualizado){
        if (missoesRepository.existsById(id)){
            missoesAtualizado.setId(id);
            return missoesRepository.save(missoesAtualizado);
        }
        return null;
    }

    public void deletarPorId(Long id){
        missoesRepository.deleteById(id);
    }

}
