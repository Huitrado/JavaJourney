import java.util.Scanner;

public class TareaArregloDesplazarPosicion2 {
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        int numeroAgregar = 0, posicion = 0, numero = 0;
        int count = arreglo.length;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < count; i++){
            System.out.println("Ingresa un numero entero: ");
            numero =  scanner.nextInt();
            arreglo[i] = numero;
        }

        System.out.println("Ingresa el numero a agregar en el arreglo: ");
        numeroAgregar = scanner.nextInt();
        System.out.println("Ingresa la posicion en la que quieres agregar el elemento 0 - 9");
        posicion = scanner.nextInt();

        int[] arregloB = new int[count + 1];
        System.arraycopy(arreglo, 0, arregloB, 0, posicion);//Copiamos la primera parte del arreglo hasta la posicion indica

        arregloB[posicion] = numeroAgregar;
        System.arraycopy(arreglo, posicion, arregloB, posicion + 1 , arreglo.length - posicion);//Copiamos el arreglo restante

        for (int num: arregloB){
            System.out.print(num + " ");
        }

    }
}
