import java.util.Scanner;

public class ejercicio8_13 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int aprobados = 0;
        int suspensos = 0;
        int condicionados = 0;

        for (int i = 1; i <= 6; i++){
            System.out.println("La nota del alumno " + i + ": ");
            int nota = teclado.nextInt();

            if (nota == 4){
                condicionados++;
            }else if (nota >= 5){
                aprobados++;
            }else if (nota < 4){
                suspensos++;
            }
        }
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspensos: " + suspensos);
        System.out.println("Condicionados: " + condicionados);
    }
}
