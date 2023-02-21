package com.orsys.banque;

import com.orsys.banque.exception.ClientInvalideException;
import com.orsys.banque.exception.MontantInitialInvalideException;

public abstract class Compte {

    //############ Attributs statiques #################

    private static int nbCompteOuvert = 0;

    //############ Attributs d'instance #################

    private int numero;
    private float montant = 0;
    private String intitule = "Compte courant";

    private final Client proprietaire;

    //############ Constructeur #################

    public Compte(Client client, float montant) throws ClientInvalideException, MontantInitialInvalideException {

        if (client == null) {
            throw new ClientInvalideException("Le client est invalide");
        }

        this.proprietaire = client;

        this.intitule = "Compte en banque";

        if (montant < 0) {
            throw new MontantInitialInvalideException();
        }

        this.montant = montant;

        this.numero = getNbCompteOuvert();

        addAnAccount();

    }

    public Compte(Client client) {

        this.proprietaire = client;

        this.intitule = "Compte en banque";
        this.montant = 0;

        this.numero = getNbCompteOuvert();

        addAnAccount();

    }

    public Compte(Client client, float montant, String intitule) {

        this.proprietaire = client;

        this.intitule = intitule;
        this.montant = montant;

        this.numero = getNbCompteOuvert();

        addAnAccount();

    }

    //############ Méthodes d'instances #################

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void affichage(){

        System.out.println("Compte standard");

    }

    public abstract String resume();

    //System.out.println(compte) => J'appelle toString()
    // String
    @Override
    public String toString() {
        return "Compte{" +
                "numero=" + numero +
                ", montant=" + montant +
                ", intitule='" + intitule + '\'' +
                '}';
    }

    //################## Méthodes statiques #######################

    static void addAnAccount() {

        nbCompteOuvert ++;

    }

    static int getNbCompteOuvert() {

        return nbCompteOuvert;

    }

}
