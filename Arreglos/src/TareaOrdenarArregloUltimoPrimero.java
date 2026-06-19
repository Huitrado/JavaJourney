import java.util.Scanner;

public class TareaOrdenarArregloUltimoPrimero {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Ingresa un numero: ");
            numeros[i] = scanner.nextInt();
        }

        int aux = 0;
        for (int i = numeros.length - 1; i >= numeros.length/2; i--){
            System.out.println(numeros[i]);
            System.out.println(numeros[aux++]);
        }
    }
}
