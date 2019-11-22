package EJ2;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escriba la longitud de la combinación: ");
        int longitud = teclado.nextInt();
        int combinación[] = new int[longitud];
        int numjugador[] = new int[longitud];

        generaCombinación(combinación);
        System.out.println(Arrays.toString(combinación));
        System.out.println("Escribe una combinación: ");
        leeTabla(numjugador);

        while (!Arrays.equals(combinación,numjugador)){
            muestraayudas(combinación, numjugador);
            System.out.println("Escribe una combinación: ");
            leeTabla(numjugador);
        }
        System.out.println("¡La cámara se ha abierto!");
    }
    static void generaCombinación(int datos[]){
        final int MAX = 5;
        for (int i = 0; i < datos.length; i++){
            datos[i] = (int) (Math.random() * MAX + 1);
        }
    }
    static void leeTabla  (int datos[]){
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < datos.length; i++){
            datos[i] = teclado.nextInt();
        }
    }
    static void muestraayudas (int secret[], int jugador[]){
        for(int i = 0; i < jugador.length; i++){
            System.out.print(jugador[i]);
            if (secret[i] > jugador[i]) {
                System.out.println(" es mayor");
            }else if (secret[i] < jugador[i]) {
                System.out.println(" es menor");
            }else {
                System.out.println(" es igual");
            }
        }
    }
}
