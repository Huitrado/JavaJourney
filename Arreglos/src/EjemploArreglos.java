import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

         String[] productos = new String[7]; //Se inicializan los valores en null
        productos[0] = "Coca cola";
        productos[1] = "Manzanita";
        productos[2] = "Iphone 12";
        productos[3] = "Aguita de horchata";
        productos[4] = "Aguita de jamaica";
        productos[5] = "Orden de tacos al pastor";
        productos[6] = "taquitos plus plus";

        Arrays.sort(productos);//Sirve para ordenar el arreglo

        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);
        System.out.println("productos[5] = " + productos[5]);
        System.out.println("productos[6] = " + productos[6]);

        int[] numeros = new int[4]; //Reserva en memoria espacio para 4 elementos

        //Asignamos numeros
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = Integer.parseInt("2");

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1]; // forma de obtener el ultimo elemento de un arreglo

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
