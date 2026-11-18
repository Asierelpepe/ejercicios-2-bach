package org.example;

import java.util.Scanner;

public class Ritual_inverso {
    static void main() {
        Scanner gojo = new Scanner(System.in);
        System.out.println("introduce una palabra o frase: ");
        String cosa = gojo.nextLine();
        int largo = cosa.length();
        String inversion = "";
        for (int i = largo-1; i >=0 ; i--) {
            inversion = inversion+(cosa.charAt(i));
        }
        System.out.println(inversion);
    }
}
