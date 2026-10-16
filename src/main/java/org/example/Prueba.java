package org.example;

import java.util.Scanner;

public class Prueba {
    static void main() {

        System.out.println("¿Cómo te llamas? ");
        System.out.println("Inserta aquí: ");

        Scanner entradaEscaner = new Scanner(System.in);

        String nombre = entradaEscaner.next();

        entradaEscaner.nextLine();

        System.out.println("¿A qué curso vas?");
        System.out.println("Inserta aquí: ");

        String curso = entradaEscaner.nextLine();

        System.out.println("Hola " + nombre + ", bienvenido a " + curso );

        System.out.println("Introduce un número:");

        int n1 = entradaEscaner.nextInt();

        System.out.println("Introduce otro número:");

        int n2 = entradaEscaner.nextInt();

        int suma = n1+n2;

        System.out.println("El resultado de sumar los dos números es " + suma);


    }
}
