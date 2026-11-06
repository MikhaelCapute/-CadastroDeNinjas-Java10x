package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

// Vai mapear o arquivo do java

@RestController
@RequestMapping

public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é a minha primeira mensagem nessa rota";
    }

    /// CRIANDO OS ENDPOINTS
    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criar_Ninja(){
        return "Ninja Criado";
    }


    // Mostrar ninja por ID (READ)
    @GetMapping("/mostrarID")
    public String mostrarId_Ninja(){
        return "Mostrar Ninja por ID";

    }


    // Mostrar todos os NINJAS (READ)
    @GetMapping("/mostrar")
    public String mostrar_Ninja(){
        return "Mostrar todos os ninjas";
    }


    // Altera dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarId_Ninja(){
        return "alterar ninja por ID";
    }


    // Deletar ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarId_Ninja(){
        return "Deletar ninja por Id";
    }
}
