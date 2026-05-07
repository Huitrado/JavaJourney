public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datoLogico = true;
        boolean datoLogico1 = Boolean.FALSE;
        Boolean datoLogico2 = true; //Ya no es primitivo es referencia de la clase
        System.out.println("datoLogico = " + datoLogico);

        //Sirven para flujos de control, if, while
        double d = 98765.43e-3; //98.76543
        float f = 1.2345e2f; //123.45se coloca f para ser de tipo flotante, si no normalmente es double

        datoLogico = d > f;
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = true;
        System.out.println("esIgual = " + esIgual);
    }
}
