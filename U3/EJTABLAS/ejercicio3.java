package EJ2;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escriba un numero n: ");
        int n = teclado.nextInt();
        int numeros [] = new int[n];
        int sumapositivos = 0,
                contarpositivos = 0,
                sumanegativos = 0,
                contarnegativos = 0,
                contarceros = 0;

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Introduce un numero: ");
            numeros[i] = teclado.nextInt();
        }

        for (int x : numeros){
            if (x == 0){
                contarceros++;
            }else {
                if (x > 0) {
                    sumapositivos += x;
                    contarpositivos ++;
                }else {
                    sumanegativos += x;
                    contarnegativos++;
                }
            }
        }
        if (contarpositivos == 0){
            System.out.println("Imposible calcular la media de los numeros positivos");
        }else {
            System.out.println("Media de los positivos: "
                    + (double) sumapositivos / contarpositivos);
        }
        if (contarnegativos == 0) {
            System.out.println("Imposible calcular la media de los numeros negativos");
        }else {
            System.out.println("Media de los negativos: "
                    + (double) sumanegativos / contarnegativos);
        }
    }
}
