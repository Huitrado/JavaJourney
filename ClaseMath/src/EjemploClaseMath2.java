public class EjemploClaseMath2 {
    public static void main(String[] args) {

        //Constante exponencial
        double exp = Math.exp(2); // la constante e ^ 1
        System.out.println("exp = " + exp);

        //LOgaritmo natural
        double log = Math.log(10); //Logaritmo natural de 10
        System.out.println("log = " + log);

        //Potencia
        double potencia = Math.pow(10,3);
        System.out.println("potencia = " + potencia);

        //Raiz cuadrada
        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        //Convertir radianes a grados
        double grados = Math.round(Math.toDegrees(1.57));
        System.out.println("Convertimos radianes a grados = " + grados);

        //Convertir grados a radianes
        double radianes = Math.toRadians(90.00);
        System.out.println("Convertimos de grados a radianes = " + radianes);

        //Para sacar el seno de un valor, el valor debe estar en radianes
        System.out.println("sen(90) = " + Math.sin(radianes));
        System.out.println("cos(90) = " + Math.cos(radianes));

        radianes = Math.toRadians(180.00);
        System.out.println("cos(180) = " + Math.cos(radianes));
    }
}
