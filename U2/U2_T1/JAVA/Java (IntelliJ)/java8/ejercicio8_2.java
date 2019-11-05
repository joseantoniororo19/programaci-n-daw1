import java.util.Scanner;

public class ejercicio8_2 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int sumaedades = 0;
        int numeroalumnos = 0;
        int mayoresedad = 0;
        double media;

        System.out.print("Introduzca una edad: ");
        int edad = teclado.nextInt();

        while (edad >= 0) {
            sumaedades += edad;
            numeroalumnos++;
            if (edad >= 18) {
                mayoresedad++;
            }
            System.out.print("Introduzca una edad: ");
            edad = teclado.nextInt();
        }
        media = (double) sumaedades / numeroalumnos;
        System.out.println("La suma de todas las edades es: " + sumaedades);
        System.out.println("La media de todo es: " + media);
        System.out.println("El numero total de alumnos es: " + numeroalumnos);
        System.out.print("Los mayores de edad son: " + mayoresedad);

    }
}
