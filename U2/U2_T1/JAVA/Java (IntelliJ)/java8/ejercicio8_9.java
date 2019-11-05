import java.util.Scanner;

public class ejercicio8_9 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int nombrearbol,
                alturaarbol;
        int nombre = 0;
        int altura;
        System.out.print("Altura de dicho arbol (" + nombre + "): " );
        altura = teclado.nextInt();
        alturaarbol = altura;
        nombrearbol = 0;
        while (altura != 1){
            if (altura < alturaarbol){
                alturaarbol = altura;
                nombrearbol = nombre;
            }
            nombre++;
            System.out.print("Altura del arbol (" + nombre + ") es: ");
            altura = teclado.nextInt();
        }
        if (alturaarbol == 1){
            System.out.print("Con esa altura no hay arbol");
        }else{
            System.out.print("El arbol mas alto mide: " + alturaarbol);
            System.out.print("Su nombre es: " + nombrearbol);
        }
    }
}
