package org.example;

import java.util.Scanner;

public class Contraseña {
    static void main() {
        String PASSWORD = "33nano77";
        String answer = "";
        Scanner pass = new Scanner(System.in);

        do {
            System.out.println("Introduce la contraseña: ");

            answer = pass.nextLine();
            if (!PASSWORD.equals(answer)) {
                System.out.println("ERROR La contraseña es incorecta, intentelo otra vez");

            }
        }while(!PASSWORD.equals(answer));
        System.out.println("LA CONTRASEÑA ES CORRECTA");
        }
    }

