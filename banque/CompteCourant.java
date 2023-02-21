package com.orsys.banque;

import com.orsys.banque.exception.ClientInvalideException;
import com.orsys.banque.exception.MontantInitialInvalideException;

public final class CompteCourant extends Compte {

    private static int nbCompteOuvert = 0;

    private float decouvertMaxAutorise = 0;

    public CompteCourant(Client client, float montant, String intitule) throws ClientInvalideException, MontantInitialInvalideException {

        super(client, montant, intitule);

        updateDecouvertMaxAutorise();

    }

    void updateDecouvertMaxAutorise() {

        if (getMontant() <= 0) {

            this.decouvertMaxAutorise = 0;

        } else {

            this.decouvertMaxAutorise = this.getMontant() / 2;

        }

    }

    //======= Méthodes publique ============

    @Override
    public final void affichage() {

        System.out.println("Compte courant");

    }

    @Override
    public void setMontant(float montant) {
        super.setMontant(montant);

        this.updateDecouvertMaxAutorise();
    }

    public float getDecouvertMaxAutorise() {
        return decouvertMaxAutorise;
    }

    @Override
    public String resume() {

        return "Le compte numéro " + this.getNumero() + " (" + this.getIntitule() + ") à un solde de " + this.getMontant() + " et un découvert autorisé de " + this.getDecouvertMaxAutorise() + ".\nIl s'agit d'un compte courant.";

    }


}

