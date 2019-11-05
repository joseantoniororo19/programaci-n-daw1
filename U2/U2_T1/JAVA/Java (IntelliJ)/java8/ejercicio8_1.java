import java.util.Scanner;

public class ejercicio8_1 {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        boolean esPar, esPositivo;
        System.out.print("Introduzca un numero: ");
        int num = teclado.nextInt();

        while (num != 0) { //Cuando el numero sea 0 termina
            esPar = num % 2 == 0 ? true : false; //si el resto es 0 será par
            esPositivo = num >= 0 ? true : false; //suponemos que el 0 es positivo

            System.out.println("Es par: " + esPar + "\nEs positivo: " + esPositivo);
            System.out.println("Cuadrado: " + num * num);
            System.out.print("Introduzca otro numero: ");

            num = teclado.nextInt();
        }
    }
}
