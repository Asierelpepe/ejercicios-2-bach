package org.example;

import java.util.Scanner;

public class Sumando_cosas {
    static void main() {
        Scanner cosas = new Scanner(System.in);
        System.out.println("Cuantos números quieres sumar? :");
        int n = cosas.nextInt();
        int total = 0;
        int sumando = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Introduce el número "+i+":");
            sumando = cosas.nextInt();
            total = total + sumando;

        }
        System.out.println("El resultado de la suma de todos esos números es: "+total);
    }
}
