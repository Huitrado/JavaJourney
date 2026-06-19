import java.util.Random;

public class TareaNumeroMasAltoArreglo {
    public static void main(String[] args) {
        int[] numeros = new int[7];
        Random randomNumbers = new Random();

        for (int i = 0; i < numeros.length ; i++){
            numeros[i] = randomNumbers.nextInt(11, 99) + 1;
        }

        int mayor = numeros[0];
        for (int i = 0; i < numeros.length - 1; i++){
            if ( mayor < numeros[i + 1]){
                mayor = numeros[i + 1];
            }
        }

        for (int num : numeros){
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("El numero mayor es: " + mayor);
    }
}
