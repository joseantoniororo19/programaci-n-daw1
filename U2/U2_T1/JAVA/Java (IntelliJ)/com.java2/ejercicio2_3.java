package com.company;

import java.util.Scanner;

public class ejercicio2_3 {
    public static void main(String[] args) {
        Scanner teclado;
        int primernumero;
        int segundonumero;

        teclado = new Scanner(System.in);
        System.out.println ("Introducir el primer numero:" );
        primernumero = teclado.nextInt();
        System.out.println("Introducir el segundo numero");
        segundonumero = teclado.nextInt();

        System.out.print("Su resultado es:");
        System.out.print(primernumero / segundonumero);
    }
}
