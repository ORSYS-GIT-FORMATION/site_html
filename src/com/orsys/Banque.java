package com.orsys;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class Banque {

    String nom;
    String adresse;
    LocalDateTime creationDate;
    Client[] clients;
    CompteCourant[] comptes;
    static int nbClient = 0;

    // ******************************  CONSTRUCTEURS ******************************************
    public Banque(String nom, String adresse, LocalDateTime localDate) {

        this.nom = nom;
        this.adresse = adresse;
        this.creationDate = localDate;
        this.clients = new Client[100];
        this.comptes = new CompteCourant[100];
    }

    /*  ****************  METHODS STATIQUE ************************ */

    public void addClient(String name, String firstName, LocalDateTime dateLocal){

        this.clients[nbClient] =  new Client(name,firstName, dateLocal);
        this.comptes[nbClient] = new CompteCourant(name,firstName);
        this.addNbClient();

    }

    public String displayListClients(){
        String listClients = "Listes des clients : ";

        for(Client client: this.clients){
            if(client != null){
                listClients += client.getNom() + " " + client.getPrenom() + " / ";
            }
        }
        return listClients;
    }

    /*  ****************  GETTER SETTER ************************ */

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    public CompteCourant[] getComptes() {
        return comptes;
    }

    public void setComptes(CompteCourant[] comptes) {
        this.comptes = comptes;
    }

    // ****************************** METHOD STATIC ******************************************
    public static int addNbClient() {

        return nbClient++;
    }
}
