package com.example.soma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SomaController {

    @GetMapping("/soma")
    public String exibirFormulario() {
        return "soma";  // Nome do arquivo HTML sem a extensão .html
    }

    @PostMapping("/soma")
    public String somar(@RequestParam("num1") int num1,
                        @RequestParam("num2") int num2,
                        Model model) {
        int resultado = num1 + num2;
        model.addAttribute("resultado", resultado);
        return "soma";  // Retorna para o mesmo template para exibir o resultado
    }
}
