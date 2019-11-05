import java.util.Scanner;

public class ejercicio8_12 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        boolean suspensos = false;
        for (int i = 0; i <= 5; i++){
            System.out.println("Introduce una nota (del 0 al 10): ");
            int notas = teclado.nextInt();

            if (notas < 5) {
                suspensos = true;
            }
        }
        if (suspensos){
            System.out.println("Hay algunos alumnos suspensos");
        }else{
            System.out.println("Este año no hay suspensos");
        }

    }
}
