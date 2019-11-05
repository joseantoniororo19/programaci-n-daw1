import java.util.Scanner;

public class ejercicio5_4 {
    public static void main (String[]args){
        Scanner teclado = new Scanner (System.in);
        int primernumero;
        int segundonumero;
        System.out.println("Introduzca un numero: ");
        primernumero = teclado.nextInt();
        System.out.println("Introduzca un segundo numero: ");
        segundonumero = teclado.nextInt();

        if (primernumero % 2 == 0){
            System.out.println("No es impar");
        }else{
            System.out.println("Si es impar");
        }
        if (segundonumero % 2 == 0){
            System.out.println("No es par");
        }else{
            System.out.println("Si es impar");
        }
    }
}
