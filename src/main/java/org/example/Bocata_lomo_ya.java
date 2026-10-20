package org.example;

import java.util.Scanner;

public class Bocata_lomo_ya {
    static void main() {
        Scanner arguiñano = new Scanner(System.in);

        System.out.println("Tienes tomate?");
        String tomate = arguiñano.nextLine();

        System.out.println("Tienes aceite?");
        String aceite = arguiñano.nextLine();

        System.out.println("Tienes jamón?");
        String jamon = arguiñano.nextLine();

        String NOHAY = "no";
        if (tomate.equals(NOHAY) || aceite.equals(NOHAY) || jamon.equals(NOHAY)){
            System.out.println("Tienes que ir a comprar");
        } else {
            System.out.println("No hace falta que vayas a comprar, hazte ya el bocadillo");
        }
    }
}
