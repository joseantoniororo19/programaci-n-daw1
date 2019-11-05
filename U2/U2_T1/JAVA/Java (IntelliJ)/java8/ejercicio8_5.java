import java.util.Scanner;

public class ejercicio8_5 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int n, min, max;

        System.out.print("El valor minimo en el rango es:");
        min = teclado.nextInt();
        System.out.print("El valor maximo en el rango: ");
        max = teclado.nextInt();

        do{
            System.out.print("Introduzca un numero: ");
            n = teclado.nextInt();
        }while (!(min <= n && n <= max));
        System.out.print(n + "pertenece al rango");
    }
}
