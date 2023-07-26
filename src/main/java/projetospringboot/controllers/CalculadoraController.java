package projetospringboot.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {


    @GetMapping(path = "/soma/{a}/{b}")
    public int soma(@PathVariable int a,@PathVariable int b){
        return a + b;
    }

    @GetMapping(path = "/subtracao")
    public int subitracao(@RequestParam(name = "a") int a,
                          @RequestParam(name = "b") int b){
        return a - b;
    }

}
