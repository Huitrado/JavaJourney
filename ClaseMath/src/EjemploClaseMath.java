public class EjemploClaseMath {
    public static void main(String[] args) {

        //Esta clase esta hecha para que no pueda crear nuevas instancia con el operador "new"
        //Asi solo se puede acceder a los metodos o invocarlos de forma estatica

        //Calcular el valor absoluto de numero entero
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        //Calcular el maximo entre dos numeros
        double max = Math.max(3.5,1.2);
        System.out.println("max = " + max);

        //Calcular el minimo entre dos numeros
        double min = Math.min(1.5, 1.2);
        System.out.println("min = " + min);

        //Como redondear hacia arriba
        double ceil = Math.ceil(3.5);
        System.out.println("ceil = " + ceil);

        //Como redondear hacia abajo
        double floor =  Math.floor(3.5);
        System.out.println("floor = " + floor);

        //Como redondear en automatico si es arriba de .5 hacia arriba y si es menor hacia abajo
        long entero = Math.round(3.5);
        System.out.println("entero = " + entero);

        //Constante PI
        double Pi = Math.PI;
        System.out.println("Pi = " + Pi);
    }
}
