package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")

public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome_da_missao;
    private RANK rank;

    @OneToMany(mappedBy = "missoes") // @OneToMany - uma missao pode ter muitos ninjas
    private List<NinjaModel> ninjas;


    public MissoesModel() {
    }
    public MissoesModel(Long id, String nome_da_missao, RANK rank) {
        this.id = id;
        this.nome_da_missao = nome_da_missao;
        this.rank = rank;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome_da_missao() {
        return nome_da_missao;
    }

    public void setNome_da_missao(String nome_da_missao) {
        this.nome_da_missao = nome_da_missao;
    }

    public RANK getRank() {
        return rank;
    }

    public void setRank(RANK rank) {
        this.rank = rank;
    }

}
