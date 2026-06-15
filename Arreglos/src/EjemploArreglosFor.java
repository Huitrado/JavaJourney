import java.util.Arrays;

public class EjemploArreglosFor {
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
        System.out.println("======Usando for======");
        for (int i = 0; i < total; i++){
            System.out.println("Para indice " + i + " " + productos[i]);
        }
        System.out.println("======Usando for each======");
        for (String prod:productos){
            System.out.println("Producto = " + prod);
        }
        System.out.println("======Usando while======");

        int i = 0;//Este variable no tiene conflictos con los que estan adentro del for ya que los for solo existen dentro de ese scope
        while(i < total){
            System.out.println("Para indice " + i + " " + productos[i]);
            i++;
        }

        int[] numeros = new int[10];
        int totalNumeros = numeros.length;

        for (int k = 0; k < totalNumeros; k++){
            numeros[k] = k * 3;
        }


        for (int k = 0; k < totalNumeros; k++){
            System.out.println("numeros = " + numeros[k]);
        }





    }
}
