package org.example;

import java.util.Scanner;

public class Letritas_restando {
    static void main() {
        System.out.println("Introduce un número: ");
        Scanner RAE = new Scanner(System.in);
        String N = RAE.nextLine();
        System.out.println("Introduce el número de cifras que quieres restarle: ");
        int m = RAE.nextInt();
        System.out.println(N.substring(0,((N.length())-m)));


    }

}
