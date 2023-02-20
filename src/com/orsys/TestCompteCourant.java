package com.orsys;


import static com.orsys.CompteCourant.transfert;

public class TestCompteCourant {

    public static void main(String[] args) {

        CompteCourant first = new CompteCourant("Martin", "Jacques");

        CompteCourant second = new CompteCourant("Orsys", "Hugo", 500);

        CompteCourant third = new CompteCourant( "Jackie", "Michelle", 2500,"compte Hugo");


        System.out.println(first.resume());
        System.out.println(second.resume());


        System.out.println( transfert(second,first,200));


        System.out.println(first.resume());
        System.out.println(second.resume());
    }


}