package EJ2;

import java.util.Scanner;

//Escribir una aplicación que solicite al usuario cuántos números desea introducir.
// A continuación, se introducirá por teclado esa cantidad de números enteros, y por último,
// los mostrará en el orden inverso al introducido.
public class ejercicio2 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos numeros desea usted introducir: ");
        int numcantidad = teclado.nextInt();

        int datos [] = new int[numcantidad];

        for (int i = 0; i < datos.length; i++){
            System.out.print("Introduzca un numero: ");
            datos[i] = teclado.nextInt();
        }
        System.out.println("Los numeros en orden inverso son: ");
        for (int i = datos.length - 1; i >= 0; i--){
            System.out.println(datos[i]);
        }

    }
}
