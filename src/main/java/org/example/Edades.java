package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Edades {
    static void main() {
        LocalDateTime hoy = LocalDateTime.now();

        System.out.println("El día es: "+hoy.getDayOfMonth());
        System.out.println("El mes es: "+hoy.getMonthValue());
        System.out.println("El año es: "+hoy.getYear());
        System.out.println("Minutos: "+hoy.getMinute());
        int edad = 0;
        Integer nacer = 0;
        int fecha = 0;
        int modo = 0;
        Scanner imserso = new Scanner(System.in);
        System.out.println("Elige entre el modo 1 o el modo 2");

        do {
            System.out.println(" Introduce 1 para acceder al primero y 2 para acceder al segundo: ");
            modo = imserso.nextInt();

            if (modo != 1 && modo != 2){
                System.out.println("Tienes que elegir entre el 1 o el 2");
            }
        }while (modo != 1 && modo != 2);

        if (modo == 1){
            System.out.println("Has escogido el modo 1");

            String año = "";
             año = imserso.nextLine();


            do {
                System.out.println("Introduce tu año de nacimiento");

                año = imserso.nextLine();

                nacer = Integer.parseInt(año);
                if (nacer < 1900 || nacer > hoy.getYear()){
                    System.out.println("ERROR La fecha introducida es errónea.");
                }
            }while(nacer < 1900 || nacer > hoy.getYear());

        }else {
            System.out.println("Has escogido el modo 2");

            do {
                System.out.println("Introduce tu edad actual: ");
                edad = imserso.nextInt();
                if (edad < 0 ){
                    System.out.println("ERROR La edad introducida es errónea.");

                }
            }while (edad<0);
            fecha = hoy.getYear() - edad;


        }
        int select = nacer + fecha;
        if (select > 1900 && select <= 1927) {
            System.out.println("Perteneces a la generación Sin Generación Bautizada");
        } else if (select > 1928 && select <= 1944) {
            System.out.println("Perteneces a la generación Generación Silent");

        } else if (select > 1945 && select <= 1964) {
            System.out.println("Perteneces a la generación Baby Boomers");

        }else if (select > 1965 && select <= 1981) {
            System.out.println("Perteneces a la generación Generación X");
        }else if (select > 1982 && select <= 1994) {
            System.out.println("Perteneces a la generación Y o Millenials");
        }



        }
}
