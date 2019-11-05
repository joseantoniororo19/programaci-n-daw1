import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Scanner;

public class ejercicio5_2 {
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        int x = 12;
        System.out.println("Introduzca el numero 12");
        x = teclado.nextInt();

        if (x != 12){
            System.out.print("El numero introducido no es el correcto");
        }else{
            System.out.print("El numero ha sido introducido correctamente");
        }


        }
    }
