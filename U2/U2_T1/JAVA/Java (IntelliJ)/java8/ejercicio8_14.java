import java.util.Scanner;

public class ejercicio8_14 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int n = teclado.nextInt();

        for (int fila = 1; fila <= n; fila++){
            for (int col = fila; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
