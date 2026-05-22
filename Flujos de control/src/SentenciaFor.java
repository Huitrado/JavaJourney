public class SentenciaFor {
    public static void main(String[] args) {
        System.out.println("Primer for");
        for (int i = 0; i < 5; i++){
            System.out.println("i = " + i);
        }
        System.out.println("Segundo for");
        for (int i = 10; i >= 0; i--){
            System.out.println("i = " + i);
        }

        for (int i = 1, j = 10; i<j; i++, j--){
            System.out.println(i + "-" + j);
        }
        System.out.println("For que imprime los numeros impares");
        for (int i = 0; i <= 10; i++){
            if(i % 2 == 0){
                continue; //Continue hace que se salte la iteracion actual
            }
            System.out.println("i = " + i);
        }

    }
}
