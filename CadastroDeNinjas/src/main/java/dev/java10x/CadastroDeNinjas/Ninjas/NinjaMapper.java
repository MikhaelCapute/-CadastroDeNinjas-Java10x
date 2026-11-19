package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {

    // Relacionando o NinjaDTO com o Model (explicando para o spring que o valor de NinjaDRO é igual ao NinjaModel)

    public NinjaModel map(NinjaDTO NinjaDTO){
        NinjaModel ninjaModel = new NinjaModel();
        ninjaModel.setId(NinjaDTO.getId());
        ninjaModel.setNome(NinjaDTO.getNome());
        ninjaModel.setEmail(NinjaDTO.getEmail());
        ninjaModel.setImgUrl(NinjaDTO.getImgUrl());
        ninjaModel.setIdade(NinjaDTO.getIdade());
        ninjaModel.setRank(NinjaDTO.getRank());
        ninjaModel.setFraseDeEfeito(NinjaDTO.getFrase_de_feito());
        ninjaModel.setMissoes(NinjaDTO.getMissoes());

        return ninjaModel;
    }

    public NinjaDTO map(NinjaModel ninjaModel){
        NinjaDTO ninjaDTO = new NinjaDTO();
        ninjaDTO.setId(ninjaModel.getId());
        ninjaDTO.setNome(ninjaModel.getNome());
        ninjaDTO.setEmail(ninjaModel.getEmail());
        ninjaDTO.setImgUrl(ninjaModel.getImgUrl());
        ninjaDTO.setIdade(ninjaModel.getIdade());
        ninjaDTO.setRank(ninjaModel.getRank());
        ninjaDTO.setFrase_de_feito(ninjaModel.getFraseDeEfeito());
        ninjaDTO.setMissoes(ninjaModel.getMissoes());

        return ninjaDTO;
    }

}
