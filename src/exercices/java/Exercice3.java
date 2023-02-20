package exercices.java;

import java.util.Scanner;

public class Exercice3 {

    /*
     * Écrivez un programme Java qui prend deux nombres en entrée et affichez le produit de deux nombres.
     * Exemple : Entrer le premier nombre : 2 Entrer le deuxième nombre : 3
     * Sortie prévue : 2 x 3 = 6
     * */

    public static int calculMultiple(int nb1, int nb2) {

        return nb1 * nb2;
    }

    public static void main(String[] args) {
        int nb1;
        int nb2;
        System.out.print("Entrez deux nombres: ");
        Scanner sc = new Scanner(System.in);

        nb1 = sc.nextInt();
        nb2 = sc.nextInt();

        System.out.println(calculMultiple(nb1, nb2));
    }
}
