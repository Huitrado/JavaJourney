import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {

        int[] arregloOriginal, pares, impares;
        arregloOriginal = new int[10];
        int totalPares = 0, totalImpares = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa 10 numeros enteros: ");
        for (int i = 0; i < arregloOriginal.length; i++){
            arregloOriginal[i] = scanner.nextInt();
        }

        for (int i = 0; i < arregloOriginal.length; i++){
            if (arregloOriginal[i] % 2 == 0 ){
             totalPares++;
            }else {
                totalImpares++;
            }
        }
        pares = new int[totalPares];
        impares = new int[totalImpares];

        int j = 0;
        int k = 0;

        for (int i = 0; i < arregloOriginal.length; i++){
            if (arregloOriginal[i] % 2 == 0 ){
                pares[j++] = arregloOriginal[i];
            }else {
                impares[k++] = arregloOriginal[i];
            }
        }

        System.out.println("Pares");
        for (int i = 0; i < pares.length; i++){
            System.out.print(pares[i] + " ");
        }
        System.out.println("\nImpares");
        for (int i = 0; i < impares.length; i++){
            System.out.print(impares[i] + " ");
        }

    }

}
