package com.orsys;

public class Vehicule {

    // Une premiere classe vide

    // Vehicule maVoiture = new Vehicule()

    // Vehicule maVoiture = new Vehicule("XXBBDR44")

    // Vehicule maVoiture = new Vehicule(44)

    // Vehicule maVoiture = new Vehicule(44, "BRRR")

    // Vehicule maVoiture = new Vehicule(43)

    // maVoitre.roule() // maVoitrue.immatriculation = 43

    // maVoiture.seGare() // maVoitrue.immatriculation = 43

    // maVoiture.XX() // maVoitrue.immatriculation = 43

    String immatriculation;

    public Vehicule() {

        // Constructeur 1

    }

    public Vehicule (String immatriculation_locale) {

        // immatriculation_locale existe a partir d'ici

        this.immatriculation = immatriculation_locale;


    } // immatriculation_locale n'existe plus ici

    public Vehicule (Integer immatriculation_locale) {

        // Constructeur 3

    }

    public Vehicule (Integer immatriculation_locale, String couleur_locale) {

        // Constructeur

    }

}
