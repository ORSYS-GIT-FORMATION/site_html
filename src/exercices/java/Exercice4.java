package exercices.java;

import java.util.Scanner;

public class Exercice4 {

    public static String tableMultiple(int nb){
        String calcul= "";
        for (int i = 1 ; i < 11; i++){
            int result = nb * i;
            calcul += nb +  "x" + i + "=" + result + " ";
        }
        return calcul;
    }

    public static void main(String[] args) {

        int nb1;
        System.out.print("Entrez deux nombres: ");
        Scanner sc = new Scanner(System.in);

        nb1 = sc.nextInt();

        System.out.println(tableMultiple(nb1));
    }
}
