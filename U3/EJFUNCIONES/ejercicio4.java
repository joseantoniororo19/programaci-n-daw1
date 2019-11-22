package EJ1;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el primer numero");
        int a = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Introduzca el segundo numero");
        int b = teclado.nextInt();
        teclado.nextLine();

        System.out.print("El mayor numero es: " + num_mayor(a, b));
    }
    public static int num_mayor(int a, int b){
        return a <= b ? b : a;
    }
}
