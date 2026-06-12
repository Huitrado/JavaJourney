import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            //Tanto la clase FileInputStream como el p.load piden el manejo de errores
            FileInputStream archivo = new FileInputStream("src/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);//Cargamos el archivo de configuracion de propiedades en el objeto p
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties"); //agregar una propiedad
            System.setProperties(p);
            System.getProperties().list(System.out);
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));
        } catch (Exception e) {
            System.err.println("No existe el archivo: " + e); //System.err hace que se muestre en rojo como un error
            System.exit(1); //Generalmente se usa el numero uno cuando ocurre un error en el flujo del programa
            throw new RuntimeException(e);
        }
    }
}
