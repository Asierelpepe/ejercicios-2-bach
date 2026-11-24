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
        int si = 0;
        System.out.println("Los números primos del 2 al "+n+" son :" );
        for (int i = 2; i <= n; i++) {
            int j = 2;
            while(j<i){
                if (i % j == 0){
                    si = si + 1;
                }
                j = j+1;
            }
            if (si == 0){
                System.out.println(i);
            }
        }

    }
}
