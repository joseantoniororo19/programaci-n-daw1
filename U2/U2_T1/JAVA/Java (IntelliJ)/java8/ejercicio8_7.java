public class ejercicio8_7 {
    public static void main(String[]args){
        double producto = 1;
        for (int i = 1; i < 20; i += 2){
            producto = producto * i;
        }
        System.out.println("El producto de los 10 primeros numeros impares es: " + producto);
    }
}
