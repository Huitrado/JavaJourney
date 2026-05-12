import javax.swing.*;
import java.util.Arrays;

public class NombreLargo {
    public static void main(String[] args) {
        String nombreApellido1 = JOptionPane.showInputDialog("Ingresa tu nombres con apellidos del primer familiar");
        String nombreApellido2 = JOptionPane.showInputDialog("Ingresa tu nombres con apellidos del segundo familiar");
        String nombreApellido3 = JOptionPane.showInputDialog("Ingresa tu nombres con apellidos del tercer familiar");

        String[] nombreSeparado1 = nombreApellido1.split(" ");
        String[] nombreSeparado2 = nombreApellido2.split(" ");
        String[] nombreSeparado3 = nombreApellido3.split(" ");

        String[] nombreLargo = (nombreSeparado1[0].length() > nombreSeparado2[0].length()) ? nombreSeparado1 : nombreSeparado2;
        nombreLargo = (nombreLargo[0].length() > nombreSeparado3[0].length()) ? nombreLargo : nombreSeparado3;


        System.out.println(nombreLargo[0] + " " +nombreLargo[1] +" es el nombre mas largo");
    }
}
