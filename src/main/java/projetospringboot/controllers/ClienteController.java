package projetospringboot.controllers;

import org.springframework.web.bind.annotation.*;
import projetospringboot.models.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

   @GetMapping(path = "/qualquer")
    public Cliente obterCliente(){
        return new Cliente(1, "Pedro", "123.456.789-00");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id){
        return new Cliente(id, "Socorro", "987.654.321-99");
    }

    @GetMapping()
    public Cliente obterClientePorId2(
            @RequestParam(name = "id") int id){
       return new Cliente(id, "Carlos Alberto", "111.222.333-44");
    }
}
