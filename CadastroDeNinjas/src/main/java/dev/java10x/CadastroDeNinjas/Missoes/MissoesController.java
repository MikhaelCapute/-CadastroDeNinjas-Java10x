package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping

public class MissoesController {

    @GetMapping("/TelaPrincipalMissoes")
    public String telaPrincipalMissoes() {
        return "Olá bem vindo a tela principal de missões!";
    }


    //CREATE
    @PostMapping("/criarMissoes")
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
    @PutMapping("/alterarMissoesID")
    public String alterar_missoes() {
        return "Alterando Missoes";
    }

    // DELETE
    @DeleteMapping("/deletandoMissoes")
    public String deletar_missoes() {
        return "Deletando Missoes";
    }


}
