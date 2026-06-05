public class WrapperInteger {
    public static void main(String[] args) {
        //These are objects with an Integer wrapper class
        Integer intObjeto = new Integer(34768);//Esta forma esta obsoleta o deprecated
        Integer intObjeto1 = Integer.valueOf(32768);//Esta forma es llamada boxing
        Integer intObjeto2 = 32768;//Esta forma es llamada autoboxing. o implicit



        //Conversion from a reference type to a primitive data type
        int num = intObjeto; //Forma implicita de convertirlo a un valor de tipo primitivo
        int num2 = intObjeto.intValue();

        String valorTvLcd = "68254";

        Integer valorString = Integer.valueOf(valorTvLcd);
        System.out.println("valorString = " + valorString);

        Short shortObjeto = 32767;
        Short shortObjeto1 = intObjeto1.shortValue(); //there might be loss of information if the converted number is exceeding the range limits of the Short wrapper class

        Byte byteObjeto = intObjeto.byteValue();

    }
}
