public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        //String de un real a un tipo double
        String realStr = "975321.89e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        //Conversion a String a booleano primitivo
        String logicoStr = "TrUe"; //SOlo aplica true o false como string
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        var numeroStr2 = "123415.e4";
        var numeroInt2 = Double.parseDouble(numeroStr2);
        System.out.println("numeroStr2 = " + numeroInt2);

        //CONVERSION DE PRIMITIVOS A STRING
        //Usando clase Wrapper Integer
        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        //Con clase wrapper String
        otroNumeroStr = String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        //Double a String
        double otroRealDouble = 1.2134e4;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        //Usando clase Wrapper String
        otroRealStr = String.valueOf(1.4568e3f);
        System.out.println("otroRealStr = " + otroRealStr);

        boolean otroBoolean = true;
        String otroBooleanStr = Boolean.toString(otroBoolean);
        System.out.println("otroBooleanStr = " + otroBooleanStr);

        //CONVERSION DE PRIMITIVOS A PRIMITIVOS
        int i = 1;
        short s = (short)i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        char c = (char) i;
        System.out.println("c = " + c);
        float f = (float) i;
        System.out.println("f = " + f);

    }
}
