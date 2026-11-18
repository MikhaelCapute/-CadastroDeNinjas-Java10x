package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// LOCALHOST:8080/ <- nossa rota
@RestController // <- define que isso é uma rota para as nossa APIs
@RequestMapping("missoes") // <- Mapeia as APIs =  localhost:8080/missoes/{endpoint}

public class MissoesController {

    private MissoesService missoesService;
    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

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
    public MissoesModel criarMissoes(@RequestBody MissoesModel missoes) {
        return missoesService.criarMissoes(missoes);
    }

    // Read
    @GetMapping("/listar")
    public List<MissoesModel> ListarMissoes() {
        return missoesService.listarMissoes();
    }

    // Read by ID
    @GetMapping("/listar/{id}")
    public MissoesModel listarMissoesPorId(@PathVariable Long id) {
        return  missoesService.listarMissoesPorId(id);
    }

    // UPDATE
    @PutMapping("/alterar/{id}")
    public String alterar_missoes(Long id) {
        return "Alterando Missoes";
    }

    // DELETE
    @DeleteMapping("/deletar/{id}")
    public String deletarPorId(@PathVariable Long id) {

        return "Id" + id + "deletado com sucesso!";
    }
}
