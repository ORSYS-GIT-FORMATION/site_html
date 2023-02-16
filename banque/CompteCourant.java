package com.orsys.banque;

public class CompteCourant {

    static int nbCompteOuvert = 0;

    int numero;
    float montant = 0;
    String intitule = "Compte courant";
    float decouvertMaxAutorise = 0;

    public CompteCourant() {

        updateDecouvertMaxAutorise();

        addAnAccount();

        this.numero = getNbCompteOuvert();
    }

    public CompteCourant(float montant) {
        this.montant = montant;

        updateDecouvertMaxAutorise();

        addAnAccount();

        this.numero = getNbCompteOuvert();
    }

    public CompteCourant(float montant, String intitule) {
        this.montant = montant;
        this.intitule = intitule;

        updateDecouvertMaxAutorise();

        addAnAccount();

        this.numero = getNbCompteOuvert();
    }

    public static void transfert(CompteCourant compteA, CompteCourant compteB, int montant) {

        if (montant < 0) {

            if ((compteA.getMontant() + compteA.getDecouvertMaxAutorise()) >= montant) {



            }
        } else if (montant > 0) {



        } else {

            return;

        }

    }

    public void updateDecouvertMaxAutorise() {

        this.decouvertMaxAutorise = this.getMontant() / 2;

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

        this.updateDecouvertMaxAutorise();
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public float getDecouvertMaxAutorise() {
        return decouvertMaxAutorise;
    }

    public String resume() {

        return "Le compte numéro " + this.getNumero() + " (" + this.getIntitule() + ") à un solde de " + this.getMontant() + " et un découvert autorisé de " + this.getDecouvertMaxAutorise();

    }

    static void addAnAccount() {

        nbCompteOuvert ++;

    }

    static int getNbCompteOuvert() {

        return nbCompteOuvert;

    }

}
