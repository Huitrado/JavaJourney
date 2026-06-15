import java.util.Arrays;

public class EjemploArreglosForInverso {
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

        System.out.println("====== Usando for inverso ======");
        for (int i = total - 1; i >= 0; i--){
            System.out.println("productos = " + productos[i]);
        }
    }
}
