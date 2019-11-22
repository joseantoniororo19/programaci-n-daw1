package EJ1;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[]ags){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el valor de n: ");
        int n = teclado.nextInt();
        teclado.nextLine();
        eco(n);
        teclado.close();
    }
    public static void eco(int n){
        for (int i = 0; i < n; i++){
            System.out.print("Eco...");
        }
    }
}
