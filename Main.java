package com.orsys;

import com.orsys.banque.Client;
import com.orsys.banque.CompteCourant;

import java.util.Objects;

public class Main {


    public static void main(String[] args) {
/*
        Client client = new Client("Jean", "Baptiste");

        CompteCourant compte1 = new CompteCourant(client);

        CompteCourant compte2 = new CompteCourant(client, 2000, "Mon compte perso");

        CompteCourant compte3 = new CompteCourant(client, 4000);

        System.out.println(compte1.resume());

        System.out.println(compte2.resume());

        System.out.println(compte3.resume());

        compte1.setMontant(1500);

        System.out.println(compte1.resume());

        System.out.println(compte2.resume());

        //System.out.println(CompteCourant.getNbCompteOuvert());

        CompteCourant.transfert(compte1, compte2, 1000);

        System.out.println(compte1.resume());

        System.out.println(compte2.resume());

        CompteCourant.transfert(compte1, compte2, 600);

        System.out.println(compte1.resume());

        System.out.println(compte2.resume());

        System.out.println("====================================");

        compte1.setNumero(10);

        String test = "Valeur"; // a1

        Client clientTest = new Client(test, "Guillaume"); // client b1

        String nouvelleValeur = clientTest.getPrenom().replace("Valeur", "Autre chose"); // a1 => a3

        CompteCourant compteTest = new CompteCourant(clientTest); // b1 Compe() => CompteCourant()

        // Y

        // Construteur de X

        // Constrcteur de Compte => TypeDeRetour Nom(String c, String y)

        // Constrcuteur de CompteCourant

        // compteCourant.test()

        // CompteCourantPerso // CompteCourantPro

        compteTest.getProprietaire().setPrenom("Jacques"); // b1

        clientTest.setPrenom("Jacques");

        System.out.println(compteTest.getProprietaire().getPrenom()); // Jacques

*/
        Client clientTest = new Client("test", "Guillaume");

        System.out.println(clientTest);

    }
}
