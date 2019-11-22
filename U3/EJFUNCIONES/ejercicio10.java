package EJ1;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        int primernumero = teclado.nextInt();
        System.out.println("Introduzca otro numero:");
        int segundonumero = teclado.nextInt();

        if (amigos(primernumero,segundonumero)){
            System.out.println(primernumero + " y " + segundonumero + " son amigos");
        }else {
            System.out.println("No son amigos. La próxima ve prueba con otros numeros");
        }
    }
    static boolean amigos(int primernumero, int segundonumero){
        boolean amigos;
        if (primernumero == sumaDivisoresPropios(segundonumero) && segundonumero == sumaDivisoresPropios(primernumero)){
            amigos = true;
        }else{
            amigos = false;
        }
        return (amigos);
    }
    static int sumaDivisoresPropios(int num){
        int suma = 0;
        for (int i = 1; i < num; i++){
            if (num % i == 0){
                suma += i;
            }
        }
        return (suma);
    }
}
