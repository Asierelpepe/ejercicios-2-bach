package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bascula {
    static void main() {
        int SUBIR = 1;
        System.out.println("BIENVENIDO AL RATÓN JUGUETÓN");

        Scanner medida = new Scanner(System.in);

        System.out.println("Leyendo altura cm...");
        int altura = 0;
        try {
             altura = medida.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("ERROR DE LECTURA, BAJA DE LA BÁSCULA Y VUELVE A SUBIR");
            SUBIR = 0;

        }
       if (SUBIR == 1){
           if (altura>230 || altura < 0){
               System.out.println("ERROR DE LECTURA, BAJA DE LA BÁSCULA Y VUELVE A SUBIR");
               SUBIR = 0;


           } else if (altura<140) {
               System.out.println("LO SIENTO NO PUEDES MONTAR EN LA ATRACCIÓN. Te faltan " + (140-altura) + "cm");
               SUBIR = 0;
           }
       }

        if (SUBIR == 1){
            System.out.println("Leyendo peso cm...");
            double peso = 0;
            try {
                peso = medida.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("ERROR DE LECTURA, BAJA DE LA BÁSCULA Y VUELVE A SUBIR");

            }
            double PESOMIN = (double) (2 * altura) /8;
            double PESOMAX = 120;
            if (peso > PESOMAX ) {
                System.out.println("LO SIENTO. Sobrepasas "+(peso-PESOMAX)+"kg el peso máximo de la atracción");

            } else if (peso<0) {
                System.out.println("ERROR DE LECTURA, BAJA DE LA BÁSCULA Y VUELVE A SUBIR");

            } else if (peso >= PESOMIN) {
                System.out.println("Pesas "+peso+"kg. Peso mínimo calculado: "+PESOMIN+"kg");
                System.out.println("¡¡SUBE A LA ATRACCIÓN!!");

            }else {
                System.out.println("LO SIENTO. Te faltan "+(PESOMIN-peso)+"kg para tu peso mínimo");

            }
        }



    }
}
