package org.example;

import java.util.Scanner;

public class Tablas {
    static void main() {
        Scanner tablas = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n = tablas.nextInt();
        System.out.println("La tabla de multiplicar del "+n+" es :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}
