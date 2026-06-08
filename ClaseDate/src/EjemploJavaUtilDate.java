import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd/MMMM/yyyy");//Formato para que muestre la fecha
        String fechaStr = df.format(fecha); //usamos el metodo format que recibe la instancia fecha para que formatee

        long j = 0;
        for (int i = 0; i< 100000000; i ++){
            j += i;
        }

        Date fecha2 = new Date();
        long tiempoFinal =fecha2.getTime() - fecha.getTime(); //Obtenemos la cantidad de milisegundos que tardo en ejecutarse el for
        System.out.println("Tiempo transcurrido en el ciclo for = " + tiempoFinal);
        System.out.println("fechaStr = " + fechaStr);

    }
}
