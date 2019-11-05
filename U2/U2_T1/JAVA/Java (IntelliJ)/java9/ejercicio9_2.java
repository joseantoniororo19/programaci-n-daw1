import java.util.Scanner;

public class ejercicio9_2 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        String contraseña1;
        String palabra1;

        System.out.println("Primer jugador introduzca la contraseña:");
        contraseña1 = teclado.nextLine();

        int l = contraseña1.length();
        char primero = contraseña1.charAt(0);
        char ultimo = contraseña1.charAt(l - 1);
        System.out.println("Pistas\nLongitud: " + 1);
        System.out.println("Primer caracter: " + primero);
        System.out.println("Ultimo caracter: " + ultimo);

        do{
            System.out.println("Segundo jugador introduzca la contraseña: ");
            palabra1 = teclado.nextLine();
        }while (!contraseña1.equals(palabra1));

        System.out.println("HAS ACERTADOOOOOO");
    }
}
