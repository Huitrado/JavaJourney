import java.util.Scanner;

public class TareaMatricesX {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa el tamaño de la matriz: ");
        n = s.nextInt();
        String[][] matriz = new String[n][n];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = "_";
                if (i == j || i + j == n-1){
                    matriz[i][j] = "x";
                }
            }
        }

        for (String[] fila : matriz){
            for (String columna : fila){
                System.out.print(columna + "\t");
            }
            System.out.println();
        }




    }
}
