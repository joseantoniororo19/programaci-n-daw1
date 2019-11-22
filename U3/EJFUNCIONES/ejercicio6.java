package EJ1;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("La letra a es vocal " + esVocal('a'));
        System.out.println("La letra y es vocal " + esVocal('y'));
        System.out.println("La letra I es vocal " + esVocal('I'));
        System.out.println("La letra P es vocal " + esVocal('P'));
        System.out.println("La letra e es vocal " + esVocal('e'));
    }
    static boolean esVocal(char c){
        boolean resultado;

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            resultado = true;
        }else {
            resultado=false;
        }
        return resultado;
    }
}
