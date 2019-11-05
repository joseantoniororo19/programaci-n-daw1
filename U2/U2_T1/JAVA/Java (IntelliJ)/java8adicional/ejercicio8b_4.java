import java.util.Scanner;

public class ejercicio8b_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número ");
        int cifras = teclado.nextInt();
        int numCifras = 10;
        int positivos = 0;
        int negativos = 0;
        for (int cont = 0; cont < numCifras; cont++){
            if (cifras < 0){
                positivos ++;
            } else {
                negativos++;
            }
        }
        System.out.println("Hay "+positivos+" positivios y "+negativos+" negativos.");
    }
}
