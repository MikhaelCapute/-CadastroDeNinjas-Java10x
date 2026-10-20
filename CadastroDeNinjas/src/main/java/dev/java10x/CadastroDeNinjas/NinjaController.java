package dev.java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.*;

// Vai mapear o arquivo do java

@RestController
@RequestMapping

public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é a minha primeira mensagem nessa rota";
    }

}
