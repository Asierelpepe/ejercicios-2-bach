package org.example;

import java.util.Scanner;

public class Bucles {
    static void main() {
        int intento = 10;
        Scanner jueguito = new Scanner(System.in);
        System.out.println("JUGADOR 1 introduce una frase: ");
        String frase = jueguito.nextLine();
        String palabra = "";
        do{
            System.out.println("JUGADOR 2 adivina una palabra contenida en la frase: ");
             palabra = jueguito.nextLine();
            if (frase.contains(palabra) == false){
                intento = intento-1;
                System.out.println("INCORECTO te quedan "+intento+" intentos");
            }else {
                intento = 0;
                System.out.println("ENHORABUENA, HAS ACERTADO UNA PALABRA");

            }


        }while (intento > 0);
        if (frase.contains(palabra) == false) {

            System.out.println("GAME OVER");
        }
    }
}
