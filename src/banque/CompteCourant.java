package banque;

public final class CompteCourant extends Compte {

    /*  ***********  ENUM ************ */
    private TypeCarte type;

    /* ******************************  ATTRIBUTS *************************************** */
    private final static int multiplicateurDecouvertes = 2;
    private float decouvertMax = 0;

    // ******************************  CONSTRUCTEURS ******************************************
    public CompteCourant(Client client, float solde, String Intitule) {
        super(client, solde, Intitule);
        this.updateDecouvertMax();

    }

    // ******************************  METHODS ******************************************
    private void updateDecouvertMax() {
        if (this.getSolde() <= 0) {
            this.decouvertMax = 0;
        } else {
            this.decouvertMax = this.getSolde() / multiplicateurDecouvertes;
        }
        this.setDecouvertMax(this.decouvertMax);
    }

    @Override
    public String resume() {
        return this.getIntitule() + " n°" + this.getNumero() + " - " + this.getFullName() + "\n"
                + "Solde : " + this.getSolde() + "€\n"
                + "Découvert autorisé maximum : " + this.getDecouvertMax() + "€";
    }

    // ******************************  GETTER SETTER ******************************************
    public double getDecouvertMax() {
        return decouvertMax;
    }

    void setDecouvertMax(float decouvertMax) {
        this.decouvertMax = decouvertMax;
    }

    @Override
    void setSolde(float solde) {
        super.setSolde(solde);
        this.updateDecouvertMax();

    }


}