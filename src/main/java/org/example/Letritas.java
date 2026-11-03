package org.example;

import java.util.Scanner;

public class Letritas {
    static void main() {
System.out.println("Introduce una palabra o frase: ");
        Scanner RAE = new Scanner(System.in);
        String frase = RAE.nextLine();
        System.out.println("Texto original: " + frase);
        int largo = frase.length();
        System.out.println("La longitud del texto es: " + largo);
        System.out.println("Texto sin espacios: "+frase.replace( " ", ""));
        int mitad = largo/2;
        System.out.println("Texto dividido en 2 mitades: Primera mitad es '"+frase.substring(0,mitad)+"'. La segunda mitad es '"+frase.substring(mitad));
        System.out.println("Texto a mayúsculas: "+frase.toUpperCase());



    }
}
