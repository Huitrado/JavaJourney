import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();//Esta es una clase abstracta, entonces para crear la instancia se usa un metodo, ya que por debajo crea la instancia

        //calendario.set( 2026, Calendar.SEPTEMBER, 8, 0, 20, 10);

        //LO siguiente es lo mismo de arriba
        calendario.set(Calendar.YEAR, 2026);
        calendario.set(Calendar.MONTH, Calendar.JUNE);
        calendario.set(Calendar.DAY_OF_MONTH, 8);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.HOUR_OF_DAY, 21);//Formato de 24 horas
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);

        Date fecha = calendario.getTime();
        System.out.println("Fecha sin formato = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaFormato = formato.format(fecha);
        System.out.println("Fecha con formato = " + fecha);
    }
}
