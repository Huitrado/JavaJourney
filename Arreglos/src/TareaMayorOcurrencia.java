import java.util.Scanner;

public class TareaMayorOcurrencia {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int[] numerosContados = new int[9];
        Scanner s = new Scanner(System.in);
        int numeroContador = 0;
        int numeroMayor = 0;
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Ingresa un numero: ");
            numeros[i] = s.nextInt();
        }

        int aux = 0;
        for (int i = 0; i < numeros.length; i++){
            numeroContador = 0;

            for (int j = i; j < numeros.length; j++){
                if (numeros[i] == numeros[j]){
                    numeroContador++;
                }
            }

            if (aux < numeroContador){
                aux = numeroContador;
                numeroMayor = numeros[i];
            }

        }

        System.out.println("Cantidad de ocurrencias: " + aux);
        System.out.println("Numero que mas se repite: " + numeroMayor);
    }
}
