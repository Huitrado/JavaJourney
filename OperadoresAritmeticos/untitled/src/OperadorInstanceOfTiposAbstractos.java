public class OperadorInstanceOfTiposAbstractos {
    public static void main(String[] args) {
        Object texto = "Creando un objeto de la clase String"; //texto sigue siendo un objeto de tipo String pero se usa Object ya que es la clase padre de todos los objetos o se le llama root.



        Number num = 7.123f; //Sigue siendo una instancia de Integer pero tambien es de tipo generico Number

        boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo string? " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es del tipo Object? " + b1);

        b1 = texto instanceof Integer;
        System.out.println("texto es del tipo Integer? " + b1);

        b1 = num instanceof Long;
        System.out.println("num es del tipo Long? " + b1);

        b1 = num instanceof Float;
        System.out.println("num es del tipo Float? " + b1);

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
