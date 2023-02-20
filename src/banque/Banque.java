package banque;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;


public final class Banque {

    private final Registre registre;
    private String nom;
    private String adresse;
    private LocalDateTime creationDate;
    private ArrayList<Client> clients; // private Client[] clients;
    private ArrayList<Compte> comptes;//private Compte[] comptes;

    // ******************************  CONSTRUCTEURS ******************************************
    public Banque(String nom, String adresse, LocalDateTime localDate) {

        this.nom = nom;
        this.adresse = adresse;
        this.creationDate = localDate;
        this.clients = new ArrayList<Client>(); //this.clients = new Client[1000];
        this.comptes = new ArrayList<Compte>();   //this.comptes = new Compte[1000];
        this.registre = new Registre();
    }

    /*  ****************  METHODS ************************ */

    public void addClient(Client client) {

       /* for (int i = 0; i < 1000; i++) {
            if (this.clients[i] == null) {
                this.clients[i] = client;
                return;
            }
        }*/

        this.clients.add(client);
    }
    /* -----------------   add new compte courant ----------------------- */

    public void addNewCompteCourant(Client client, float solde, String intitule) {
        // CompteCourant nouveauCompte = new CompteCourant(client, solde, intitule);
        /*for (int i = 0; i < 1000; i++) {
            if (this.comptes[i] == null) {
                this.comptes[i] = nouveauCompte;
                return;
            }
        }*/
        this.comptes.add(new CompteCourant(client, solde, intitule));
        Collections.sort(this.comptes);
    }

    /* -----------------   add new compte Epargne ----------------------- */
    public void addNewCompteEpargne(Client client, float solde, String intitule) {
        //CompteEpargne nouveauCompte = new CompteEpargne(client, solde, intitule);
        /*for (int i = 0; i < 1000; i++) {
            if (this.comptes[i] == null) {
                this.comptes[i] = nouveauCompte;
                return;
            }
        }*/
        this.comptes.add(new CompteEpargne(client, solde, intitule));
        Collections.sort(this.comptes);
    }

    /* -----------------     FIND COMPTE          ----------------------- */
    public ArrayList<Client> getClientsByName(String nomClient) {
        /*int count = ;

        for (Client client : clients) {
            if (client != null && client.getName().equals(nomClient)) {
                count++;
            }
        }

        Client[] clientsByName = new Client[count];
        int j = 0;
        for (Client client : clients) {
            if (client != null && client.getName().equals(nomClient)) {
                clientsByName[j] = client;
                j++;
            }
        }*/
        ArrayList<Client> clientsByName = new ArrayList<Client>();
        for (Client client : clients) {
            if (client.getName().equalsIgnoreCase(nomClient)) {
                clientsByName.add(client);
            }
        }
        return clientsByName;
    }

    public ArrayList<Compte> getCompteByClient(Client client) {
        /*Compte[] comptesClient = new Compte[1000];
        int count = 0;
        for (Compte compte : this.comptes) {
            if (compte != null) {
                if (compte.getProprietaire() == client) {
                    comptesClient[count] = compte;
                    count++;
                }
            }

        }*/
        ArrayList<Compte> comptesClient = new ArrayList<Compte>();
        for (Compte compte : this.comptes) {
            if (compte.getProprietaire().equals(client)) {
                comptesClient.add(compte);
            }
        }

        return comptesClient;
    }

    public Compte getCompteByNumero(int numero) {
        for (Compte compte : this.comptes) {
            if (compte.getNumero() == numero) {
                return compte;
            }
        }
        return null;
    }

    /* -----------------  LISTE COMPTE COURANT   ----------------------- */
    public ArrayList<CompteCourant> getComptesCourant() {
        /*
        CompteCourant[] comptesCourant = new CompteCourant[1000];
        int index = 0;
        for (Compte compte : comptes) {
            if (compte instanceof CompteCourant) {
                comptesCourant[index] = (CompteCourant) compte; //opération de "casting"
                index++;
            }
        }
        */
        ArrayList<CompteCourant> comptesCourant = new ArrayList<CompteCourant>();
        for (Compte compte : this.comptes) {
            if (compte instanceof CompteCourant) {
                comptesCourant.add((CompteCourant) compte); ///opération de "Casting"
            }
        }
        return comptesCourant;
    }

