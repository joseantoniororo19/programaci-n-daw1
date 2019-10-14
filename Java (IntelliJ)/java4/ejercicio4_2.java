package java4;

import java.util.Scanner;

public class ejercicio4_2 {
    public static void main(String args[]){
        Scanner teclado;
        float primernumero;
        float segundonumero;

        teclado = new Scanner(System.in);
        System.out.print("Dime tu nota del primer trimestres: ");
        primernumero = teclado.nextFloat();
        System.out.print("Dime tu nota del segundo trimestre: ");
        segundonumero = teclado.nextFloat();

        System.out.print("Tu media total será: ");
        System.out.print((primernumero + segundonumero)/2);


    }
}
