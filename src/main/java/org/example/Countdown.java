package org.example;

import java.util.Scanner;

public class Countdown {
    static void main() {
        Scanner boom = new Scanner(System.in);
        System.out.println("Escoge un número para comenzar con la cuenta atrás: ");
        int n = boom.nextInt();
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
