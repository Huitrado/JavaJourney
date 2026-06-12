public class ArgumentosLineaComando1 {
    public static void main(String[] args) {
        //Para compilar primero ingresas a la carpeta source donde esta la clase y usas el comando javac con el nombre de la clase
        //Luego para correr usas el comando java con el nombre de la clase y posteriormente le ingresas los argumentos si es necesario.
        if (args.length == 0){
            System.out.println("Debes ingresar argumentos o parámetros");
            System.exit(-1); //El -1 es para indicar que hay un error
        }
        for (int i  = 0; i < args.length; i++){
            System.out.println("args = " + args[i]);
        }
    }
}
