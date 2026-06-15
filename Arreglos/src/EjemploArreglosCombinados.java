public class EjemploArreglosCombinados {
    public static void main(String[] args) {

        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++){
            a[i] = i + 1;
        }

        for (int i = 0; i < b.length; i++){
            b[i] = (i + 1) * 5;
        }


        int aux = 0;
        for (int i = 0; i < 10; i +=2){
            for (int j = 0; j < 2; j++){
                c[aux++] = a[i + j];
            }

            for (int j = 0; j < 2; j++){
                c[aux++] = b[i + j];
            }


        }

        for (int num: c){
            System.out.println("num = " + num);
        }
    }
}
