package com.orsys;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Banque banque1 = new Banque("nom", "adresse", LocalDateTime.now());

        banque1.addClient("Robert","Patrick", LocalDateTime.now() );
        banque1.addClient("Marcelle","Jean", LocalDateTime.now() );
        banque1.addClient("Ricard","Pastis", LocalDateTime.now() );


        System.out.println(banque1.displayListClients());

    }

}
