import java.util.Scanner;

public class ejercicio5_1 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int numeroentero;
        System.out.println("Introduzca un numero entero: ");
        numeroentero = teclado.nextInt();

        if (numeroentero > 0){
            System.out.print("El numero introducido es positivo");
        }else if (numeroentero < 0){
            System.out.print("El numero introducido es negativo");
        }
    }
}
