package com.example.autoservice.controller;

import org.springframework.stereotype.Controller; // Importă adnotarea Controller din Spring.
import org.springframework.web.bind.annotation.GetMapping; // Importă adnotarea pentru cereri HTTP GET.

@Controller // Spune lui Spring că această clasă este un controller web.
public class HomeController { // Declară clasa HomeController.

    @GetMapping("/") // Spune că metoda răspunde atunci când accesăm adresa "/".
    public String home() { // Creează metoda care va procesa cererea.

        return "index"; // Spune lui Thymeleaf să afișeze templates/index.html.
    }
}