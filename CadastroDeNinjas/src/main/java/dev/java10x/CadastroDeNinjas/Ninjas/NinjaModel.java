package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/// Entity transforma uma classe em uma entidade do BD
/// JPA - JAVA PERSISTENCE API
@Entity // Definindo que essa classe será uma entidade do BD
@Table(name = "tb_cadastro") // criando uma tabela no banco de dados com o nome

/// CONTRUTORES -------------------------------------------------
@NoArgsConstructor // CRIANDO UM CONSTRUTOR SEM ARGUMENTOS
@AllArgsConstructor // CRIANDO UM CONSTRUTOR COM TODOS OS ARGUMENTOS

/// GETTERS & SETTERS -------------------------------------------------
@Data // CRIANDO TODOS OS GETTERS E SETTERS


public class NinjaModel {

    /// ATRIBUTOS
    @Id // Adicionando ID as entidades
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Estratégia de ID nas entidade "AutoIncrement(1,2,3 ...)"
    private Long id;

    private String nome;

    @Column(unique = true) // Essa coluna vai ser única. Apenas um único email pode ser cadastrado.
    private String email;

    private int idade;

    // @ManyToOne - um ninja tem uma única missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing key ou chave estrangeira /// Fusão das tabela
    private MissoesModel missoes;
}
