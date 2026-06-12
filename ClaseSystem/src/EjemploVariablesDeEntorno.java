import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        //El Map se debe declarar el tipo de variable que almacenan, tanto la llave como el valor pueden ser de tipos distintos
        Map<String, String> varEnv = System.getenv();//Es un diccionario donde puedes guardar objetos o datos que son asociados con una llave
        System.out.println("Variable de ambiente del sistema = " + varEnv);

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);

        String path = System.getenv("Path");
        System.out.println("path = " + path);

        String path2 = varEnv.get("Path"); //EL nombre es la llave ya que lo obtiene del diccionario donde guardamos las variables del ambiente
        System.out.println("path = " + path);

        for (String key: varEnv.keySet()){ //el metodo keySet() regresa un conjunto con todas las llaves que son los nombres de las variables de entorno del sistema
            System.out.println(key + "==>" + varEnv.get(key));
        }
    }
}
