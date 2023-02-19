package com.orsys.banque;

import java.time.LocalDateTime;

public class Banque {

    String nom;
    String adresse;
    LocalDateTime dateDeCreation;

    Client[] clients;

    Compte[] comptes;

    public Banque(String nom, String adresse) {

        this.nom = nom;
        this.adresse = adresse;
        this.dateDeCreation = LocalDateTime.now();

        this.clients = new Client[1000];

        this.comptes = new CompteCourant[1000];

    }

    public void ajouterClient(String nom, String prenom){

        Client nouveauClient = new Client(nom, prenom);

        for (int i=0; i<1000 ; i++) {

            if (this.clients[i] == null){

                this.clients[i] = nouveauClient;

                return;

            }

        }

        System.out.println("Ajout impossible ! Il n'y a plus de place");

    }

    public void ajouterCompte(Client client, String intitule, float montant){

        CompteCourant nouveauCompte = new CompteCourant(client, montant, intitule);

        for (int i=0; i<1000 ; i++) {

            if (this.comptes[i] == null){

                this.comptes[i] = nouveauCompte;

                return;

            }

        }

        System.out.println("Ajout impossible ! Il n'y a plus de place");

    }

    public void affichageComptes() {

        for (int i=0; i<1000 ; i++) {

            if (this.comptes[i] != null){

                System.out.println(this.comptes[i]);

            }

        }

    }

    public void affichageClients() {

        for (int i=0; i<1000 ; i++) {

            if (this.clients[i] != null){

                System.out.println(this.clients[i]);

            }

        }

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

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }
}
