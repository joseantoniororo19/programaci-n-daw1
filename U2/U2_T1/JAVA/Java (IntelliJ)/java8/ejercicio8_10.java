import java.util.Scanner;

public class ejercicio8_10 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int num;
        do{
            System.out.print("introducir un numero de 1 al 10: ");
            num = teclado.nextInt();
        } while (!(1 <= num && num <= 10));
        System.out.println("\n\nTabla del " + num);
        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
