package projetospringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

    //    @RequestMapping(method = RequestMethod.GET, path = "/olar")
    @GetMapping(path = "/olar")
    public String olar() {
        return "Olar, Spring Boot!";
    }
}
