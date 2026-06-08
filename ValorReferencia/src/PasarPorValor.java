public class PasarPorValor {
    public static void main(String[] args) {
        //int i = 10;
        Integer i = 10; //Incluso si usamos clases wrapper, si se pasa por referencia, pero estos objetos son inmutables, osea que cuando
        //se realiza un cambio se crea una nueva instancia
        System.out.println("INiciamos el metodo main con i = " + i);
        test(i);
        System.out.println("Finaliza el metodo main con el valor de i= " + i); //Mientras que aqui sigue teniendo el valor de 10
    }


    public static void test(Integer i){ // Pasamos por referencia //Pasamos por valor, entonces el valor de la variable i solo cambia adentro de este metodo
        System.out.println("Iniciamos el metodo test con i = " + i);
        i = 35;
        System.out.println("Finaliza el metodo test con i = " + i);
    }
}
