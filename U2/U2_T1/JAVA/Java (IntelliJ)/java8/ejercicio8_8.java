import com.sun.scenario.effect.impl.sw.sse.SSEBlend_ADDPeer;

import java.util.Scanner;

public class ejercicio8_8 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        double factorial;
        int num;

        System.out.print("Introducir un numero: " );
        num = teclado.nextInt();

        factorial = 1;
        for (int i = num; i > 0; i--){
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }

}
