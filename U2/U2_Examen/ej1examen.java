import java.util.Scanner;

public class ej1examen {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int h = 0;

        System.out.println("Introduzca la altura (numero impar mayor o igual a 5): ");
        h = teclado.nextInt();

        while (h % 2 == 0 || h < 5) {
            System.out.println("La altura debe ser impar y mayor que 5");
            System.out.println("Introduzca la altura (numero impar mayor o igual a 5): ");
            h = teclado.nextInt();
        }


        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                if ((i % 2 == 0 && j >= i && j <= h - 1 - i) || (i % 2 == 0 && i + j >= h - 1 && j <= i)
                        || (j % 2 == 0 && i >= j && j <= h - i - 1) || (j % 2 == 0 && i + j >= h - 1 && i <= j)) {
                    System.out.print("M");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }
}




