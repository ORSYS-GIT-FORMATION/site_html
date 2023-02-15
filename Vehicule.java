package com.orsys;

public class Vehicule {

    // Une premiere classe vide

    // Vehicule maVoiture = new Vehicule()

    // Vehicule maVoiture = new Vehicule("XXBBDR44")

    // Vehicule maVoiture = new Vehicule(44)

    // Vehicule maVoiture = new Vehicule(44, "BRRR")

    // Vehicule maVoiture = new Vehicule(43)

    // maVoitre.roule() // maVoitrue.immatriculation = 43

    // maVoiture.seGare() // maVoitrue.immatriculation = 43 => maVoiture.setImmatriculation()

    // maVoiture.XX() // maVoitrue.immatriculation = 43

    static int nbDeVehicule = 0;

    String immatriculation;

    public Vehicule () {

        // Constructeur 1

        System.out.println("Appel du constructeur 1");

        nbDeVehicule ++;
    }


    public Vehicule (String immatriculationLocale) {

        // immatriculation_locale existe a partir d'ici

        System.out.println("Appel du constructeur 2");

        this.immatriculation = immatriculationLocale;


    } // immatriculation_locale n'existe plus ici

    public Vehicule (Integer immatriculation_locale) {

        // Constructeur 3
        System.out.println("Appel du constructeur 3");

    }

    public Vehicule (Integer immatriculation_locale, String couleur_locale) {

        // Constructeur

        System.out.println("Appel du constructeur 4");

    }

    // Une premiere méthode : un getters
     public String getImmatriculation () {

        return this.immatriculation;

    }

    public void setImmatriculation (String nouvelleImmatriculation) {

        this.immatriculation = nouvelleImmatriculation;

    }


}
