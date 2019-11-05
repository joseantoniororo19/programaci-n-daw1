import com.sun.xml.internal.ws.api.ha.StickyFeature;
import sun.font.DelegatingShape;
import sun.net.idn.StringPrep;

import java.util.Scanner;

public class ejercicio9_5 {
    public static void main(String[]args){
        final String prefijo = "Javalín, javalón";
        final String sufijo = "Javalén, len, len";
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba una frase: ");
        String entrada = teclado.nextLine();
        boolean idiomajavalandia = false;

        if (entrada.startsWith(prefijo)){
            idiomajavalandia = true;
            entrada = entrada.substring(prefijo.length());
        }else if(entrada.endsWith(sufijo)){
            idiomajavalandia = true;
            entrada = entrada.substring(0, prefijo.length() - sufijo.length());
        }

        if (idiomajavalandia){
            entrada = entrada.trim();
            System.out.println(entrada);
        }else {
            System.out.println("Lo que has escrito no pertenece al idioma de Javalandia");
        }
    }
}
