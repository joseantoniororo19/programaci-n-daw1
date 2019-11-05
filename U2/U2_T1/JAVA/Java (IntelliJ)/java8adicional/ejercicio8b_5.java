import java.util.Scanner;

public class ejercicio8b_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca la altura de la pirámide: ");
        int altura = teclado.nextInt();

        System.out.print("Introduzca el carácter de relleno: ");
        int relleno = teclado.nextInt();

        int planta = 1;
        int longitudDeLinea = 1;
        int espacios = altura-1;
        while (planta <= altura) {

            // inserta espacios
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }

            // pinta la línea
            for (int i = 1; i <= longitudDeLinea; i++) {
                System.out.print(relleno);
            }
            System.out.println();
            planta++;
            espacios--;
            longitudDeLinea += 2;
        }
    }
}

