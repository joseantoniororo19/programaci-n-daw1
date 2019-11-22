package entrega;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] datos = new int[4][5]; // array de 4 filas por 5 columnas

        int fila;
        int columna;

        System.out.println("Por favor, introduzca los números (enteros) en el array");
        for(fila = 0; fila < 4; fila++) {
            for(columna = 0; columna < 5; columna++) {
                System.out.print("Fila " + fila + ", columna " + columna + ": ");
                datos[fila][columna] = teclado.nextInt();
            }
        }

        // Suma de las filas
        int sumaFila;
        for(fila = 0; fila < 4; fila++) {
            sumaFila = 0;
            for(columna = 0; columna < 5; columna++) {
                System.out.printf("%7d   ", datos[fila][columna]);
                sumaFila += datos[fila][columna];
            }
            System.out.printf("|%7d\n", sumaFila);
        }

        // Suma de las columnas
        for(columna = 0; columna < 5; columna++) {
            System.out.print("----------");
        }
        System.out.println("-----------");

        int sumaColumna;
        int sumaTotal = 0;
        for(columna = 0; columna < 5; columna++) {
            sumaColumna = 0;
            for(fila = 0; fila < 4; fila++) {
                sumaColumna += datos[fila][columna];
            }

            sumaTotal += sumaColumna;
            System.out.printf("%7d   ", sumaColumna);
        }
        System.out.printf("|%7d   ", sumaTotal);
    }
}
