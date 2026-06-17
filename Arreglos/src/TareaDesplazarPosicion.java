import java.util.Scanner;

public class TareaDesplazarPosicion {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < (numeros.length); i++){
            System.out.print("Ingresa un numero: ");
            numeros[i] = scanner.nextInt();
        }

        int aux = numeros[0];
        int aux2 = numeros[1];
        for (int i = 0; i < numeros.length - 1; i++){

            if ( i == 0){
                numeros[i + 1] = numeros[i];
                continue;
            } else {
                aux = numeros[i+1];
                numeros[i + 1] = aux2;
            }
            aux2 = aux;
        }
        numeros[0] = aux;

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

    }
}
