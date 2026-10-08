package com.example.autoservice.controller;
// Spune că această clasă aparține package-ului controller.

import com.example.autoservice.model.Programare;
// Importă modelul Programare.

import com.example.autoservice.service.ProgramareService;
// Importă service-ul pentru programări.

import org.springframework.stereotype.Controller;
// Importă adnotarea Controller.

import org.springframework.ui.Model;
// Permite trimiterea datelor către pagina HTML.

import org.springframework.web.bind.annotation.GetMapping;
// Permite maparea cererilor HTTP GET.

import org.springframework.web.bind.annotation.PostMapping;
// Permite maparea cererilor HTTP POST.

@Controller
// Spune lui Spring că această clasă este un controller web.

public class HomeController {
    // Declară clasa HomeController.

    private final ProgramareService programareService;
    // Creează o referință către service-ul nostru.

    public HomeController(ProgramareService programareService) {
        // Constructorul primește automat ProgramareService de la Spring.

        this.programareService = programareService;
        // Salvează service-ul primit în variabila clasei.
    }

    @GetMapping("/")
    // Răspunde când accesăm pagina principală "/".

    public String home() {
        // Creează metoda pentru pagina principală.

        return "index";
        // Deschide templates/index.html.
    }

    @GetMapping("/programare")
    // Răspunde când accesăm pagina "/programare".

    public String programare() {
        // Creează metoda pentru afișarea formularului.

        return "programare";
        // Deschide templates/programare.html.
    }

    @PostMapping("/programare")
    // Răspunde când formularul este trimis folosind metoda POST.

    public String salveazaProgramare(Programare programare, Model model) {
        // Primește datele formularului într-un obiect Programare.

        programareService.salveazaProgramare(programare);
        // Trimite obiectul către service pentru salvare.

        model.addAttribute("mesaj", "Programarea a fost trimisă cu succes!");
        // Trimite un mesaj către pagina HTML.

        return "programare";
        // Revine la pagina formularului.
    }
}
