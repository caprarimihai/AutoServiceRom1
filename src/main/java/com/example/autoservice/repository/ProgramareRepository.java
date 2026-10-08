package com.example.autoservice.repository;
// Spune că interfața se află în package-ul repository.

import com.example.autoservice.model.Programare;
// Importă modelul Programare.

import org.springframework.data.jpa.repository.JpaRepository;
// Importă JpaRepository, care oferă automat operații pentru baza de date.

public interface ProgramareRepository extends JpaRepository<Programare, Long> {
    // Creează repository-ul pentru entitatea Programare.
    // Programare = entitatea pe care o gestionăm.
    // Long = tipul ID-ului entității.
}