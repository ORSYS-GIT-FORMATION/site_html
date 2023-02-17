package com.orsys.banque;

public abstract class Compte {

    private int numero;
    private float montant = 0;
    private String intitule = "Compte courant";

    private final Client proprietaire;

    public Compte(Client client) {

        this.proprietaire = client;


    }

    public Compte(Client client, float montant) {

        this.proprietaire = client;


    }

    public Compte(Client client, float montant, String intitule) {

        this.proprietaire = client;


    }

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
}
