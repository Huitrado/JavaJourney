public class ejemploStringValidar {
    public static void main(String[] args) {
        String curso = null;

        //Importante validar para que
        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);


        if (esNulo == true){
            curso = " ";
        }

        boolean esVacio = curso.length() == 0;

        System.out.println("esVacio = " + esVacio);

        boolean esEmpty = curso.isEmpty();//Si tiene por ejemplo un espacio este es detectado como un caracter y regresa false


        boolean esBlanco = curso.isBlank();//Valida si es blanco o tiene un caracter de espacio en ese caso regresa true
        System.out.println("esBlanco = " + esBlanco);
        if(!esBlanco) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }
        //No se puede concatenar una instancia con una instancia que es null
        //Tira excepcion porque curso es null
    }
}
