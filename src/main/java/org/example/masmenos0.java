package org.example;

import java.util.Scanner;

public class masmenos0 {
    static void main() {
        System.out.println("Introduce un número: ");
        Scanner Pachi = new Scanner(System.in);
                int num = Pachi.nextInt();
                if (num > 0){
                    System.out.println("El número introducido es positivo");
                } else if (num < 0) {
                 System.out.println("El numero introducido es negativo");
                } else{
                    System.out.println("El numero introducido es natural");
                }
    }
}
