
        package com.example.autoservice.controller;
// Spune că această clasă face parte din pachetul controller.

import org.springframework.stereotype.Controller;
// Importă adnotarea Controller din Spring.

import org.springframework.web.bind.annotation.GetMapping;
// Importă adnotarea care permite maparea cererilor HTTP GET.

@Controller
// Spune lui Spring că această clasă este un controller web.

public class HomeController {
    // Declară clasa HomeController.

    @GetMapping("/")
    // Această metodă răspunde când accesăm pagina principală "/".

    public String home() {
        // Creează metoda care afișează pagina principală.

        return "index";
        // Spune lui Thymeleaf să deschidă templates/index.html.
    }

    @GetMapping("/programare")
    // Această metodă răspunde când accesăm adresa "/programare".

    public String programare() {
        // Creează metoda pentru pagina de programare.

        return "programare";
        // Spune lui Thymeleaf să deschidă templates/programare.html.
    }
}

