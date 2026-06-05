public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2;
        Boolean objetoBoolean = Boolean.valueOf(primBoolean); //Este es el boxing, ya que pasamos de un tipo primitivo a usar la clase wrapper Boolean
        Boolean objetoBoolean2 = Boolean.valueOf("false");

        //Con las clases wrapper Boolean tanto el == como el equals() van a comparar por el valor.
        System.out.println("Comparando dos objetos boolean: " + (objetoBoolean == objetoBoolean2));
        System.out.println("Comparando dos objetos boolean: " + (objetoBoolean.equals(objetoBoolean2)));
    }
}
