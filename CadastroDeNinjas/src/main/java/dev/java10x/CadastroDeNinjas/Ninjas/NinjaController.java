package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

// Vai mapear o arquivo do java

@RestController
@RequestMapping("/ninjas")

public class NinjaController {

    //Injetando o Service:
    private NinjaService ninjaService;
    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

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
    @GetMapping("/listar/{id}") // {id} is path variable
    public NinjaModel listarNinjasPorId(@PathVariable Long id){
        return ninjaService.listarNinjaPorId(id);
    }


    // Mostrar todos os NINJAS (READ)
    @GetMapping("/listar")
    public List<NinjaModel> mostrar_Ninja(){
        return ninjaService.listarNinjas();
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
