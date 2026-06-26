public class EjemploMatrizSimetrica {
    public static void main(String[] args) {

        boolean simetrica = true;
        int[][] matriz = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };

        transpuesta : for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < i; j++){ //Cuando usamos la condicion j < i solo revisa los valores por debajo de la diagonal principal con aquellos que se encuentran por arriba
                if (matriz[i][j] != matriz[j][i]){
                    simetrica = false;
                    break transpuesta;
                }
            }
        }

        if (simetrica){
            System.out.println("La matriz es simetrica ");
        }else {
            System.out.println("La matriz no es simetrica ");
        }
    }
}
