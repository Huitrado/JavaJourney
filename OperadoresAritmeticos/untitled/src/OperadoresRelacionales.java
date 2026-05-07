public class OperadoresRelacionales {
    public static void main(String[] args){
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        //Para comparar datos de tipo primitivos se usa el ==, para clases se utiliza el metodo equals()
        boolean booleano1 = i == j;
        System.out.println("booleano1 = " + booleano1);

        //Invierte el valor != negacion
        boolean booleano2 = !booleano1;
        System.out.println("booleano2 = " + booleano2);

        boolean booleano3 = i != j; //<>
        System.out.println("booleano3 = " + booleano3);

        boolean booleano4 = m == true;

        boolean booleano6 = i > j;
        System.out.println("booleano6 = " + booleano6);

        boolean booleano7 = i < j;
        System.out.println("booleano7 = " + booleano7);
    }
}
