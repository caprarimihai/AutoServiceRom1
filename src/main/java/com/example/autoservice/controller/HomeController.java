package com.example.autoservice.controller;
// Spune că această clasă aparține package-ului controller.
import java.util.List; // Permite folosirea listelor de programări.

import com.example.autoservice.model.Programare;

import org.springframework.web.bind.annotation.PathVariable; // Citește ID-ul din adresa URL.
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
    // Deschide pagina administratorului cu toate programările.
    @GetMapping("/admin/programari")
    public String afiseazaProgramari(Model model) {
        // Citește toate programările din baza de date.
        List<Programare> programari = programareService.toateProgramarile();

        // Trimite lista de programări către pagina HTML.
        model.addAttribute("programari", programari);

        // Deschide pagina admin-programari.html.
        return "admin-programari";
    }

// Acceptă o programare identificată prin ID.
    @GetMapping("/admin/programari/{id}/accepta")
    public String acceptaProgramare(@PathVariable Long id) {
        // Schimbă statusul programării în ACCEPTED.
        programareService.schimbaStatus(id, "ACCEPTED");

        // Revine la lista programărilor din panoul administratorului.
        return "redirect:/admin/programari";
    }

    // Respinge o programare identificată prin ID.
    @GetMapping("/admin/programari/{id}/respinge")
    public String respingeProgramare(@PathVariable Long id) {
        // Schimbă statusul programării în REJECTED.
        programareService.schimbaStatus(id, "REJECTED");

        // Revine la lista programărilor din panoul administratorului.
        return "redirect:/admin/programari";
    }


}
