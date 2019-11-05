import java.util.Scanner;

public class ejercicio8_4 {
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("Introduzca un numero:");
        n = teclado.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
}
