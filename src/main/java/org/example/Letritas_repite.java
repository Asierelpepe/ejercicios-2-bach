package org.example;

import java.util.Scanner;

public class Letritas_repite {
    static void main() {
        System.out.println("Introduce una frase: ");
        Scanner RAE = new Scanner(System.in);
        String frase1 = RAE.nextLine();
        System.out.println("Introduce una palabra que aparezca en la frase anterior: ");
        String palabra = RAE.nextLine();
        int largo1 = frase1.length();
        String frase2 = frase1.replace(palabra, "");
        int largo2 = frase2.length();
        int largo3 = palabra.length();
        int sustituto = (largo1 - largo2)/largo3;
        System.out.println(largo1);
        System.out.println(largo2);

        System.out.println("La palabra aparece "+sustituto+" veces.");

    }
}
