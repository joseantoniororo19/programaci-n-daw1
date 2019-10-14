import java.util.Scanner;

public class ejercicio6_4 {
    public static void main( String args[] ) {
        byte num1, num2;
          int menor1 = 10;
          int menor2 = 10;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        num1 = teclado.nextByte();
        System.out.print("Dime otro numero: ");
        num2 = teclado.nextByte();

        if ((num1 % 2 == 0) || (num2 % 2 == 0)){
            menor1 = 10;
        }else{
            menor2 = 10;
        }
        System.out.println("El valor es menor que: ");
        menor1 = (byte) (num1 % 2 == 0 ? 1 : 0);
        menor2 = (byte) ( num2 % 2 == 0 ? 1 : 0);
        System.out.println("El valor es menor que: " + menor2);



        }

    }

