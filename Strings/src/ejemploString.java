public class ejemploString {
    public static void main(String[] args) {
        String curso = "Programacion Java"; //Es un tipo especial. no es primitivo
        String curso2 = new String("Programacion Java");

        //COMPARACION POR REFERENCIA
        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual);

        //COMPARACION POR VALOR MEDIANTE EL METODO .equals()
        esIgual = curso.equals(curso2);
        System.out.println("esIgual = " + esIgual);

        //IGNORANDO MAYUSCULAS Y MINUSCULAS
        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("esIgual = " + esIgual);

        //COMO YA EXISTE UN OBJETO CON EL MISMO CONTENIDO Y QUE SE DECLARA DE LA MISMA MANERA (IMPLICITA)
        //ENTONCES JAVA INTERPRETA QUE ES EL MISMO OBJETO
        String curso3 = "Programacion Java";
        esIgual = curso == curso3;
        System.out.println("esIgual = " + esIgual);
    }
}
