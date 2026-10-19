package org.example;

import java.util.Scanner;

public class Mamá_dame_10x15€ {
    static void main() {

        System.out.println("¿Cuántas horas trabajas al mes? ");

        System.out.println("Insertar aquí: ");

        Scanner Hacienda = new Scanner(System.in);

        double horas = Hacienda.nextFloat();

        System.out.println("¿Cuánto cobras por hora trabajada? ");
        System.out.println("Insertar aquí: ");

        double dineros = Hacienda.nextFloat();
        double BONUS = 40;
        if (horas>BONUS){
            double extras = (horas-BONUS)* 0.50;

            double Paguita= (horas*dineros)+ extras;

            System.out.println("Tu salario bruto es de " +Paguita+ "€");
        }
       else {
            double Paguita= (horas*dineros);

            System.out.println("Tu salario bruto es de " +Paguita+ "€");
        }



    }

}
