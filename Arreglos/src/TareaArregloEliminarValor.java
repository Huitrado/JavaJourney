import java.util.Scanner;

public class TareaArregloEliminarValor {
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        int numeroEliminar = 0, posicion = 0, numero = 0;
        int count = arreglo.length;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < count; i++){
            System.out.println("Ingresa un numero entero: ");
            numero =  scanner.nextInt();
            arreglo[i] = numero;
        }

        System.out.println("Ingresa el numero a eliminar en el arreglo: ");
        numeroEliminar = scanner.nextInt();

        for (int i = 0; i < count; i++){
            if(numeroEliminar == arreglo[i] ){
                posicion = i; //Obtenemos el indice donde eliminar el numero del usuario
                break;
            }
        }

        for (int i = posicion; i < count - 1; i++){
            arreglo[i] = arreglo[i+1];
        }

        int[] arregloB = new int[count - 1];
        System.arraycopy(arreglo, 0, arregloB, 0, arregloB.length);

        for (int num: arregloB){
            System.out.print(num + " ");
        }

    }
}
