package EJ1;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio11iterat {
    static double elevarAaN (double a, int n){
        double res = 1;
        if (n == 0){
            res = 1;
        }else {
            for (int i = 1; i <= n; i++){
                res = res * a;
            }
        }
        return (res);
    }
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        System.out.print("Introduzca base (real): ");
        double x = teclado.nextDouble();
        System.out.print("Introduzca el exponente (entero): ");
        int y = teclado.nextInt();

        double res = elevarAaN(x, y);
        System.out.println(x + " elevado a " + y + " = " + res);
    }
}
