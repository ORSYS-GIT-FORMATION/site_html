package com.orsys.banque;

public class Compte {

    int numero;
    float montant = 0;
    String intitule = "Compte courant";

    public Compte(float x) {

        this.montant = x;

        System.out.println("Construteur Compte");
        // Sera appele en premier lors de la création d'un CompteCourant

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
