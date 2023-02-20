package exercices.java;

import java.util.Scanner;

public class Exercice1 {

    /*
    Écrivez un programme Java pour afficher la somme de deux nombres.
    Exemple: 2 + 3
    Sortie prévue: 5
    */

    public static int calcul(int nb1, int nb2){

        return nb1 + nb2;
    }
    public static void main(String[] args) {
        int nb1;
        int nb2;
        System.out.print("Entrez deux nombres: ");
        Scanner sc = new Scanner(System.in);

        nb1 = sc.nextInt();
        nb2 = sc.nextInt();

        System.out.println("Le resultat est : " + calcul(nb1, nb2));
    }

}
