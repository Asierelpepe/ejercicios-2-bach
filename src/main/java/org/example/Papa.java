package org.example;

import java.util.Scanner;

public class Papa {
    static void main() {
        Scanner satan = new Scanner(System.in);
        int cardenales = 0;

        do {
            System.out.println("Indica el número de cardenales reunidos en el cónclave: ");
            cardenales = satan.nextInt();
            if (cardenales < 2 || cardenales > 200){
                System.out.println("ERROR Tienen que haber entre 2 y 200 cardenales");
            }
        } while(cardenales < 2 || cardenales > 200);

        int votos = 0;
        do {
            System.out.println("Indica el número de votos del candidato más votado");
            votos = satan.nextInt();
            if (votos > cardenales || votos < 1){
                System.out.println("ERROR El número de votos no puede ser mayor que el número de cardenales ni menor de 1");
            }
        }while(votos > cardenales || votos < 1);
        System.out.println("Indica el número de votos del candidato más votado");
        votos = satan.nextInt();
        int necessary = 0;
        if (cardenales % 3 != 0){
            necessary = (cardenales/3) + 1;
        }else {
            necessary = cardenales/3;
        }
        if (votos > necessary){
            System.out.println("FUMATA BLANCA");
        }else {
            System.out.println("FUMATA NEGRA");
        }
    }
}
