package org.example;

import java.util.Scanner;

public class Comparando_letritas {
    static void main() {
        System.out.println("Introduce una palabra o frase: ");
        Scanner RAE = new Scanner(System.in);
        String frase1 = RAE.nextLine();
        System.out.println("Introduce otra palabra o frase: ");
        String frase2 = RAE.nextLine();
        int largo1 = frase1.length();
        int largo2 = frase2.length();
        if (largo1 > largo2){
            System.out.println("La primera cadena de texto es la más larga.");
        } else if (largo1 < largo2) {
            System.out.println("La segunda cadena de texto es la más larga.");

        }else {
            System.out.println("Las dos cadenas de texto son igual de largas.");

        }

    }
}
