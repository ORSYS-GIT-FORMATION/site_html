package com.orsys.banque;

import com.orsys.banque.exception.ClientInvalideException;
import com.orsys.banque.exception.MontantInitialInvalideException;

import java.util.ArrayList;
import java.util.List;

final public class Gestionnaire {

    List<Banque> banques = new ArrayList<Banque>();

    private static Gestionnaire gestionnaire;

    private Gestionnaire() {

    }

    public static Gestionnaire getInstance() {

        if (gestionnaire == null) {
            gestionnaire = new Gestionnaire();
        }

        return gestionnaire;
    }

    public void genereTestData() {

        // On génère des données de test : 1 Banque, 3 clients, 3 comptes

        Banque banque = new Banque("Banque de test", "BdT");

        banque.ajouterClient("Doe", "John");

        banque.ajouterClient("Doe", "Jane");

        banque.ajouterClient("Doe", "Jack");

        banque.ajouterCompte(banque.getClients()[0], "Compte courant", 1000);

        banque.ajouterCompte(banque.getClients()[1], "Livret A", 2000);

        banque.ajouterCompte(banque.getClients()[2], "PEL", 3000);

        banques.add(banque);

        // On reproduit l'opération pour une deuxième banque

        Banque banque2 = new Banque("Banque de test 2", "BdT2");

        banque2.ajouterClient("Kane", "Harry");

        banque2.ajouterClient("Lennon", "John");

        banque2.ajouterClient("McCartney", "Paul");

        banque2.ajouterCompte(banque2.getClients()[0], "Compte courant", 1000);

        banque2.ajouterCompte(banque2.getClients()[1], "Livret A", 2000);

        banque2.ajouterCompte(banque2.getClients()[2], "PEL", 3000);

        banques.add(banque2);

        // arrive à une étape ou on va utiliser du code qui peut générer des exceptions

        try {
            // Il peut y avoir une exception si le montant est négatif ou si le client est vidde
            CompteCourant compteCourant = new CompteCourant(new Client("Test", "Test"), 1000, "Mon compte");
        } catch (MontantInitialInvalideException e) {
            // Si jamais une exception est levée, on peut agir
            System.out.println("Une erreur est survenue : Veuillez tester à nouveau");
        } catch (ClientInvalideException e) {
            // Si jamais une exception est levée, on peut agir
            System.out.println("Une erreur est survenue : Veuillez tester à nouveau");
        } catch (Exception e) {
            // Si jamais une exception est levée, on peut agir
            System.out.println("Une erreur est survenue : Veuillez tester à nouveau");
        } finally {
            // On peut faire quelque chose dans tous les cas
            System.out.println("Fin du test");
        }
    }

    public void MenuPrincipal() {

        System.out.println("Mon menu principale");

    }
}
