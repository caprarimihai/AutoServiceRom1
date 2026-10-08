package com.example.autoservice.service;
// Spune că această clasă se află în package-ul service.

import com.example.autoservice.model.Programare;
// Importă modelul Programare.

import com.example.autoservice.repository.ProgramareRepository;
// Importă repository-ul care comunică cu baza de date.

import org.springframework.stereotype.Service;
// Importă adnotarea Service din Spring.

@Service
// Spune lui Spring că această clasă este un service și trebuie gestionată de Spring.

public class ProgramareService {
    // Declară clasa ProgramareService.

    private final ProgramareRepository programareRepository;
    // Creează o referință către repository-ul nostru.

    public ProgramareService(ProgramareRepository programareRepository) {
        // Constructorul primește automat repository-ul de la Spring.

        this.programareRepository = programareRepository;
        // Salvează repository-ul primit în variabila clasei.
    }

    public Programare salveazaProgramare(Programare programare) {
        // Creează metoda care va salva o programare.

        return programareRepository.save(programare);
        // Trimite programarea către repository, iar repository-ul o salvează în MySQL.
    }
}