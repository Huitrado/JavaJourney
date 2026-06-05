public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1; //Forma implicita


        System.out.println("Son el mismo objeto?" + (num1 == num2)); //Aqui esta comparando por la instancia, o si ambos objetos corresponden a la misma instancia.

        num2 = 1000;

        System.out.println("Tienen el mismo valor?" + (num1.equals(num2))); //Aqui esta comparando por el valor
        System.out.println("Tienen el mismo valor?" + (num1.intValue() == num2.intValue()));//Aqui seguimos comparando por el mismo valor, ya que obtenemos los valores de tipo int primitivo.

        boolean condicion = num1 > num2;//Cuando usamos operadores relacionales se hace auto unboxing, osea invocar el metodo intValue() y compararlos.
        System.out.println("condicion = " + condicion);

    }
}
