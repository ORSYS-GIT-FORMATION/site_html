package com.orsys;

import com.orsys.banque.Client;
import com.orsys.banque.CompteCourant;

public class Main {

    public static void main(String[] args) {

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


    }
}
