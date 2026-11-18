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

    @GetMapping
    public String boasVindas(){
        return "Essa é a minha primeira mensagem nessa rota";
    }

    /// CRIANDO OS ENDPOINTS
    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
        return ninjaService.criarNinja(ninja);
    }

    // Mostrar ninja por ID (READ)
    @GetMapping("/listar/{id}") // {id} is path variable
    public NinjaModel listarNinjasPorId(@PathVariable Long id){
        return ninjaService.listarNinjaPorId(id);
    }

    // Mostrar todos os NINJAS (READ)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    // Altera dados dos ninjas (UPDATE)
    @PutMapping("/alterar/{id}")
    public NinjaModel alterarPorId(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado) {
        return ninjaService.alterarPorId(id, ninjaAtualizado);
    }

    // Deletar ninja (DELETE)
    @DeleteMapping("/deletar/{id}")
    public String deletarNinjaPorID(@PathVariable Long id){
        ninjaService.deletarPorId(id);
        return "Usuario deletado com sucesso!";
    }
}
