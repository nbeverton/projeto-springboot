package projetospringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import projetospringboot.models.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

   @GetMapping(path = "/qualquer")
    public Cliente obterCliente(){
        return new Cliente(1, "Pedro", "123.456.789-00");
    }
}
