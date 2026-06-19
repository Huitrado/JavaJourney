import java.sql.SQLOutput;
import java.util.Scanner;

public class TareaHistograma {
    public static void main(String[] args) {
        double[] numeros = new double[7];
        int cantidadPositivos = 0, cantidadNegativos = 0, ceros = 0;
        double sumaPositivos = 0, sumaNegativos = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Ingresa un numero: ");
            numeros[i] = scanner.nextDouble();
        }

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > 0){
                sumaPositivos += numeros[i];
                cantidadPositivos++;
            }else if (numeros[i] < 0){
                sumaNegativos += numeros[i];
                cantidadNegativos++;
            }else {
                ceros++;
            }
        }

        System.out.println("Cantidad de numeros positivos: " + cantidadPositivos);
        System.out.println("Cantidad de numeros negativos: " + cantidadNegativos);
        System.out.println("Cantidad de ceros: " + ceros);

        System.out.println("Promedio de los numeros positivos: " + (sumaPositivos/cantidadPositivos));
        System.out.println("Promedio de los numeros negativos: " + (sumaNegativos/cantidadNegativos));



    }
}
