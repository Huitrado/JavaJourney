public class EjemploMatricesBuscar {
    public static void main(String[] args) {

        int[][] matrizDeEnteros = {
                {35, 90, 3, 1987},
                {45, 1235, 15, 14},
                {45, 45, 78, 46}
        };

        int elementoBuscar = 46;
        boolean encontrado = false;
        int i = 0, j = 0;
        buscar: for (int[] fila: matrizDeEnteros){
            for (int numero: fila){
                j++;
                if (numero == elementoBuscar){
                    encontrado = true;
                    break buscar;
                }
                j = 0;
            }
            i++;
        }

        if (encontrado){
            System.out.println("El numero " + elementoBuscar + " fue encontrado en las coordenadas " + i + " " + j);
        }else {
            System.out.println("El numero no fue encontrado");
        }
    }
}
