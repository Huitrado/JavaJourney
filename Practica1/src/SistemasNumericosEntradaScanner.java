import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Creamos una instancia de la clase Scanner y system.in es el texto que es el input mediante System.in
        System.out.println("Ingrese un numero entero: ");
        //String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;

        try { //Ejecuta ese codigo, pero si sale mal
            numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroStr); //Esta variable solo existe aqui
        } catch (InputMismatchException e){ //Lo captura el catch
            System.out.println("Error debe ingresar un numero entero");
            main(args);//Llamamos al main y cuando se ejecuta todo se sale
            return;
        }


        System.out.println("numeroDecimal = " + numeroDecimal);

        //Lo convertimos a numero binario
        String mensajeBinario = "Numero binario de  = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        int numeroBinario = 0b111110100; //Se coloca 0b antes de un numero binario para que Java lo entiende

        //Sistema Octal
        String mensajeOctal = "Numero Octal de  = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        int numeroOctal = 0764; //Anteponemos el 0 para que entienda que se trata de un numero octal

        //Sistema Hexadecimal
        String mensajeHexadecimal ="Numero Hexadecimal de  de  = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        int numeroHex = 0x1f4;


        //Concatenamos todos los mensajes de numeros
        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal; //Concatenacion
        mensaje += "\n" + mensajeHexadecimal;

        System.out.println(mensaje);
    }
}
