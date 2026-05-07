public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        //Clase BYTE
        System.out.println("tipo byte corresponde en byte a: " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a: " + Byte.SIZE);
        System.out.println("valor maximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("valor minimo de un byte: " + Byte.MIN_VALUE);

        short numeroShort = 32767; // Valor maximo que soporta el short
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en byte a: " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a: " + Short.SIZE);
        System.out.println("valor maximo de un short: " + Short.MAX_VALUE);
        System.out.println("valor minimo de un short: " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo Integer corresponde en byte a: " + Integer.BYTES);
        System.out.println("tipo Integer corresponde en bites a: " + Integer.SIZE);
        System.out.println("valor maximo de un Integer: " + Integer.MAX_VALUE);
        System.out.println("valor minimo de un Integer: " + Integer.MIN_VALUE);


        long numeroLong = 9223372036854775807L; //Se debe que poner una L mayuscula para indicar que es un long
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo Long corresponde en byte a: " + Long.BYTES);
        System.out.println("tipo Long corresponde en bites a: " + Long.SIZE);
        System.out.println("valor maximo de un Long: " + Long.MAX_VALUE);
        System.out.println("valor minimo de un Long: " + Long.MIN_VALUE);

        var numeroVar = 12779787654465L;



    }
}
