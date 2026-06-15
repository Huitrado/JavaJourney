import java.util.Scanner;

public class EjemploArreglosNumeroMayor {
    public static void main(String[] args) {

        int[] numeros = new int[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 5 enteros: ");
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = scanner.nextInt();
        }

        //Trabajamos con el indice del numero mayor
        int max = 0;
        for (int i = 0; i < numeros.length; i++){
            max = (numeros[max] > numeros[i])? max: i;
        }

        System.out.println("Numero mayor: " + numeros[max]);
    }
}
