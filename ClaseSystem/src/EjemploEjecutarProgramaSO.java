import java.io.IOException;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();//Cuando ejecutamos un programa como el notepad retorna un objeto de tipo Process
        Process proceso;

        try {
            if (System.getProperty("os.name").contains("Ubuntu")) {
                proceso = rt.exec("Clocks");
            } else {
                proceso = rt.exec("gedit");    
            }
            proceso.waitFor();
        } catch (IOException ex) {

            System.err.println("El comando es desconocido" + ex.getMessage());
            System.exit(1);

        } catch (InterruptedException e) {

            throw new RuntimeException(e);

        }
        System.out.println("Se ha cerrdo el editor");
    }
}
