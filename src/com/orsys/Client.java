package com.orsys;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Client {

    String nom;
    String prenom;
    LocalDateTime  birthDayDate;
    LocalDateTime  openDateFirstBank;

    // ******************************  CONSTRUCTEURS ******************************************
    public Client (String nom, String adresse, LocalDateTime birthDayDate) {

        this.nom = nom;
        this.prenom = adresse;
        this.birthDayDate = birthDayDate;
        this.openDateFirstBank = LocalDateTime.now();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDateTime getBirthDayDate() {
        return birthDayDate;
    }

    public void setBirthDayDate(LocalDateTime birthDayDate) {
        this.birthDayDate = birthDayDate;
    }

    public LocalDateTime getOpenDateFirstBank() {
        return openDateFirstBank;
    }

    public void setOpenDateFirstBank(LocalDateTime openDateFirstBank) {
        this.openDateFirstBank = openDateFirstBank;
    }
}

