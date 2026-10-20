package org.example;

import java.util.Scanner;

public class pitagoras_realG_for_life {
    static void main() {
       Scanner lado = new Scanner(System.in);

        System.out.println("Introduce el primer lado del triángulo:");

       int l1 = lado.nextInt();

        System.out.println("Introduce el segundo lado del triángulo:");

        int l2 = lado.nextInt();

        System.out.println("Introduce el tercer lado del triángulo:");

        int l3 = lado.nextInt();

        if (l1==l2 && l1==l3){
            System.out.println("El triángulo es equilátero");
        } else if ((l1==l2 && l1!=l3) || (l1!=l2 && l1==l3) || (l1!=l2 && l2==l3)) {
            System.out.println("El triángulo es isósceles");
        }
        else {
            System.out.println("El triángulo es escaleno");
        }


    }
}
