package banque;

public class CompteEpargne extends Compte {

    /*  ***********  ENUM ************ */
    protected TypeEpargne typeEpargne;

    /* ******************************  ATTRIBUTS *************************************** */


    // ******************************  CONSTRUCTEURS ******************************************
    public CompteEpargne(Client client, float solde, String Intitule) {
        super(client, solde, Intitule);
        this.typeEpargne = typeEpargne;
    }

    // ******************************  METHODS ******************************************
    @Override
    public String resume() {
        return this.getIntitule() + " n°" + this.getNumero() + " - " + this.getFullName() + "\n"
                + "Solde : " + this.getSolde() + "€\n";
    }
    /* ******************************  GETTERS SETTERS *************************************** */
    public TypeEpargne getTypeEpargne() {
        return typeEpargne;
    }

    void setTypeEpargne(TypeEpargne typeEpargne) {
        this.typeEpargne = typeEpargne;
    }
}