    /* -----------------  LISTE COMPTE COURANT   ----------------------- */
    public ArrayList<CompteEpargne> getCompteEpargne() {
        /*CompteEpargne[] comptesEpargne = new CompteEpargne[1000];
        int index = 0;
        for (Compte compte : comptes) {
            if (compte instanceof CompteEpargne) {
                comptesEpargne[index] = (CompteEpargne) compte; //opération de "casting"
                index++;
            }
        }*/

        ArrayList<CompteEpargne> comptesEpargne = new ArrayList<CompteEpargne>();
        for (Compte compte : this.comptes) {
            if (compte instanceof CompteEpargne) {
                comptesEpargne.add((CompteEpargne) compte); ///opération de "Casting"
            }
        }

        return comptesEpargne;
    }
    /* -----------------  LISTE Clients  ----------------------- */

    public void displayClients() {
        int numberClient = 0;
        for (Client client : this.clients) {
            if (client != null) {
                System.out.println(numberClient + " : " + client.getName() + " " + client.getFirstName());
                numberClient++;
            }
        }
    }

    /* -----------------   TRANSFER COMPTE CLIENT ----------------------- */
    public String transfert(Compte compteDebiteur, Compte compteCrediteur, float montantTransfert) {
        double valeurGetDecouverMaxCompteDebiteur = 0.0;
        double valeurGetDecouverMaxCompteCrediteur = 0.0;

        float soldeCompteDebiteur = compteDebiteur.getSolde();
        float soldeCompteCrediteur = compteCrediteur.getSolde();

        /* --------------------  DEBITEUR  ------------------------------ */
        //si le compteDebiteur est un compte Courant
        if (compteDebiteur instanceof CompteCourant compteDebiteurCourant) {
            valeurGetDecouverMaxCompteDebiteur = compteDebiteurCourant.getDecouvertMax();
        }
        /* --------------------  CREDITEUR  ------------------------------ */
        //si le compteCrediteur est un compte Courant
        if (compteCrediteur instanceof CompteCourant compteCrediteurCourant) {
            valeurGetDecouverMaxCompteCrediteur = compteCrediteurCourant.getDecouvertMax();
        }
        if (montantTransfert >= 0) {

            if ((soldeCompteDebiteur + valeurGetDecouverMaxCompteDebiteur) >= montantTransfert) {

                compteDebiteur.setSolde(soldeCompteDebiteur - montantTransfert);
                compteCrediteur.setSolde(soldeCompteCrediteur + montantTransfert);

                this.registre.addOperation(new Operation(compteDebiteur.getNumero(), compteCrediteur.getNumero(), montantTransfert));
                Collections.sort(this.comptes);


                return "Credit de : " + montantTransfert + " € au compte " + compteCrediteur.getFullName();

            } else {
                return "Impossible de Créditer : " + montantTransfert;
            }

        } else if (montantTransfert < 0) {

            montantTransfert *= -1;

            if ((soldeCompteCrediteur + valeurGetDecouverMaxCompteCrediteur) >= montantTransfert) {

                compteCrediteur.setSolde(soldeCompteDebiteur - montantTransfert);
                compteDebiteur.setSolde(soldeCompteCrediteur + montantTransfert);

                this.registre.addOperation(new Operation(compteDebiteur.getNumero(), compteCrediteur.getNumero(), montantTransfert));
                Collections.sort(this.comptes);
                return " Débit de : " + montantTransfert + " € au compte" + compteCrediteur.getFullName();
            } else {
                return "Impossible de débit de : " + montantTransfert;
            }
        }

        return null;
    }

    public boolean resume() {
        boolean retour = true;
        for (Operation operation : this.registre.getOperations()) {
            if (operation != null) {
                System.out.println(" id : " + operation.getOperationId() + " " +
                        " n° compte Debit : " + operation.getNumeroCompteDebit() + " " +
                        " n° compte Credit : " + operation.getNumeroCompteCredit() + " " +
                        " montant : " + operation.getMontant() + " €  " +
                        " date : " + operation.getTimeOperation());
            } else {
                retour = false;
            }
        }
        return retour;
    }

    /* -----------------     TO STRING()     ----------------------- */


    /*  ****************  GETTER SETTER ************************ */
    public String getNom() {
        return nom;
    }

    void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Compte> getComptes() {
        return comptes;
    }

    void setComptes(ArrayList<Compte> comptes) {
        this.comptes = comptes;
    }

    public Registre getRegistre() {
        return registre;
    }
}
