package com.orsys;

import com.orsys.banque.Banque;
import com.orsys.banque.Client;
import com.orsys.banque.CompteCourant;
import com.orsys.banque.Gestionnaire;
import com.orsys.banque.exception.ClientInvalideException;
import com.orsys.banque.exception.MontantInitialInvalideException;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final ArrayList<Banque> banques = new ArrayList<>(); // Liste des banques

    public static void menuPrincipal() {

        while (true) {
            // Affichage du menu

            System.out.println("Menu principale de l'application :");

            System.out.println("[1] - Créer une nouvelle banque");
            System.out.println("[2] - Gérer une banque existante");
            System.out.println("[3] - Visualiser la liste des banques existantes");
            System.out.println("[4] - Quitter l'application");

            // lire le choix de l'utilisateur

            Scanner scanner = new Scanner(System.in);

            // Choisir une action en fonction du choix de l'utilisateur

            int choix = scanner.nextInt();

            switch (choix) {
                case 1 -> creationBanque();
                case 2 -> menuGestionBanque();
                case 3 -> afficherBanque();
                case 4 -> {
                    System.out.println("Au revoir");
                    System.exit(0);
                }
                default -> System.out.println("Choix invalide");
            }
        }
    }

    public static void creationBanque() {

        // Création d'une banque

        System.out.println("Création d'une nouvelle banque");

        // Demander le nom de la banque

        System.out.println("Veuillez saisir le nom de la banque :");

        Scanner scanner = new Scanner(System.in);

        String nomBanque = scanner.nextLine();

        // Demander l'adresse de la banque

        System.out.println("Veuillez saisir l'adresse de la banque :");

        String adresseBanque = scanner.nextLine();

        // Création de la banque

        Banque banque = new Banque(nomBanque, adresseBanque);

        // Ajouter la banque à la liste des banques

        banques.add(banque);

        // Afficher le message de confirmation

        System.out.println("La banque " + nomBanque + " a été créée avec succès !");


    }

    public static void menuGestionBanque() {

        // On verifie si il y a deja des banques créées

        if (banques.size() == 0) {
            System.out.println("Aucune banque n'a été créée");
            return;
        }

        // Afficher la liste des banques

        System.out.println("Liste des banques :");

        for (int i = 0; i < banques.size(); i++) {
            System.out.println("[" + (i + 1) + "] - " + banques.get(i).getNom());
        }

        // Demander à l'utilisateur de choisir une banque

        System.out.println("Veuillez choisir une banque :");

        Scanner scanner = new Scanner(System.in);

        int choix = scanner.nextInt();

        // On vérifie si le choix est valide

        if (choix < 1 || choix > banques.size()) {
            System.out.println("Choix invalide");
            return;
        }

        // On récupère la banque choisie

        Banque banque = banques.get(choix - 1);

        // Afficher le menu de gestion de la banque

        while (true) {
            System.out.println("Menu de gestion de la banque " + banque.getNom());
            System.out.println("[1] - Ajouter un client");
            System.out.println("[2] - Ajouter un compte");
            System.out.println("[3] - Afficher les clients");
            System.out.println("[4] - Afficher les comptes");
            System.out.println("[5] - Realiser une opération");
            System.out.println("[6] - Afficher le registre des opérations");
            System.out.println("[7] - Retour au menu principal");

            // Lire le choix de l'utilisateur

            choix = scanner.nextInt();

            // Choisir une action en fonction du choix de l'utilisateur

            switch (choix) {
                case 1 -> // On récupère les informations du client
                        addClientToBanque(scanner, banque);
                case 2 -> {

                    // On récupère les informations du compte

                    System.out.println("Veuillez saisir le nom du compte :");
                    String nomCompte = scanner.nextLine();
                    System.out.println("Veuillez saisir le solde du compte :");
                    float soldeCompte = scanner.nextFloat();

                    // On demande à l'utilisateur de choisir un client ou d'en créer un nouveau

                    System.out.println("[1] - Créer un nouveau client");
                    System.out.println("[2] - Choisir un client existant");
                    int choixClient = scanner.nextInt();
                    Client client;
                    if (choixClient == 1) {
                        // On récupère les informations du client

                        addClientToBanque(scanner, banque);

                        // On récupère le dernier client ajouté

                        client = banque.getClients()[banque.getClients().length - 1];


                    } else if (choixClient == 2) {
                        // On affiche la liste des clients

                        banque.affichageClients();

                        // On demande à l'utilisateur de choisir un client

                        System.out.println("Veuillez choisir un client :");

                        choixClient = scanner.nextInt();

                        if (choixClient < 1 || choixClient > banque.getClients().length) {
                            System.out.println("Choix invalide");
                            return;
                        }

                        // On récupère le client choisi

                        client = banque.getClients()[choixClient - 1];

                    } else {
                        System.out.println("Choix invalide");
                        return;
                    }

                    // On ajoute le compte au client

                    banque.ajouterCompte(client, nomCompte, soldeCompte);
                }
                case 3 -> banque.affichageClients();
                case 4 -> banque.affichageComptes();
                case 5 -> System.out.println("A faire");
                case 6 -> System.out.println("A faire");
                case 7 -> {
                    return;
                }
                default -> System.out.println("Choix invalide. Réessayer.");
            }
        }

    }

    private static void addClientToBanque(Scanner scanner, Banque banque) {
        System.out.println("Veuillez saisir le nom du client :");
        String nomNouveauClient = scanner.nextLine();

        System.out.println("Veuillez saisir le prénom du client :");
        String prenomNouveauClient = scanner.nextLine();

        banque.ajouterClient(nomNouveauClient, prenomNouveauClient);

        System.out.println("Le client " + nomNouveauClient + " " + prenomNouveauClient + " a été ajouté avec succès !");
    }

    private static void afficherBanque() {

        if (banques.size() == 0) {
            System.out.println("Aucune banque n'a été créée");
            return;
        }

        // Afficher la liste des banques

        System.out.println("Liste des banques :");

        for (int i = 0; i < banques.size(); i++) {
            System.out.println("[" + (i + 1) + "] - " + banques.get(i).getNom());
        }

    }

    public static void main(String[] args) {

        Gestionnaire gestionnaire = Gestionnaire.getInstance();

        gestionnaire.genereTestData();

        gestionnaire.MenuPrincipal();

        // On génère des données de test

        //genereTestData();

        // On affiche le menu principal

        //menuPrincipal();

        // Fin du programme

        //System.out.println("© 2023 - Gestionnaire d'agence bancaire - Tous droits réservés");
    }
}









