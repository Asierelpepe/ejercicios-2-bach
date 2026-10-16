package org.example;

import java.util.Scanner;

public class Elecciones {
    static void main(){
        System.out.println("¿Cuántos años tienes? ");
        System.out.println("Insertar aquí: ");
        Scanner abalos = new Scanner(System.in);
        int edad = abalos.nextInt();
        if (edad >= 18){
            System.out.println("Puedes votar");
        }
        else {System.out.println("Eres menor de edad, vete a estudiar ostia");
        }

    }

}
