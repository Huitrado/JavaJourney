import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        String texto = "ola q ase";
        Class strClass = texto.getClass(); //Este metodo es parte de la clase Class y regresa una instancia de la misma clase.


        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());

        //Obtenemos todos los metodos de la clase String

        for(Method metodo: strClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }

        //Hacemos una instancia de la clase INteger y obtenemos la clase, luego obtenemos la superclass y superclas de esa misma clase, lo cual nos daria la clase objetc
        Integer num = 43;
        Class intClass =  num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass.getSuperclass" + intClass.getSuperclass());
        System.out.println("intClass.getSupperclass().getSuperclass()" + objClass);

        for(Method metodo: objClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }

    }
}
