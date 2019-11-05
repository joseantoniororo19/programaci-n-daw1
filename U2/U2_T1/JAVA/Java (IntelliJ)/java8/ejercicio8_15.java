import java.util.Scanner;

public class ejercicio8_15 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int j, numerosprimos = 0;
        boolean primos;

        System.out.print("Escribe un numero: ");
        int n = teclado.nextInt();

        for (int i = 1; i <= n; i++){
            primos = true;
            j = 2;

            while (j <= i - 1 && primos == true){
                if (i % j == 0){
                    primos = false;
                }
                j++;
            }
            if (primos) {
                numerosprimos++;
                System.out.println(i + " este numero es primo");
            }
        }
        System.out.println("De 1 a " + n + ", hay " + numerosprimos + " numeros primos");
    }
}
