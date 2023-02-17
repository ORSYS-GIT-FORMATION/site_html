package com.orsys.banque;

public final class CompteCourant extends Compte {

    private static int nbCompteOuvert = 0;

    // public : tous le monde y a accès

    // protected : tous le package y a accès

    // private : cette classe y a accès

    private float decouvertMaxAutorise = 0; // cet element est propre a CompteCourant

    private final Client proprietaire;

    //private final Date x = 0;

    // x.setMonth(JUNE)  // OK

    // x = Date.now() // Pas OK

    // proprietaire = nouveauClient; // interdis

    // proprietaire.replace(); // Autoriser

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

    public Client getProprietaire() {
        return proprietaire;
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
