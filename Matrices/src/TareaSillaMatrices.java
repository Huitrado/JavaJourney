import java.util.Scanner;

public class TareaSillaMatrices {
    public static void main(String[] args) {
        int size;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa el tamanio de la matriz: ");
        size = s.nextInt();
        int[][] matriz = new int[size][size];
        int asiento = matriz.length - 3;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (j == 0){
                    matriz[i][j]  = 1;
                } else if (i == asiento) {
                    matriz[i][j] = 1;
                } else if (i > asiento && j == matriz.length - 1) {
                    matriz[i][j] = 1;
                }
                else {
                    matriz[i][j] = 0;
                }
            }
        }

        for (int[] fila : matriz){
            for (int columna : fila ){
                System.out.print(columna + " ");
            }
            System.out.println();
        }
    }
}
