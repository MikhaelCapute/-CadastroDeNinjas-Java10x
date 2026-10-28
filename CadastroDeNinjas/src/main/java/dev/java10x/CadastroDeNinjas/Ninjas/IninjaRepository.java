package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.data.jpa.repository.JpaRepository;

// Criando uma camada de repository
public interface IninjaRepository extends JpaRepository<NinjaModel, Long> {
}
