import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero: ");
        int numeroDecimal = 0;

        try { //Ejecuta ese codigo, pero si sale mal
            numeroDecimal = Integer.parseInt(numeroStr); //Esta variable solo existe aqui
        } catch (NumberFormatException e){ //Lo captura el catch
            JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero");
            main(args);//Llamamos al main y cuando se ejecuta todo se sale
            return;
        }


        System.out.println("numeroDecimal = " + numeroDecimal);

        //Lo convertimos a numero binario
        String mensajeBinario = "Numero binario de  = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);
        int numeroBinario = 0b111110100; //Se coloca 0b antes de un numero binario para que Java lo entiende
        System.out.println("numeroBinario = " + numeroBinario);

        //Sistema Octal
        String mensajeOctal = "Numero Octal de  = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);

        int numeroOctal = 0764; //Anteponemos el 0 para que entienda que se trata de un numero octal

        //Sistema Hexadecimal
        String mensajeHexadecimal ="Numero Hexadecimal de  de  = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHexadecimal);

        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);

        //Concatenamos todos los mensajes de numeros
        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal; //Concatenacion
        mensaje += "\n" + mensajeHexadecimal;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
