package com.orsys;

import java.util.Scanner;

public class Main {

    // package = minuscule com.orsys

    // Main : nom de classe en MAJ, MainPrincipal

    // maVariable : commence min et ensuite MAj pour chaque nouveaux mot

    public static void main(String[] args) {


        CompteCourant compte1 = new CompteCourant();

        CompteCourant compte2 = new CompteCourant(2000, "Mon compte perso");

        CompteCourant compte3 = new CompteCourant(4000);

        System.out.println(compte1.resume());

        System.out.println(compte2.resume());

        System.out.println(compte3.resume());

        compte1.setMontant(1500);

        System.out.println(compte1.resume());

        System.out.println(CompteCourant.getNbCompteOuvert());


        /*
        Vehicule maVoiture = new Vehicule("FR7575"); // maVoiture est une référence

        System.out.println(maVoiture.immatriculation);

        System.out.println(maVoiture.getImmatriculation());

        maVoiture.setImmatriculation("GH318");

        System.out.println(maVoiture.immatriculation);

        System.out.println(maVoiture.getImmatriculation());

        maVoiture.immatriculation = "TT6677";

        maVoiture.setImmatriculation("une autre immatriculation");

        System.out.println(maVoiture.immatriculation);

        System.out.println(maVoiture.getImmatriculation());
    */

        /*
        Scanner in = new Scanner(System.in);

        System.out.println("Entrer votre age :");

        System.out.println("1 - Compteur"); // For

        System.out.println("2 - Recherche dans une liste"); // For + IF (+ continue)

        System.out.println("3 - XXXXX"); //

        System.out.println("4 - XXXXX"); //

        System.out.println("5 - XXXXX"); //

        System.out.println("Menu (taper le numéro correspondant à votre choix): ");

        int choix_utilisateur; // déclaration de la variable => valable pour tous le main

        boolean out;

        do {

            out = true;

            choix_utilisateur = in.nextInt(); // 5

            if (choix_utilisateur <= 0 || choix_utilisateur > 10){
                out = false; // out = false

                if (choix_utilisateur == -1) {

                    break;

                }

                System.out.println("Erreur, veuillez choisir une valeur entre 1 et 10"); // affichae de l'erreur
            }

        } while (out == false); // on recommence

        System.out.println("Sortie de la boucle");

        // non fonctionnel apres

        System.out.println(choix_utilisateur); // ici choix_utilisateur a eu une affectation

        switch (choix_utilisateur){
            case (1):
                System.out.println("Compteur");

                // i ?

                for (int i = 0 ; i < 10; i++){

                    for (int y = 0 ; y < 10; y++) {

                        System.out.println(i);

                    }

                    System.out.println("Le compteur est actuellement a " + i);

                }

                break;
            case (2):
                System.out.println("Trouver");

                String recherche = "Jean";

                String[] liste = new String[]{"Luc", "Pierre", "Paul", "Jean"};

                for (String nom : liste){

                    System.out.println(nom);

                    // je souhaite n'aficher que Jean et pas les autres

                }

            default:
                System.out.println("Tous les autres cas...");
        }*/


    }
}
