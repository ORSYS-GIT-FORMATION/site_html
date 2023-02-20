package exercices.java;

import java.util.Scanner;

public class Exercice2 {

    /*
    Écrivez un programme Java pour diviser deux nombres et affichez le résultat sur l’écran.
    Exemple: 4 / 2
    Sortie prévue: 2
    */

    public static int calculDivided(int nb1, int nb2){

        return nb1 / nb2;
    }
    public static void main(String[] args) {

        int nb1;
        int nb2;
        System.out.print("Entrez deux nombres: ");
        Scanner sc = new Scanner(System.in);

        nb1 = sc.nextInt();
        nb2 = sc.nextInt();

        System.out.println(calculDivided(nb1,nb2));
    }
}
