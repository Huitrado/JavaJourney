import java.util.Arrays;
import java.util.Comparator;

public class EjemploArreglosForOrdenamientoBurbuja {
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

    //Metodo que recibe un arreglo de tipo Object, ya que lo queremos reutilizar para cualquier tipo de arreglos
    public static void  sortBurbuja(Object[] arreglo){ //NO regresa nada
        int total = arreglo.length;

        for (int i = 0; i < total - 1; i++){
            for (int j = 0; j < total - 1 - i; j++){ //Este le restamos i ya que en cada iteracion de i significa que ya ordenamos un elemento en la posicion total - i
                if (((Comparable) arreglo[j+1]).compareTo(arreglo[j]) < 0){ //Es necesario castearlo a Comparable asi se accede al metodo compareTo
                    Object aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
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

        //Arrays.sort(productos);
        System.out.println("====== Usando for ======");
        for (int i = 0; i < total; i++){
            System.out.println("Para indice " + i + " " + productos[i]);
        }

        sortBurbuja(productos);


        System.out.println("====== Usando for inverso ======");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " " + productos[i]);
        }

        Integer[] numeros = new Integer[4];
        numeros[0] = 10;
        numeros[1] = 7;
        numeros[2] = 35;
        numeros[3] = -1;

        sortBurbuja(numeros);

        System.out.println("====== Usando for ======");
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Para indice " + i + " " + numeros[i]);
        }

    }
}
