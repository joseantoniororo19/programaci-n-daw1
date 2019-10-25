package com.java2;

import java.util.Scanner;

public class ejercicio2_5 {
    public static void main( String args[] ) {
        Scanner teclado = new Scanner(System.in);
        int primernumero;
        System.out.print("Introduce los grados en centigrados:  ");
        primernumero = teclado.nextInt();

        System.out.print("En grados Fahrenheit es: ");
        System.out.print(((9*primernumero) / 5) + 32);

    }
}
