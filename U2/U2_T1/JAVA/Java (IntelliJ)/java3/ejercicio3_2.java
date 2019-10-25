package java3;

import java.util.Scanner;

public class ejercicio3_2 {
    public static void main( String args[] ) {
        short dato = 2019;
        Scanner teclado = new Scanner(System.in);
        short añonacimiento;

        System.out.print("Introduce tu año de nacimiento: ");
        añonacimiento = teclado.nextShort();
        System.out.print(2019 - añonacimiento);
    }
}
