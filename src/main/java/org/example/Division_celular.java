package org.example;

import java.util.Scanner;

public class Division_celular {
    static void main() {
        Scanner elmio = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        double num1 = elmio.nextDouble();

        System.out.println("Introduce otro numero: ");
        double num2 = elmio.nextDouble();

        if (num2 == 0) {
            System.out.println("ERROR no se puede dividir por 0");
        } else {
            double resultado = num1/num2;
            System.out.println("La división de esos dos numeros tiene como resultado "+resultado);
        }



    }
}
