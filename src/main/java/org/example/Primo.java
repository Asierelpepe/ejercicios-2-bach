package org.example;

import java.util.Scanner;

public class Primo {
    static void main() {
        Scanner primo = new Scanner(System.in);
        int n = 0;
        while(n<=2) {
            System.out.println("Introduce un número mayor de 2");
            n = primo.nextInt();
            if (n <= 2) {
                System.out.println("ERROR el número debe ser mayor de 2");
            }
        }
    }
}
