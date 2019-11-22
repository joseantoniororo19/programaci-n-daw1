package EJ1;

import java.util.Scanner;

public class ejercicio12 {
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero:");
        int num = teclado.nextInt();
        System.out.println(num + "! es igual a " + factorial(num));
    }
    static int factorial(int num){
        int rest;
        if (num == 0){
            rest = 1;
        }else {
            rest = num * factorial(num - 1);
        }
        return (rest);
    }
}
