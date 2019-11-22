package entrega;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int mesa[] = {1,2,3,4,5,6,7,8,9,10};
        int ocupacion [] = {3,2,0,2,4,1,0,2,1,1};
        int cant;
        int aux;

        do{
            System.out.println("Cuantos son? (Introduzca -1 para salir del programa): ");
            cant = teclado.nextInt();

            if (cant == -1){
                break;
            }else if (cant >4 ){
                System.out.println("No admitimos a grupos mayor de 4 personas: " + cant);
            }
        } while(cant>4);
        aux = cant;

        while (aux>0){
            int j = 0;
            for (int i = 0; i < 10; i++) {
                if(ocupacion [i] ==0){
                    System.out.println("En que mesa se van a sentar: "+ mesa[i]);
                    ocupacion [i] = cant;
                    break;
                }

                j++;
            }
        }

        for (int j = 0; j < 10; j++) {
            System.out.print(ocupacion [j]);
        }
    }
}
