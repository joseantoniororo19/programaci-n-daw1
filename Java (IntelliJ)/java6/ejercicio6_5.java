import java.util.Scanner;

public class ejercicio6_5 {
    public static void main(String[]args){
        Scanner teclado = new Scanner (System.in);
        System.out.print("Dime el valor del radio de la circunferencia: ");
        double radio = teclado.nextDouble();
        double diametro = 2 * radio;
        double perimetro = 2 * Math.PI * radio;
        double area = Math.PI * radio * radio;
        System.out.println("Si quieres saber el diametro, escribe 1");
        System.out.println("Si quieres saber el perimetro, escribe 2");
        System.out.println("Si quieres saber el area, escribe 3");
        int menu = teclado.nextInt();
        switch (menu){
            case 1:
                System.out.print("Su diametro es: " + diametro);
                break;
            case 2:
                System.out.print("Su primetro es: " + perimetro);
                break;
            case 3:
                System.out.print("Su area es: " + area);
                break;
        }
    }
}
