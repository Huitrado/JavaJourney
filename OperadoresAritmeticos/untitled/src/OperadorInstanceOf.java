public class OperadorInstanceOf {
    public static void main(String[] args) {
        String texto = "Creando un objeto de la clase String";

        Integer num = new Integer(7); //Java ya hace la chamba de crear una instancia de la clase Integer, no es necesario el new Integer
        //Incluso esta ya deprecado usar el new Integer
        //Hacer uso de estas clases te da acceso a metodos para trabajar con esos datos
        //Todos los primitivos cuentan con una clase wrapper

        boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo string? " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es del tipo Object? " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer? " + b1);

        //SI se intenta hacer instance of de num con short, no se puede ya que son clases en paralelo. La clase padre de todos los primitivos numericos es Number
        Double decimal = 45.45;

        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number? " + b1);

        b1 = num instanceof Object;
        System.out.println("num es del tipo Object? " + b1);

        //instanceof solo se puede usar entre objetos.
    }
}
