package EJ1;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca numero: ");
        int num = teclado.nextInt();
        teclado.nextLine();
        divisoresPrimos (num);
    }
    static boolean esPrimo(int num){
        boolean primo = true;
        int i = 2;
        if (num < 2){
            primo = false;
        }
        while (i < num && primo == true){
            if (num% i == 0){
                primo = false;
            }
            i++;
        }
        return (primo);
    }
    static void divisoresPrimos(int num){
        System.out.println("Divisores primos de " + num);
        for (int i = 1; i <= num; i++){
            if (esPrimo(i) && num % i == 0){
                System.out.println("El numero " + i);
            }
        }
    }
}
