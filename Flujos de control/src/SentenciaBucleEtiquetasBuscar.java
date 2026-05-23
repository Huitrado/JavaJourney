public class SentenciaBucleEtiquetasBuscar {
    public static void main(String[] args) {
        String frase = "tres tristes tigres tragan trigo en un trigal";
        String palabra = "trigo";

        int countFrase = frase.length();
        int countPalabra = palabra.length();
        int cantidad = 0;
        char letra = 'g';

        buscar:
        for (int i = 0; i < countFrase; ){
            int k = i;
            for (int j = 0; j < countPalabra; j++){
                if (frase.charAt(k++) != palabra.charAt(j)){ // usamos k como un tercer iterador ya que si usamos i estaria comparando cada letra de la frase con cada letra de la palabra individualmente
                    i++;
                    continue buscar;
                }

            }
            cantidad++;
            i += countPalabra; //cuando encuentra la palabra, hacemos que el iterador i sigue al final de la palabra trigo.
        }
        System.out.println("Encontrado = " + cantidad + " veces el caracter " + letra + " en la frase");
    }
}
