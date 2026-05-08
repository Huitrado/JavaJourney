public class PrecedenciaOperadores {
    public static void main(String[] args) {
        int i = 14;
        int j = 8;
        int k = 20;

        double promedio = (i + j + k) / 3d;
        System.out.println("promedio = " + promedio);

        promedio = i + j + k / (3d * 10);
        System.out.println("promedio = " + promedio);

        promedio = ++i + j-- + k / (3d * 10);//Primero se resuelve el ++i luego se asigna el valor de j y se decrementa en uno. Luego resuelve la division
        //por 10 y se suman los 3 valores (15 + 8 + 66.6)
        System.out.println("promedio = " + promedio);
    }
}
