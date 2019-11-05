import java.util.Scanner;

public class ejercicio8b_9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Introduce la altura: ");
        int h = teclado.nextInt();
        for (int i = 0; i < h-1; i++){
            System.out.println("*");
        }
        for (int i = 0; i < ((h/2)+1); i++){
            System.out.print("* ");
        }
    }
}
