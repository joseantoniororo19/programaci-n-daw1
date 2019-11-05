import java.util.Scanner;

public class ejercicio8_3 {
    public static void main(String[]args){
        Scanner teclado = new Scanner (System.in);
        int numerojugador = (int) (Math.random() * 100 + 1);

        System.out.println("Introduzca un numero entre 1 y 100");
        int num = teclado.nextInt();

        while (numerojugador != num &&
              num != -1){
            if (numerojugador < num){
                System.out.print("Menor");
            }else {
                System.out.print("Mayor");
            }
            System.out.println("Introduzca otro numero");
            num = teclado.nextInt();
        }
        if (numerojugador == num) {
            System.out.print("Has acertado, eres un maquina");
        }else{
            System.out.print("Fallaste,otra vez será");
        }
    }
}
