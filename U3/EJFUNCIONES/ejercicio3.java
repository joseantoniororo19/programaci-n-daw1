package EJ1;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el radio del cilindro: ");
        float r = teclado.nextFloat();
        teclado.nextLine();

        System.out.println("Introduzca la altura del cilindro: ");
        float b = teclado.nextFloat();
        teclado.nextLine();

        System.out.println("¿Qué desea ocupar?\n1) Area\n2 Volumen");
        short opcion =  teclado.nextShort();
        teclado.nextLine();

        area_volumen(opcion, r, b);
    }
    public static void area_volumen(short opcion, float r, float b){
        switch (opcion){
            case 1:
            System.out.println("El area del cilindro es: " + (2 * Math.PI * r * (b + r)));
            break;
            case 2:
            System.out.println("El volumen del cilindro es: " + (Math.PI * r * r * b));
            break;

        }
    }
}
