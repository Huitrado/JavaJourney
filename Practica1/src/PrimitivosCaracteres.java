public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = 'a'; //Un caracter es con comillas simples
        char caracter1 = '\u0040'; //Unicode, cada sistema operativo tiene su lista de unicode
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = caracter " + (decimal == caracter1));
        // Igual se puede saber el unicode en google
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter1));

        //clase equivalente
        char espacio = ' ';//equivalente en unicode \u0020
        System.out.println("char corresponde en \tbyte = " + espacio +Character.BYTES);
        System.out.println("Character size \b= " + Character.SIZE);
        System.out.println("Character \nMIN_Value = " +System.lineSeparator()+ Character.MIN_VALUE);
        System.out.println("Character \rMAX_Value = " + Character.MAX_VALUE);

        //Caracteres especiales
        char retroceso = '\b'; //backspace
        char tabulador = '\t';
        char nuevaLInea = '\n';
        char retornoCarro = '\r';
    }
}
