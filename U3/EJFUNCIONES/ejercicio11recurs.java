package EJ1;

import java.util.Scanner;

public class ejercicio11recurs {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la base: ");
        double base = teclado.nextDouble();
        System.out.println("Introduzca el exponente: ");
        int exponente = teclado.nextInt();
        System.out.println("El resultado es: " + AelevadoN(base, exponente));
    }
    static  double AelevadoN(double a, int n){
        double rest;
        if (n == 0){
            rest = 1;
        }else {
            rest = a * AelevadoN(a, n-1);
        }
        return (rest);
    }
}
