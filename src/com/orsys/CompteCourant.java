package com.orsys;

public class CompteCourant {

    /*  ***********  ENUM ************ */
    public TypeCarte type;

    // ******************************  ATTRIBUTS ******************************************
    static int nbCompteOuvert = 0;
    static int multiplicateurDecouvertes = 2;

    int numero;
    float solde = 0;
    String intitule = "Compte courant";
    float decouvertMax = 0;


    String client;

    // ******************************  CONSTRUCTEURS ******************************************
    public CompteCourant(String nom, String prenom) {

        this.calculeDecouverteMontantAutorise();
        addAnAccount();
        this.numero = getNbCompteOuvert();
        this.setClient(nom + " " + prenom);
    }

    public CompteCourant(String nom, String prenom, float solde ) {

        this.solde = solde;
        this.calculeDecouverteMontantAutorise();
        addAnAccount();
        this.numero = getNbCompteOuvert();
        this.setClient(nom + " " + prenom);
    }

    public CompteCourant(String nom, String prenom, float solde, String intitule ) {

        this.solde = solde;
        this.intitule= intitule ;
        this.calculeDecouverteMontantAutorise();
        addAnAccount();
        this.numero = getNbCompteOuvert();
        this.setClient(nom + " " + prenom);
    }

    // ******************************  METHODS ******************************************
    private void calculeDecouverteMontantAutorise() {
        this.decouvertMax =  this.getSolde() / multiplicateurDecouvertes;
    }

    private void updateDecouvertMax(){
        if(this.getSolde() <= 0){
            this.decouvertMax = 0;
        }else {
            this.decouvertMax = this.getSolde() / 2;
        }
        this.setDecouvertMax(this.solde);
    }

    public String resume() {
        return "numero :" + this.getNumero() + "; intitule :" + this.getIntitule()+ "; solde :" + this.getSolde()+ "; decouvertMax :" + this.getDecouvertMax();
    }

    public String getNumberCompteOuvert(){
        return "Nombre de Compte ouvert : " + getNbCompteOuvert();
    }

    public static String transfert(CompteCourant CompteCourantA, CompteCourant CompteCourantB, float montantTransfert){

        if(montantTransfert >= 0){

            if((CompteCourantA.getSolde() + CompteCourantA.getDecouvertMax())  >= montantTransfert){
                CompteCourantA.setSolde(CompteCourantA.getSolde() - montantTransfert);
                CompteCourantB.setSolde(CompteCourantB.getSolde() + montantTransfert);
                return "Credit de : " + montantTransfert ;
            } else {
                return "Impossible de Créditer : " + montantTransfert ;
            }


        } else if(montantTransfert < 0) {

            montantTransfert *= -1;

            if((CompteCourantB.getSolde() + CompteCourantB.getDecouvertMax())  >= montantTransfert){

                CompteCourantB.setSolde(CompteCourantB.getSolde() - montantTransfert);
                CompteCourantA.setSolde(CompteCourantA.getSolde() + montantTransfert);

                return " Débit de : " + CompteCourantA  ;
            } else {
                return "Impossible de débit de : " + CompteCourantA  ;
            }

        }
        return null;
    }


    // ******************************  GETTER SETTER ******************************************
    public int getNumero() {
        return this.numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {

        this.solde = solde;
        updateDecouvertMax();
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public double getDecouvertMax() {
        return decouvertMax;
    }

    public void setDecouvertMax(float decouvertMax) {
        this.decouvertMax = decouvertMax;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }


    // ****************************** METHOD STATIC ******************************************
    public static int addAnAccount() {
        return nbCompteOuvert++;
    }

    public static int getNbCompteOuvert() {
        return nbCompteOuvert;
    }

    public static void setNbCompteOuvert(int nbCompteOuvert) {
        CompteCourant.nbCompteOuvert = nbCompteOuvert;
    }


}