package com.orsys;


public class Main {


    public static void main(String[] args) {


    }
}


public class Vegetaux {

    Vegetaux {

        System.out.println("Un nouveau végétaux");

    }

    void affichage() {

        System.out.println("Je suis un végétaux");

    }

}

public class Arbre extends Vegetaux {

    Arbre {

        System.out.println("Un nouvel arbre");

    }

    Arbre (String c) {



    }

    void affichage() {

        System.out.println("Je suis un végétaux");

    }

}

public class Fleur extends Vegetaux {

    Fleur {

        //super()

        System.out.println("Un nouvel fleur");

    }

    void affichage() {

        System.out.println("Je suis un fleur");

    }

}

// Main

Vegetaux list[] = new Vegetaux[10]; // Création

Arbre arbre = new Arbre(); // a1

Fleur fleur = new Fleur(); // a2

list[0] = arbre; // a1 => Arbre

list[1] = fleur; // a2

list[1].perdSesFeuille();

// Vegetaux.perdSesFeuilles Si c'est un arbre c'est SI c'est une fleur c'est une erreur et je sais le dire

// Compilateur perdSesFeuille ??? Pas necessairement pour un vegetaux
// Machine virtuelle : C'est bien un arbre








