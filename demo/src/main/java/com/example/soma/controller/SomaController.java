package com.example.soma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SomaController {

    @GetMapping("/")
    public String showForm() {
        return "somaForm";
    }

    @PostMapping("/soma")
    public String somar(@RequestParam("num1") int num1, 
                        @RequestParam("num2") int num2, 
                        Model model) {
        int resultado = num1 + num2;
        model.addAttribute("resultado", resultado);
        return "somaForm";
    }
}
