package EJ2;

import java.util.Scanner;

//Diseñar un programa que solicite al usuario 5 números decimales.
// A continuación, debe mostrar los números en el mismo orden en que se han introducido.
public class ejercicio1 {
    public static void main(String[]args){
        double [] datos = new double[5];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca los 5 primeros numeros: ");

        for (int i = 0; i < datos.length; i++){
            System.out.print(datos [i] + " ");
            datos [i] = teclado.nextDouble();
        }

        System.out.println("Los numeros son: ");
        for (int i = 0; i < datos.length; i++){
            System.out.println(datos[i]);
        }
    }
}
