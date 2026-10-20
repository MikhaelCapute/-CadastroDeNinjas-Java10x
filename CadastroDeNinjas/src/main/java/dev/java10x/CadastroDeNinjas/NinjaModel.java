package dev.java10x.CadastroDeNinjas;

import jakarta.persistence.*;

/// Entity transforma uma classe em uma entidade do BD
/// JPA - JAVA PERSISTENCE API
@Entity // Definindo que essa classe será uma entidade do BD
@Table(name = "tb_cadastro") // criando uma tabela no banco de dados com o nome
public class NinjaModel {

    @Id // Adicionando ID as entidades
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Estratégia de ID nas entidade "AutoIncrement(1,2,3 ...)"
    Long id;
    String nome;
    String email;
    int idade;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
