package com.example.autoservice.model;
// Spune că această clasă se află în package-ul model.

import jakarta.persistence.Entity;
// Importă adnotarea Entity pentru JPA.

import jakarta.persistence.GeneratedValue;
// Permite generarea automată a ID-ului.

import jakarta.persistence.GenerationType;
// Importă strategia de generare a ID-ului.

import jakarta.persistence.Id;
// Marchează câmpul ID ca fiind cheia primară.

@Entity
// Spune lui JPA că această clasă reprezintă o entitate care poate fi salvată în baza de date.

public class Programare {
    // Declară clasa Programare.

    @Id
    // Spune că id este cheia primară.

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Spune bazei de date să genereze automat ID-ul.

    private Long id;
    // ID-ul unic al programării.

    private String clientName;
    // Numele și prenumele clientului.

    private String phone;
    // Numărul de telefon al clientului.

    private String carBrand;
    // Marca mașinii.

    private String carModel;
    // Modelul mașinii.

    private String date;
    // Data programării.

    private String time;
    // Ora programării.

    private String services;
    // Serviciile solicitate, de exemplu schimb ulei sau schimb filtre.

    private String notes;
    // Observațiile clientului.

    private String status;
    // Statusul programării: PENDING, ACCEPTED sau REJECTED.

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}