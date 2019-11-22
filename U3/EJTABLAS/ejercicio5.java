package EJ2;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        final int serie = 6;
        int a[] = new int[serie];
        System.out.println("Escribe la primera serie de los 6 primeros numeros");
        for (int i = 0; i < a.length; i++){
            System.out.print("Introduzca numeros: ");
            a[i] = teclado.nextInt();
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        int b[] = new int[serie];
        System.out.println("Escribe la segunda serie con otros 6 numeros: ");
        for (int i = 0; i < b.length; i++){
            System.out.print("Introduzca numeros: ");
            b[i] = teclado.nextInt();
        }
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        int c[] = new int[2 * serie];

        int indA = 0,//para fusionar a y b en la serie c
                indB = 0,
                indC = 0;
        while (indA < serie && indB < serie){
            if (a[indA] < b[indB]){
                c[indC] = a[indA];
                indA++;
            }else{
                c[indC] = b[indB];
                indB++;
            }
            indC++;
        }
        if (indA == serie){
            while (indB < serie){
                c[indC] = b[indB];
                indB++;
                indC++;
            }
        }else {
            while (indA < serie){
                c[indC] = a[indA];
                indA++;
                indC++;
            }
        }
        System.out.print("Estos son todos los datos: ");
        System.out.print(Arrays.toString(c));
    }
}
