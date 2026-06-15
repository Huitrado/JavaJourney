public class EjemploArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int[] numeros2 = new int[10];
        for (int i =0; i < numeros.length; i++){
            numeros[i] = i + 1;
        }

        int aux = 0;
        for (int i = 0; i < numeros.length/2; i++){
            numeros2[aux++] = numeros[i];
            numeros2[aux++] = numeros[numeros.length - 1 - i];
            //System.out.print(numeros[i] + " ");
            //System.out.println(numeros[numeros.length -1 -i]);
        }

        for (int i = 0; i < numeros2.length; i++){
            System.out.println("Arreglo numeros2 en el indice " + i + " " + numeros2[i]);
        }

    }
}
