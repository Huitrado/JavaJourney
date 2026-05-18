import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        //El switch solo acepta clases primitivos o de referencia, aquellos que usan las clases wrapper como Char, Byte, Int etc.
        //Tambien acepta String
        Scanner s = new Scanner(System.in);
        String nombre = "Andres";
        short num = 3;
        System.out.println("Ingresa un numero de mes del 1 al 12");
        int mes = s.nextInt();
        String nombreMes = null;

        switch (mes){

            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4 :
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
        }


        switch(num){
            case 0:
                System.out.println("El num es cero");
                break;
            case 1:
                System.out.println("El num es uno");
                break;
            case 2:
                System.out.println("El num es dos");
                break;
            case 3:
                System.out.println("El numero es tres");
                break;
            default: //es como el else en el if
                System.out.println("Numero o caracter desconocido.");
        }
        switch (nombre){
            case "admin":
                System.out.println("Hola admin, bienvenido");
                break;
            case "Andres":
                System.out.println("Hola Andres, papu");
                break;

            case "pepe":
                System.out.println("Hola pepe, te amo");
                break;

            default:
                System.out.println("Numero o caracter desconocido");
                break;
        }
    }
}
