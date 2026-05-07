public class PrimitivosFloat {

    static float varFlotante;
    public static void main(String[] args) {

        float realFloat = 1.5e-10f;//0.000000000015f; //poner f o F al final de la variable para indicar que es de tipo flotantes
        System.out.println("realFloat = " + realFloat);

        System.out.println("Float corresponde en byte a: " + Float.BYTES);
        System.out.println("Float corresponde en bites a: " + Float.SIZE);
        System.out.println("Valor maximo de float : " + Float.MAX_VALUE);
        System.out.println("Valor minimo de float : " + Float.MIN_VALUE);

        //Double
        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Double corresponde en byte a: " + Double.BYTES);
        System.out.println("Double corresponde en bites a: " + Double.SIZE);
        System.out.println("Valor maximo de Double : " + Double.MAX_VALUE);
        System.out.println("Valor minimo de Double : " + Double.MIN_VALUE);

        var varFlotante = 3.1416; //Al tener el punto se convierte en una variable de tipo double pero si quiero flotante se agrega el f.
        System.out.println("varFlotante = " + varFlotante);

        //float varFlotante;
        System.out.println("varFlotante = " + varFlotante);
    }
}
