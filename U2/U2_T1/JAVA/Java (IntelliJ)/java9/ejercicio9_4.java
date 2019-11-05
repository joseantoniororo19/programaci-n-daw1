import java.util.Scanner;

public class ejercicio9_4 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        String frase;
        int numespaciosenblanco = 0;
        char c;
        System.out.print("Escriba una frase: ");
        frase = teclado.nextLine();

        for (int i = 0; i < frase.length(); i++){
            c = frase.charAt(i);
            if (Character.isSpaceChar(c)){
                numespaciosenblanco++;
            }
        }
        System.out.println("La frase tiene " + numespaciosenblanco + " espacio blanco");
    }

}
