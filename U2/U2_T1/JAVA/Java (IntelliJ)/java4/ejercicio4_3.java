import java.util.Scanner;

public class ejercicio4_3 {
    public static void main( String args[] ) {
        Scanner teclado;
        int primernumero;
        int segundonumero;
        int tercernumero;

        teclado = new Scanner(System.in);
        System.out.print("Introduce primer numero: ");
        primernumero = teclado.nextInt();
        System.out.print("Introduce el segundo numero: ");
        segundonumero = teclado.nextInt();
        System.out.print("Introduce el tercer numero: ");
        tercernumero = teclado.nextInt();

        System.out.print("La media de estas tres cifras es: ");
        System.out.print((primernumero + segundonumero + tercernumero) / 3);
    }
}
