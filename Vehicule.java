package com.orsys;

public class Vehicule {

    static int nbDeVehicule = 0;

    String immatriculation;

    public Vehicule () {

        System.out.println("Appel du constructeur 1");

        nbDeVehicule ++;
    }


    public Vehicule (String immatriculationLocale) {

        System.out.println("Appel du constructeur 2");

        this.immatriculation = immatriculationLocale;


    }

    public Vehicule (Integer immatriculation_locale) {

        // Constructeur 3
        System.out.println("Appel du constructeur 3");

    }

    public Vehicule (Integer immatriculation_locale, String couleur_locale) {

        // Constructeur

        System.out.println("Appel du constructeur 4");

    }

     public String getImmatriculation () {

        return this.immatriculation;

    }

    public void setImmatriculation (String nouvelleImmatriculation) {

        this.immatriculation = nouvelleImmatriculation;

    }


}
