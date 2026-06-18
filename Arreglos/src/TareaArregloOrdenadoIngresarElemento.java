import java.util.Scanner;

public class TareaArregloOrdenadoIngresarElemento {
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        int numeroInsertar = 0, posicion = 0, numero = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arreglo.length - 1; i++){
            System.out.println("Ingresa un numero entero: ");
            numero =  scanner.nextInt();
            arreglo[i] = numero;
        }

        System.out.println("Ingresa el numero a insertar en el arreglo: ");
        numeroInsertar = scanner.nextInt();

        for (int i = 0; i < arreglo.length; i++){
            if(numeroInsertar < arreglo[i] ){
                posicion = i; //Obtenemos el indice donde insertar el numero del usuario
                break;
            }
        }

        for (int i = arreglo.length - 1; i > posicion; i--){
            arreglo[i] = arreglo[i-1];
        }
        arreglo[posicion] = numeroInsertar;

        for (int num: arreglo){
            System.out.print(num + " ");
        }

    }
}
