import java.util.Scanner;

public class ejercicio8b_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la altura: ");
        int h = teclado.nextInt();
        System.out.print("Introduce el caracter: ");
        int car = teclado.nextInt();
        for (int fil = 0; fil < h-1; ++fil) {
            for (int col = 0; col < h-fil-1; ++col) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2*fil+1; ++col) {
                if ((col == 0) || (col == 2*fil)){
                    System.out.print(car);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int col = 0; col < 2*h-1; ++col) {
            System.out.print(car);
        }
    }
}

