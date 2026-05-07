public class OperadoresIncrementales {
    public static void main(String[] args){
        int i = 1;
        int j = ++i; //Preincremento i = i + 1 Primero se incrementa y luego se asigna el valor
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Postincremento
        i = 2;
        System.out.println("valor inicial de i = " + i);
        j = i++; //Primero se asigna el valor de i y luego se incremento
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Predecremento
        i = 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("i = " + i);

        //Postdecremento
        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("j = " + (++j)); //Vale 5 y lo muestra
        System.out.println("j = " + (j++)); //Vale 5, lo muestra y despues lo incrementa y el valor es 6

        for(i = 0; i < 5; i++){
            System.out.println("i = " + i);
        }
        System.out.println("i = " + i);
    }
}
