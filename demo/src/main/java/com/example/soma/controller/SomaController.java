package com.example.soma.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SomaController {

    @GetMapping("/soma")
    public String showForm() {
        return "somaForm";  // retorna o nome da página HTML (somaForm.html)
    }

    @PostMapping("/soma")
    public ResponseEntity<String> somar(@RequestParam int num1, 
                        @RequestParam int num2) {
        int resultado = num1 + num2;
        return ResponseEntity.ok("Resultado: " + resultado);
    }
}
