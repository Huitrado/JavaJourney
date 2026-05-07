public class ejemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Deivid";

        String nombres2 = "Huitrado";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Deivid\") = " + nombre.equals(nombres2));
        System.out.println("nombre.equalsIgnoreCase(\"deivid\") = " + nombre.equalsIgnoreCase("deivid"));
        System.out.println("nombre.compareTo() = " + nombre.compareTo("Deivid")); //Compara dos valores lexicograficamente
        System.out.println("nombre = " + nombre.charAt(0)); //Regresa el caracter en el indice establecido
        System.out.println("nombre = " + nombre.charAt(5));
        System.out.println("nombre = " + nombre.charAt(nombre.length() - 1));
        System.out.println("nombre = " + nombre.substring(4)); //Regresa el nombres desde el caracter en el indice 4
        System.out.println("nombre = " + nombre.substring(2,5));
        System.out.println("nombre = " + nombre.substring(nombre.length() - 1));

        //Estos metodos regresan una nueva instancia, y no cambian la instancia original, eso se le llama inmutabilidad
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \"@\") = " + trabalenguas.replace("a", "@"));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a')); //Regresa la primera ocurrencia del caracter o string especificado
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); //regresa la ultima ocurrencia
        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf('z')); //Caracter que no existe, regresa -1
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));//Retorna true or false si hay un string dentro de otro string
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"tra\") = " + trabalenguas.startsWith("tra"));//Revisa si empieza con un prefijo
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));//Revisa si termina con un sufijo
        System.out.println("   trabalenguas   ");
        System.out.println("   trabalenguas   ".trim()); //Quita espacios

    }
}
