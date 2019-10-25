package java3;

import java.util.Scanner;

public class ejercicio3_1 {
    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        byte primernumero;
        byte segundonumero;

        System.out.print("Introduce tu primer numero: ");
        primernumero = teclado.nextByte();
        System.out.print("Introduce el segundo numero: ");
        segundonumero = teclado.nextByte();

        System.out.print("El resultado de esta suma es: ");
        System.out.print(primernumero + segundonumero);
    }
}
