import java.util.Scanner;

public class ejercicio8b_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int numeroIntroducido = teclado.nextInt();

        for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
            System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
        }
    }
}

