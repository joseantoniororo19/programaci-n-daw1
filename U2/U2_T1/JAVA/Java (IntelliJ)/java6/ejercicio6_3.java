import java.util.Scanner;

public class ejercicio6_3 {
    public static void main(String[]args){
        int num, par;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        num = teclado.nextInt();
        if(num % 2 == 0){
            par = 1;
        }else{
            par = 0;
        }
        System.out.println("El valor es par: " + par);
        par = num % 2 == 0 ? 1 : 0;
        System.out.println("El valor par es: " + par);
    }
}
