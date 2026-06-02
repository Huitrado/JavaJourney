import java.util.Scanner;

public class CalcularMinBubbleSort {
    public static void main(String[] args) {
        int numMenor;
        Scanner scan = new Scanner(System.in);
        int tamanio;

        System.out.println("Ingresa la cantidad de numeros (minimo 10): ");
        tamanio = scan.nextInt();

        if(tamanio < 10){
            System.out.println("Error, ingresa un numero igual o mayor a 10");
            tamanio = scan.nextInt();
        }
        int[] numeros = new int[tamanio];

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Ingresa el valor del numero " + (i + 1));
            numeros[i] = scan.nextInt();
        }

        numMenor = numeros[0];
        for (int i = 0; i < numeros.length - 1; i++){
            if(numeros[i + 1] < numMenor){
                numMenor = numeros[i + 1];
            }
        }


        if(numMenor >= 10){
            System.out.println("El numero " + numMenor + " es igual o mayor que 10!");
        }else {
            System.out.println("El numero "+ numMenor + " es menor que 10!");
        }
    }
}
