package com.yoprogramo.temperatura.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorController {
    
    @GetMapping("/ftoc/{f}")
    public String convertir(@PathVariable int f){
        int c = (int)((f-32)/1.8);
        return "El equivalente de " + f + "° Fahrenheit es " + c + "° Celsius.";
    }
    
    @GetMapping("/hola")
    public String saludar(){
        return "Hola";
    }
}
