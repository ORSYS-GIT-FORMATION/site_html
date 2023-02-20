package exercices.java;

import java.util.Scanner;

public class Exercice7 {

    /*
    * Écrivez un programme Java pour permuter deux variables.
    * Exemple : 1b = 2
    * Sortie prévue : Avant l’échange: a = 1, b = 2 / Après l’échange: a = 2, b = 1
    *
    * */

    public static void main(String[] args) {

        int a;
        int b;
        int tempo;
        System.out.print("Entrez deux nombres: ");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Avant la permutation: a = "+a+" et b = "+b);

        tempo = a;
        a = b;
        b = tempo;

        System.out.println("Aprés la permutation: a = "+a+" et b = "+b);
    }



}
