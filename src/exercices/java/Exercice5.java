package exercices.java;

import java.util.Scanner;

public class Exercice5 {

   /*
   * Écrivez un programme Java pour afficher l’aire et le périmètre d’un cercle.
   * Exemple:Rayon = 4,2
   * Sortie prévue: Le périmètre est = 26.389378290154262L’aire est = 55.41769440932395
   * Air = π × R2
   * Perimetre = Diamètre d'un cercle x Pi (π)
    */

    public static  double calculeAire(double rayon){
        return Math.PI * ( Math.pow(rayon, 2) );
    }

    public static  double calculePerimetre(double rayon){
        return Math.PI * ( rayon * 2 );
    }
    public static String setAirePerimetre(double rayon){

        return "Le périmètre est = " + calculeAire(rayon) + " L’aire est = " + calculePerimetre(rayon) ;
    }

    public static void main(String[] args) {

        double nb1;
        System.out.print("Entrez deux nombres: ");
        Scanner sc = new Scanner(System.in);

        nb1 = sc.nextInt();

        System.out.println(setAirePerimetre(nb1));
    }
}
