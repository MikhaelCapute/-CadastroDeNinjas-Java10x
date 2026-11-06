package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

// LOCALHOST:8080/ <- nossa rota
@RestController // <- define que isso é uma rota para as nossa APIs
@RequestMapping("missoes") // <- Mapeia as APIs =  localhost:8080/missoes/{endpoint}

public class MissoesController {

    @GetMapping("/TelaPrincipalMissoes")
    public String telaPrincipalMissoes() {
        return "Olá bem vindo a tela principal de missões!";
    }

    // GET - manda uma requisisao para mostrar as missoes
    // Put - altera
    // Post - cria
    // delete - deleta

    //CREATE
    @PostMapping("/criar")
    public String criar_missoes() {
        return "Criando Missoes";
    }


    // Read
    @GetMapping("/missoes")
    public String missoes() {
        return "Todas as missoes";
    }

    // Read by ID
    @GetMapping("/missoesID")
    public String missoesID() {
        return "Todas as missoes por ID";
    }

    // UPDATE
    @PutMapping("/alterarID")
    public String alterar_missoes() {
        return "Alterando Missoes";
    }

    // DELETE
    @DeleteMapping("/deletar")
    public String deletar_missoes() {
        return "Deletando Missoes";
    }


}
