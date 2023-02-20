package formation;

import banque.Banque;
import banque.Client;
import banque.Compte;
import banque.CompteCourant;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Banque> listBanks = new ArrayList<Banque>();
    static Integer TYPE_COMPTE_COURANT = 1;
    static Integer TYPE_COMPTE_EPARGNE = 2;

    static Integer CHOICE_COMPTE_CLIENT = 1;
    static Integer CHOICE_CLIENT_TO_CLIENT = 2;

    public static void main(String[] args) {
        genereTestData();
        menuPrincipal();
        // Fin du programme
        System.out.println("© 2023 - Gestionnaire d'agence bancaire - Tous droits réservés");

    }

    public static void menuPrincipal() {
        int choixUtilisateur;

        do {
            System.out.println("Menu principal:");
            System.out.println("1 - Création d'une banque");
            System.out.println("2 - Gérer une banque");
            System.out.println("3 - Voir mes banques");
            System.out.println("4 - Quitter");
            underline();
            choixUtilisateur = scanner.nextInt();

            switch (choixUtilisateur) {
                case (1) -> {
                    createBank();
                    choixUtilisateur = backToMenu();
                    underline();
                }
                case (2) -> {
                    gestionBank();
                    choixUtilisateur = backToMenu();
                    underline();
                }
                case (3) -> {
                    displayListBanks();
                    choixUtilisateur = backToMenu();
                    underline();
                }
                case (4) -> System.out.println("Sortie");
                default -> System.out.println("Choix incorrect");
            }
        } while (choixUtilisateur != 4);
    }

    private static void displayListBanks() {

        System.out.println("Voir mes banques");
        if (listBanks.isEmpty()) {
            System.out.println("Aucune banque n'a été créée.");
        }

        if (!listBanks.isEmpty()) {
            System.out.println("Liste des banques créées :");
            for (Banque bank : listBanks) {
                if (bank != null) {
                    System.out.println("- " + bank.getNom() + " (" + bank.getAdresse() + ")");
                }
            }
        }

    }

    private static int backToMenu() {
        System.out.println("Appuyez sur 'm' pour revenir au menu ou 'q' pour quitter.");
        String choice = Main.scanner.next();

        while (!Objects.equals(choice, "m") && !Objects.equals(choice, "q")) {
            System.out.println("Choix invalide, veuillez saisir 'm' ou 'q'");
            choice = Main.scanner.next();
        }

        if ("m".equals(choice)) {
            return 0;
        } else {
            return 4;
        }
    }

    private static void createBank() {
        System.out.println("vous allez créer une Banque");
        System.out.println("Nom de la banque :");
        scanner.nextLine(); // rajouté il passait directement au second, il consomme le caractère de nouvelle ligne restant
        String nomBanque = scanner.nextLine();
        System.out.println("adresse de la banque :");
        String adresseBanque = scanner.nextLine();

        Banque newBanque = new Banque(nomBanque, adresseBanque, LocalDateTime.now());

        listBanks.add(newBanque);

        System.out.println("La banque " + nomBanque + " a été créée.");

    }

    private static Banque choixBank() {
        if (listBanks.isEmpty()) {
            System.out.println("Aucune banque n'a été créée.");
            return null;
        }

        System.out.println("choisir sa banque :");

        int numerousBank = 1;
        for (Banque bank : listBanks) {
            if (bank != null) {
                System.out.println(numerousBank + " : " + bank.getNom());
                numerousBank++;
            }
        }

        System.out.print("Saisir le numéro de la banque à gérer : ");
        scanner.nextLine();
        int ChoiceBanque = scanner.nextInt();

        if (ChoiceBanque < 1 || ChoiceBanque > listBanks.size()) {
            System.out.println("Choix invalide");
            return null;
        }

        return listBanks.get(ChoiceBanque - 1);
    }

    private static void gestionBank() {
        System.out.println("Gérer une banque");

        Banque ChoiceBanque = choixBank();

        if (ChoiceBanque == null) {
            return;
        }
        System.out.println("Vous avez choisi la banque : " + ChoiceBanque.getNom());

        boolean quit = false;

        while (!quit) {
            System.out.println("taper un numéro correspondant à votre choix");
            System.out.println("1. Ajouter un compte");
            System.out.println("2. Faire un transfert");
            System.out.println("3. Voir le registre");
            System.out.println("4. Voir les comptes");
            System.out.println("5. Recherche d'un compte");
            System.out.println("6. Recherche d'un client");
            System.out.println("7. Exit");
            int choice = scanner.nextInt();

            scanner.nextLine(); // Consomme le caractère de nouvelle ligne restant
            switch (choice) {
                case 1 -> addAccount(ChoiceBanque);
                case 2 -> transferMoney(ChoiceBanque);
                case 3 -> seeRegistre(ChoiceBanque);
                case 4 -> showAccounts(ChoiceBanque);
                case 5 -> searchAccount(ChoiceBanque);
                case 6 -> searchClient(ChoiceBanque);
                case 7 -> quit = true;
                default -> System.out.println("Choix invalide");
            }
        }

    }

    private static void seeRegistre(Banque choiceBanque) {
        underline();
        System.out.println("Registre des opérations de la banque " + choiceBanque.getNom() + " :");
        if (choiceBanque.resume()) {
            System.out.println(choiceBanque.resume());
        }

        scanner.nextLine();
        underline();
    }

    private static void searchClient(Banque choiceBanque) {
        System.out.println("Entrez le nom du client à rechercher :");
        String nomClient = scanner.nextLine();

        ArrayList<Client> clients = choiceBanque.getClientsByName(nomClient);

        if (clients.isEmpty()) {
            System.out.println("Aucun client trouvé pour le nom : " + nomClient);
            return;
        }
        underline();
        System.out.println("Clients trouvés :");
        System.out.println("Listes des clients : ");

        for (Client client : clients) {
            if (client != null) {
                ArrayList<Compte> comptesClient = choiceBanque.getCompteByClient(client);
            /*
            * for (Iterator<Compte> iterator = comptesClient.iterator(); iterator.hasNext(); ) {
                    Compte compteClient = iterator.next();
                    System.out.println(compteClient.resume());
                    line();
                }
            */
                for (Compte compteClient : comptesClient) {
                    System.out.println(compteClient.resume());
                    line();
                }
            }
        }
    }

    private static void searchAccount(Banque choiceBanque) {
        underline();
        System.out.println("entre le numero d'un compte");
        int numCompte = scanner.nextInt();

        for (Compte compte : choiceBanque.getComptes()) {
            if (compte != null) {
                if (numCompte == compte.getNumero()) {
                    System.out.println(compte.resume());
                    line();

                    return;
                } else {
                    System.out.println("Aucun compte à ce numero");
                    scanner.nextLine(); // rajouté il passait directement au second Consomme le caractère de nouvelle ligne restant
                }
            }
        }

        underline();
    }

    private static void showAccounts(Banque choiceBanque) {
        underline();
        System.out.println("Liste des comptes de la banque " + choiceBanque.getNom() + " :");

        ArrayList<Compte> allCompteOfBank = choiceBanque.getComptes();

        for (Compte compte : allCompteOfBank) {
            if (compte != null) {
                System.out.println(compte.resume());
                line();
            }
        }
        scanner.nextLine();
        underline();
    }

    private static void addAccount(Banque banque) {

        // demander à l'utilisateur de saisir les informations necessary (nom, montant)
        System.out.println("Saisir le nom du client : ");
        String nameClient = scanner.nextLine();

        System.out.println("Saisir le prénom du client : ");
        String firstNameClient = scanner.nextLine();

        System.out.println("Saisir le montant initial du compte : ");
        int montant = scanner.nextInt();

        System.out.println("Voulez vous quels type de compte");
        System.out.println("1 - Courant");
        System.out.println("2 - Epargne");
        int typeCompte = scanner.nextInt();

        // Proposer de créer un nouveau client ou de choisir un client existant
        System.out.println("Voulez-vous créer un nouveau client ou choisir un client existant ?");
        System.out.println("1 : Créer un nouveau client");
        System.out.println("2 : Choisir un client existant");
        int choice = scanner.nextInt();

        // Créer un nouveau client ou choisir un client existant
        Client clientChoice = null;

        if (choice == 1) {
            clientChoice = new Client(nameClient, firstNameClient, LocalDateTime.now());
            banque.addClient(clientChoice);

        } else if (choice == 2) {
            System.out.println("Choisir un client : ");
            banque.displayClients();
            ArrayList<Client> clients = banque.getClients();

            int index = scanner.nextInt();
            clientChoice = clients.get(index);
        } else {
            System.out.println("Choix invalide");
        }

        // Créer le compte
        assert clientChoice != null;
        System.out.println("client : " + clientChoice.getFirstName());
        if (typeCompte == TYPE_COMPTE_COURANT) {
            banque.addNewCompteCourant(clientChoice, montant, "Compte courant");
        } else if (typeCompte == TYPE_COMPTE_EPARGNE) {
            banque.addNewCompteEpargne(clientChoice, montant, "Compte épargne");
        }
        System.out.println("Compte créé avec succès !");
    }

    private static void transferMoney(Banque choiceBanque) {
        ArrayList<Client> clients = choiceBanque.getClients();
        Client clientChoice;

        /// seulement les comptes courant.
        System.out.println("Que souhaitez vous faire? ");
        System.out.println("-1 Transférer les comptes d'un client ?");
        System.out.println("-2 Transférer d'un client à un autre ?");

        int choiceTypeTransfert = scanner.nextInt();
        if (choiceTypeTransfert == CHOICE_COMPTE_CLIENT) {

            System.out.println("Choisir le n° du Client à plumer ");
            //récuperer les comptes du client donc afficher la liste des clients
            choiceBanque.displayClients();
            // on choisit
            int index = scanner.nextInt();
            // Créer un nouveau client ou choisir un client existant

            System.out.println("Choisir un client : ");
            clientChoice = clients.get(index);

            assert clientChoice != null;
            System.out.println("client : " + clientChoice.getName());
            ArrayList<Compte> allCompteClient = choiceBanque.getCompteByClient(clientChoice);

            for (Compte compteClient : allCompteClient) {
                if (compteClient != null) {
                    System.out.println(compteClient.resume());
                    line();
                }
            }

            displayChoiceBank(choiceBanque);

        } else if (choiceTypeTransfert == CHOICE_CLIENT_TO_CLIENT) {
            //on affiche tous les comptes courant
            ArrayList<CompteCourant> allComptesCourant = choiceBanque.getComptesCourant();
            //
            for (Compte compteCourant : allComptesCourant) {
                if (compteCourant != null) {
                    System.out.println(compteCourant.resume());
                    line();
                }
            }

            displayChoiceBank(choiceBanque);
        }

    }


    private static void displayChoiceBank(Banque choiceBanque) {
        line();
        System.out.println("Entrez le numéro de compte à débiter :");
        int indexCompteDebiteur = scanner.nextInt();
        Compte compteDebiteur = choiceBanque.getCompteByNumero(indexCompteDebiteur);
        assert compteDebiteur != null;
        System.out.println("Vous avez choisit le compte de :" + compteDebiteur.getFullName());

        System.out.println("Entrez le numéro de compte à créditer :");
        int indexCompteCrediteur = scanner.nextInt();
        Compte compteCrediteur = choiceBanque.getCompteByNumero(indexCompteCrediteur);
        assert compteCrediteur != null;
        System.out.println("Vous avez choisit le compte de :" + compteCrediteur.getFullName());

        System.out.println("Entrez le montant à transférer :");
        float montant = scanner.nextInt();

        System.out.println(choiceBanque.transfert(compteDebiteur, compteCrediteur, montant));
        line();
    }

    private static void underline() {
        System.out.println("******************************************************************");
    }

    private static void line() {
        System.out.println("------------------------------------------------------------------");
    }

    private static void genereTestData() {

        // On génère des données de test : 1 Banque, 3 clients, 3 comptes

        Banque newBanque = new Banque("Banque de test", "BdT", LocalDateTime.now());

        newBanque.addClient(new Client("Doe", "John", LocalDateTime.now()));

        newBanque.addClient(new Client("Doe", "jane", LocalDateTime.now()));

        newBanque.addClient(new Client("Doe", "jack", LocalDateTime.now()));

        newBanque.addNewCompteCourant(newBanque.getClients().get(0), 5000, "Compte courant");

        newBanque.addNewCompteCourant(newBanque.getClients().get(1), 1000, "Livret A");

        newBanque.addNewCompteCourant(newBanque.getClients().get(2), 3000, "PEL");

        listBanks.add(newBanque);

        // On reproduit l'operation pour une deuxieme banque

        Banque newBanque2 = new Banque("Banque de test 2", "BdT2", LocalDateTime.now());

        newBanque2.addClient(new Client("Kane", "Harry", LocalDateTime.now()));

        newBanque2.addClient(new Client("Lennon", "John", LocalDateTime.now()));

        newBanque2.addClient(new Client("McCartney", "Paul", LocalDateTime.now()));

        newBanque2.addNewCompteCourant(newBanque2.getClients().get(0), 1000, "Compte courant");

        newBanque2.addNewCompteCourant(newBanque2.getClients().get(1), 2000, "Livret A");

        newBanque2.addNewCompteCourant(newBanque2.getClients().get(2), 3000, "PEL");

        listBanks.add(newBanque2);
    }


}