package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;

// JPA é uma abstração para as queries do nosso bando de dados

public interface ImissoesRepository extends JpaRepository<MissoesModel, Long> {
}
