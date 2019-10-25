package java3;

import java.util.Scanner;

public class ejercicio3_3 {
    public static void main( String args[] ) {
        Scanner teclado = new Scanner(System.in);
        double primernuemro;
        double segundonumero;

        System.out.print("Introduce el dividendo: ");
        primernuemro = teclado.nextDouble();
        System.out.print("Introduce el divisor: ");
        segundonumero = teclado.nextDouble();

        System.out.print("El resultado de esta división es: ");
        System.out.print(primernuemro / segundonumero);

    }
}
