package exercices.java;

import java.util.Scanner;

public class Exercice6 {

    /*
    * Écrivez un programme Java qui prend trois nombres en entrée pour calculer et afficher la moyenne des nombres.
    * Exemple : Entrer le premier nombre : 4 Entrer le deuxième nombre : 2 Entrer le troisième nombre : 6
    * Sortie prévue : La moyenne est 4
    *
    * */

    public static double calculMoyenneNumber(Integer[] numbers) {

       Integer sommeNumbers = 0;

       for (Integer number: numbers){
           sommeNumbers += number;
       }

        return sommeNumbers / numbers.length;
    }

    public static void main(String[] args) {

        Integer nb1;
        Integer nb2;
        Integer nb3;
        System.out.print("Entrez deux nombres: ");
        Scanner sc = new Scanner(System.in);

        nb1 = sc.nextInt();
        nb2 = sc.nextInt();
        nb3 = sc.nextInt();

        System.out.println(calculMoyenneNumber(new Integer[]{nb1, nb2, nb3}));
    }


}
