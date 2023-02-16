package com.orsys;

import com.orsys.banque.Client;
import com.orsys.banque.CompteCourant;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Banque {

    String nom;
    String adresse;
    LocalDateTime dateDeCreation;

    Client clients[];
    Integer nbClient;

    CompteCourant comptes[];
    Integer nb

    public Banque(String nom, String adresse) {

        this.nom = nom;
        this.adresse = adresse;
        this.dateDeCreation = LocalDateTime.now();

        this.clients = new Client[1000];

    }

    public void addClient(){

        this.clients[] = new Client();

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Banque " + nom + '\'' +
                "situé à l'adresse " + adresse +
                ", créé le " + dateDeCreation;
    }
}
