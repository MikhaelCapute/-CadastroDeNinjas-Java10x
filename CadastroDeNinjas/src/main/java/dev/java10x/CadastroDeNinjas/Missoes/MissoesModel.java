package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")

@AllArgsConstructor
@NoArgsConstructor
@Data

public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome_missao")
    private String nome_da_missao;

    @Column(name = "rank")
    private RANK rank;

    @OneToMany(mappedBy = "missoes") // @OneToMany - uma missao pode ter muitos ninjas
    private List<NinjaModel> ninjas;

}
