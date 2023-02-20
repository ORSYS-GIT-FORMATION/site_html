package banque;

public class Compte implements Comparable<Compte> {

    /* ******************************  ATTRIBUTS *************************************** */
    private int numero;
    private float solde = 0;
    private String intitule;
    private Client proprietaire;
    private static int nbCompteOuvert = 0;

    /* ******************************  CONSTRUCTEURS *********************************** */

    public Compte(Client client, float solde, String intitule) {
        this.proprietaire = client;
        this.intitule = intitule;
        this.solde = solde;
        this.numero = getNbCompteOuvert();
        addAnAccount();
    }

    // ******************************  GETTER SETTER *********************************** */
    public int getNumero() {
        return this.numero;
    }

    void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSolde() {
        return solde;
    }

    void setSolde(float solde) {
        this.solde = solde;
    }

    public String getIntitule() {
        return intitule;
    }

    void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Client getProprietaire() {
        return proprietaire;
    }

    void setProprietaire(Client proprietaire) {
        this.proprietaire = proprietaire;
    }

    /* *******************************   METHOD  ****************************************** */
    public String resume() {
        return this.getIntitule() + " n°" + this.getNumero() + " - " + this.getFullName() + "\n"
                + "Solde : " + this.getSolde() + "€\n";
    }

    // ****************************** METHOD STATIC ******************************************
    public static void addAnAccount() {
        nbCompteOuvert++;
    }

    public static int getNbCompteOuvert() {
        return nbCompteOuvert;
    }

    // ****************************** METHOD GET SET ******************************************
    public String getFullName() {
        return this.getProprietaire().getName() + " " + this.getProprietaire().getFirstName();
    }

    @Override
    public int compareTo(Compte compte) {
        if(compte.getSolde() < this.getSolde()){
            return 1;
        } else if(compte.getSolde() > this.getSolde()){
            return -1;
        } else return 0;
    }
}
