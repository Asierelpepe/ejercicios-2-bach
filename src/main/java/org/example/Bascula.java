package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bascula {
    static void main() {
        System.out.println("BIENVENIDO AL RATÓN JUGUETÓN");

        Scanner medida = new Scanner(System.in);

        System.out.println("Leyendo altura cm...");
        int altura = 0;
        try {
             altura = medida.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("ERROR DE LECTURA, BAJA DE LA BÁSCULA Y VUELVE A SUBIR");
        }
        if (altura < 140){
            System.out.println("LO SIENTO NO PUEDES MONTAR EN LA ATRACCIÓN. Te faltan " + (140-altura) + "cm");
        } else if (altura>230) {
            System.out.println("ERROR DE LECTURA, BAJA DE LA BÁSCULA Y VUELVE A SUBIR");
        }
        System.out.println("Leyendo peso cm...");
        double peso = 0;
        try {
            peso = medida.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("ERROR DE LECTURA, BAJA DE LA BÁSCULA Y VUELVE A SUBIR");

        }


    }
}
