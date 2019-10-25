package java3;

import java.util.Scanner;

public class ejercicio3_4 {
    public static void main(String args[]){

        float unamilla = 1609;

        Scanner teclado = new Scanner(System.in);
        float millas;

        System.out.print("Introduce las millas: ");
        millas = teclado.nextFloat();
        System.out.print("Esas millas en kilometros son: ");
        System.out.print(millas * unamilla);


    }
}
