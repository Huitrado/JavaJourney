import java.sql.SQLOutput;

public class EjemploStringFor {
    public static void main(String[] args) {

        int[][] numeros = new int[4][4];

        int contador = 1;

        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                numeros[i][j] = contador++;
            }
        }


        System.out.println("Imprimiendo con for");
        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println("\n");
        }


        System.out.println("Imprimiendo con for each");
        for (int[] fila:  numeros){
            for (int columna: fila){
                System.out.print(columna + " ");
            }
            System.out.println("\n");
        }
    }
}
