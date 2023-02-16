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

    public static void transfert(CompteCourant compteA, CompteCourant compteB, float montant) {

        if (montant > 0) {

            if ((compteA.getMontant() + compteA.getDecouvertMaxAutorise()) >= montant) {

                compteA.setMontant(compteA.getMontant() - montant);

                compteB.setMontant(compteB.getMontant() + montant);

            } else {

                return;

            }

        } else if (montant < 0) {

            montant = montant * -1;

            if ((compteB.getMontant() + compteB.getDecouvertMaxAutorise()) >= montant) {

                compteB.setMontant(compteB.getMontant() - montant);

                compteA.setMontant(compteA.getMontant() + montant);

            } else {

                return;

            }

        } else {

            return;

        }

    }

    public void updateDecouvertMaxAutorise() {

        if (getMontant() <= 0) {

            this.decouvertMaxAutorise = 0;

        } else {

            this.decouvertMaxAutorise = this.getMontant() / 2;

        }

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
