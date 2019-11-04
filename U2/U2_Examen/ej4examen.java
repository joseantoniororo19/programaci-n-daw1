import java.util.Scanner;

public class ej4examen {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca numeros enteros positivos y para terminar introduzca un numero primo:");
        int num = teclado.nextInt();

        while (num / 1 == 0 || num / num == 0){
            System.out.println("Terminaste de introducir numeros");
        }



    }
}
