package org.example;

import java.util.Scanner;

public class multiplicar {
    static void main() {
        Scanner einstein = new Scanner(System.in);

        System.out.println("Introduce un numero de 3 cifras: ");
        Integer num1 = einstein.nextInt();
        if (num1 > 999 || num1 < 100){
            System.out.println("ERROR el numero 1 debe tener 3 cifras positivas");

        }else {
        System.out.println("Introduce otro numero de 3 cifras: ");
        Integer num2 = einstein.nextInt();
        if (num2>999 || num2 < 100){
            System.out.println("ERROR el numero 2 debe tener 3 cifras positivas");
        }else{
        Integer product = num1 * num2;
        System.out.println("El producto de la multiplicación de ambos números es: "+product);

        String multiplicador = num2.toString();

        String multiplicador_1 = multiplicador.substring(2,3);

        String multiplicador_2 = multiplicador.substring(1,2);

        String multiplicador_3 = multiplicador.substring(0,1);

        Integer num2_1 = Integer.parseInt(multiplicador_1);

        Integer num2_2 = Integer.parseInt(multiplicador_2);

        Integer num2_3 = Integer.parseInt(multiplicador_3);

        System.out.println("El proceso es:");

        System.out.println("  "+num1);

        System.out.println("x "+num2);

        System.out.println("-------");

        System.out.println("  "+num1*num2_1);

        System.out.println(" "+num1*num2_2+"x");

        System.out.println(num1*num2_3+"xx");

        System.out.println("-------");

        System.out.println(product);
        }
        }

    }
}
