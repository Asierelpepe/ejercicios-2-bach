package org.example;

import java.util.Scanner;

public class Vocales {
    static void main() {
        Scanner aeiou = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = aeiou.nextLine();
        String phrase = frase.toLowerCase();
        int largo = frase.length();
        int a = 0;
        int e = 0;
        int ii = 0;
        int o = 0;
        int u = 0;

        for (int i = 0; i < largo; i++) {
            switch (phrase.charAt(i)){
                case 'a': a = a + 1;
                break;
                case 'e': e = e + 1;
                    break;
                case 'i': ii = ii + 1;
                    break;
                case 'o': o = o + 1;
                    break;
                case 'u': u = u + 1;
                    break;




            }

        }
        int total = a+e+ii+o+u;
        System.out.println("El número de vocales no acentuadas es: "+total);
        System.out.println("A= "+a);
        System.out.println("E= "+e);
        System.out.println("I= "+ii);
        System.out.println("O= "+o);
        System.out.println("U= "+u);



    }
}
