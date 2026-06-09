import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Tarea10CalcularEdad {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la fecha en el siguiente formato dd/MM/yyyy: ");
        String fechaNacimiento = scanner.next();

        //Creamos el formato necesario
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaActual = new Date();
        double conversionAnios= 60*60*24*365.25*1000;

        try {
            //Formateamos la fecha de nacimiento del usuario
            Date fechaUsuario = format.parse(fechaNacimiento);
            long fechaMilisegundosUsuario = fechaActual.getTime() - fechaUsuario.getTime();
            double edadUsuario = Math.floor(fechaMilisegundosUsuario/conversionAnios);
            System.out.println("La edad del usuario: " + (int)edadUsuario);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
