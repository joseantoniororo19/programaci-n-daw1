import java.util.Scanner;

public class ejercicio5_3 {
    public static void main (String[]args){
        Scanner teclado = new Scanner (System.in);
        int numero;
        System.out.println("Introduzca un numero: ");
        numero = teclado.nextInt();

        if (numero % 2 == 0){
            System.out.print("No es impar");
        }else{
            System.out.print("Si es impar");
        }
    }
}
