public class Simonwe {
    public static void main(String[] args) {
        String tema = "Manejo de \"String\"";
        System.out.println("tema = " + tema);

        //CONCATENACION
        String nombre = "Uriel";
        String apellido = "Castillo";

        String nombreCompleto = nombre + apellido;

        //COMPARAR STRINGS
        String str1 = "Hola Andres";
        String str2 = new String("Hola Andres");

        System.out.println("SOn el mismo Objeto?" + (str1 == str2));
        System.out.println("Contienen el mismo: " + str1.equals(str2));

        //METODOS DE LA CLASE
        //int indexOf(String cadena)
    }
}
