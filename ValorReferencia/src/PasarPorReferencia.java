

public class PasarPorReferencia {
    public static void main(String[] args) {
        int[] edad ={10, 11, 12};

        System.out.println("Iniciamos el metodo main con i = i");

        for(int i = 0; i < edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }

        test(edad);

        for(int i = 0; i < edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }

    }

    public static void test(int[] edadArr){
        System.out.println("Iniciamos el metodo test");
        for (int i = 0; i <edadArr.length; i++){
            edadArr[i] = edadArr[i] + 20;
        }
        System.out.println("Finaliza el metodo test");
    }
}
