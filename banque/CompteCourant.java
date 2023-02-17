package com.orsys.banque;

public final class CompteCourant extends Compte {

    private static int nbCompteOuvert = 0;

    private float decouvertMaxAutorise = 0;

    public CompteCourant(Client client) {

        // Super() numero, montant,

        super(0);

        System.out.println("Constructeur Compte courant");

        updateDecouvertMaxAutorise();

        addAnAccount();

        this.numero = getNbCompteOuvert();

        this.proprietaire = client;

    }

    public CompteCourant(Client client, float montant) {

        super(montant);

        this.montant = montant;

        updateDecouvertMaxAutorise();

        addAnAccount();

        this.numero = getNbCompteOuvert();

        this.proprietaire = client;
    }

    public CompteCourant(Client client, float montant, String intitule) {

        super(montant);

        this.montant = montant;
        this.intitule = intitule;

        updateDecouvertMaxAutorise();

        addAnAccount();

        this.numero = getNbCompteOuvert();

        this.proprietaire = client;
    }

    @Override
    public final void affichage() {

        System.out.println("Compte courant");

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

    void updateDecouvertMaxAutorise() {

        if (getMontant() <= 0) {

            this.decouvertMaxAutorise = 0;

        } else {

            this.decouvertMaxAutorise = this.getMontant() / 2;

        }

    }

    //======= Méthodes publiques ============


    @Override
    public void setMontant(float montant) {
        this.setMontant(montant);

        this.updateDecouvertMaxAutorise();
    }

    public float getDecouvertMaxAutorise() {
        return decouvertMaxAutorise;
    }

    @Override
    public String resume() {

        return "Le compte numéro " + this.getNumero() + " (" + this.getIntitule() + ") à un solde de " + this.getMontant() + " et un découvert autorisé de " + this.getDecouvertMaxAutorise() + ".\nIl s'agit d'un compte courant.";

    }

    static void addAnAccount() {

        nbCompteOuvert ++;

    }

    static int getNbCompteOuvert() {

        return nbCompteOuvert;

    }


}

