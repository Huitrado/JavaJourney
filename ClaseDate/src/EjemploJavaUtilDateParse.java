import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");//Indicamos el patron que se debe respetar que el usuario va a colocar


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd': ");
        try {
            Date fecha = format.parse(scanner.next()); //Agarra una string y la formatea con un formato previamente creado
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();

            //Comparar fecha con los metodos after, before, equals
            if (fecha.after(fecha2)){
                System.out.println("Fecha del usuario es despues que la fecha actual");
            }else if (fecha.before(fecha2)){
                System.out.println("Fecha del usuario es antes que la fecha actual");
            } else if (fecha.equals(fecha2)) {
                System.out.println("Fecha del usuario es igual a la fecha actual");
            }

            //COmparar fecha con el metodo compareTo
            if (fecha.compareTo(fecha2) > 0){
                System.out.println("Fecha del usuario es despues que la fecha actual");
            }else if (fecha.compareTo(fecha2) < 0){
                System.out.println("Fecha del usuario es antes que la fecha actual");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("Fecha del usuario es igual a la fecha actual");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
