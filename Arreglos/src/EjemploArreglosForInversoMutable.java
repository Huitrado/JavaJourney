import java.util.Arrays;

public class EjemploArreglosForInversoMutable {
    //Metodo que ordena el arreglo de manera inversa
    public static void arregloInverso(String[] arreglo){
        int total = arreglo.length;
        for (int i = 0; i < total/2; i++){
            String actual = arreglo[i];
            String inverso =  arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total - 1 - i] = actual;
        }
    }
    public static void main(String[] args) {

        String[] productos = new String[7]; //Se inicializan los valores en null
        int total = productos.length;
        productos[0] = "Coca cola";
        productos[1] = "Manzanita";
        productos[2] = "Iphone 12";
        productos[3] = "Aguita de horchata";
        productos[4] = "Aguita de jamaica";
        productos[5] = "Orden de tacos al pastor";
        productos[6] = "taquitos plus plus";

        Arrays.sort(productos);
        System.out.println("====== Usando for ======");
        for (int i = 0; i < total; i++){
            System.out.println("Para indice " + i + " " + productos[i]);
        }

        arregloInverso(productos);

        /*for (int i = 0; i < total/2; i++){
            String actual = productos[i];
            String inverso = productos[total - 1 - i];
            productos[i] = inverso;
            productos[total - 1 - i] = actual;
        }
*/
        System.out.println("====== Usando for inverso ======");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " " + productos[i]);
        }

    }
}
