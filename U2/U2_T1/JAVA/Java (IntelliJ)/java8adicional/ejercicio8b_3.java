import java.util.Scanner;

public class ejercicio8b_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este programa mostrará los n primeros números de Fibonacci");
        int primernumero = 0;
        int segundonumero = 1;
        int tercernumero = 0;

        System.out.print("Indique cuántos números desea que se muestren: ");
        int n = teclado.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println(primernumero + ", ");
            } else if (i == 2) {
                System.out.println(segundonumero + ", ");
            } else {
                System.out.println((primernumero + segundonumero) + ", ");
                tercernumero = segundonumero;
                segundonumero += primernumero;
                primernumero = tercernumero;
            }
        }
    }
}
