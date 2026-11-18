package org.example;

import java.util.Scanner;

public class Facts {
    static void main() {
        Scanner facto = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n = facto.nextInt();
        int total = 1;
        for (int i = n; i >=1 ; i--) {
            total = total * i;
        }
        System.out.println("El factorial de "+n+" es "+total);
    }
}
