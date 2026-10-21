package org.example;

import java.util.Scanner;

public class mercadona {
    static void main() {

        Scanner hacendado = new Scanner(System.in);

        System.out.println("Introduce el precio de un producto");
        double dineros = hacendado.nextFloat();

        System.out.println("Introduce el porcentaje del descuento");
        double ahorros = hacendado.nextFloat();

        double savedmoney = dineros * (ahorros/100);
        double totalcost = dineros - savedmoney;

        System.out.println("Con el descuento te ahorras "+savedmoney+"€, y el precio a pagar por el producto es de "+totalcost+"€");
    }
}
