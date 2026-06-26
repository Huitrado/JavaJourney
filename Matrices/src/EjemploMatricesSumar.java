public class EjemploMatricesSumar {
    public static void main(String[] args) {

        int[][] matriz1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] matriz2 = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };

        int[][] suma = new int[3][3];

        for (int i = 0; i < matriz1.length; i++){
            for (int j = 0; j < matriz1[i].length; j++){
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        for (int[] fila : suma){
            for (int columna : fila){
                System.out.print(columna + "\t");
            }
            System.out.println();
        }
    }
}
