import com.sun.webkit.SimpleSharedBufferInputStream;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class ejercicio9_1 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        String primerapalabra;
        String segundapalabra;

        int lonpalabra1;
        int lonpalabra2;

        System.out.println("Primera palabra: ");
        primerapalabra = teclado.nextLine();
        System.out.println("Segunda palabra: ");
        segundapalabra = teclado.nextLine();

        lonpalabra1 = primerapalabra.length();
        lonpalabra2 = segundapalabra.length();

        if (lonpalabra1 == lonpalabra2){
            System.out.println("Tienen la misma longitud");
        }else if (lonpalabra1 < lonpalabra2){
            System.out.println(primerapalabra + " es más corta que " + segundapalabra);
        }else {
            System.out.println(primerapalabra + " es más larga que " + segundapalabra);
        }

    }
}
