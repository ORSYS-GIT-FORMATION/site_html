package com.orsys.banque;

import java.time.LocalDateTime;
import java.time.Month;

public class Client {

    String nom;
    String prenom;
    LocalDateTime dateDeNaissance;
    LocalDateTime dateCreationCompte;

    public Client (String nom, String prenom) {

        this.nom = nom;
        this.prenom = prenom;

        this.dateDeNaissance = LocalDateTime.now();
        this.dateCreationCompte = LocalDateTime.now();

    }


}
