import java.util.Scanner;

public class ejercicio9_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String contraseña;
        String palabra;
        System.out.println("Jugador 1 introduzca la contraseña: ");
        contraseña = teclado.nextLine();
        do {
            System.out.println("Jugador 2 intente de introducir la contraseña: ");
            palabra = teclado.nextLine();
            int comparacion = contraseña.compareTo(palabra);
            if (comparacion == 0) {
                System.out.println("Has acertadooooo");
            } else if (comparacion < 0) {
                System.out.println("La contraseña es menor que " + palabra);
            } else {
                System.out.println("La contraseña es mayor que " + palabra);
            }

        }while(!contraseña.equals(palabra));
    }
}