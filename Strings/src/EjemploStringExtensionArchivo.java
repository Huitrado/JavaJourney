public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "simonWeTraetelos.docx";
        int i = archivo.indexOf(".");
        System.out.println("archivo = " + archivo.substring(i + 1));
    }
}
