package org.example;

import java.util.Scanner;

public class Mamá_dame_10€ {

    static void main() {

        System.out.println("¿Cuántas horas trabajas al mes? ");
        System.out.println("Insertar aquí: ");

        Scanner Hacienda = new Scanner(System.in);

        float horas = Hacienda.nextFloat();

        System.out.println("¿Cuánto cobras por hora trabajada? ");
        System.out.println("Insertar aquí: ");

        float dineros = Hacienda.nextFloat();

        float Paguita= horas*dineros;

        System.out.println("Tu salario bruto es de " +Paguita+ "€");
    }

}
