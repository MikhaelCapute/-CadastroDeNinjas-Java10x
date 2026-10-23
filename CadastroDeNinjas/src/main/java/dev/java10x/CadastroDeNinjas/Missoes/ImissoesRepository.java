package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;

// JPA é uma abstração para as queries do nosso bando de dados
// jpa tem uma serie de metodos já prontos que vai facilitar a trabalhar com o banco de dados
// JPA é resumidamente um simplificador para utilizar banco de dados

public interface ImissoesRepository extends JpaRepository<MissoesModel, Long /*Tipo do "ID"*/ > {
}
