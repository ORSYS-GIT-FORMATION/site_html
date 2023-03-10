package com.orsys.banque;

import java.time.LocalDateTime;

public class Client implements Comparable<Client> {

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

    public LocalDateTime getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDateTime dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public LocalDateTime getDateCreationCompte() {
        return dateCreationCompte;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateDeNaissance=" + dateDeNaissance +
                ", dateCreationCompte=" + dateCreationCompte +
                '}';
    }

    public void setDateCreationCompte(LocalDateTime dateCreationCompte) {
        this.dateCreationCompte = dateCreationCompte;
    }

    @Override
    public int compareTo(Client o) {

        if (this.nom == o.nom) {
            return 1;
        }

        return 0;
    }
}
