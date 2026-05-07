public class ejemploStringMetodosArreglo {
    public static void main(String[] args) {

        //Estos metodos regresan una nueva instancia, y no cambian la instancia original, eso se le llama inmutabilidad
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();// Forma de declarar un arreglo
        int largo = arreglo.length; //length en un arreglo es un atributo, por eso no lleva parentesis
        for(int i = 0 ;  i < largo; i++){
            System.out.print(arreglo[i]); //Se usa print en vez de println
        }

        System.out.println("\n");
        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));//Esto muestra la referencia o el hash del arreglo

        String[] arreglo2  = trabalenguas.split("a");
        int l = arreglo2.length;
        for (int i = 0; i<l; i++){
            System.out.println(arreglo2[i]);
        }

        String archivo = "alguna.imagen.pdf";

        String[] archivoArr = archivo.split("\\."); //Se coloca doble backslash porque el punto es un caracter especial de las regex
        l = archivoArr.length;
        for (int i = 0; i<l; i++){
            System.out.println(archivoArr[i]);
        }

        System.out.println("extension = " + archivoArr[l - 1]); //Archivo Arr, es una arreglo que guarda los pedazos en los que se partio el nombre del archivo

    }
}
