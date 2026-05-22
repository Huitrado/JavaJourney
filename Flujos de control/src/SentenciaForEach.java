public class SentenciaForEach {
    public static void main(String[] args) {
        //For each se usa para iterar sobre arreglos u objetos que sean iterables
        int [] numeros = {1, 3, 5, 7, 9, 11, 13, 15};
        String[] nombres2 =  {"Andres", "Pepe", "Maria", "Pepa", "Lalo", "Bea", "Pato", "Pepa"};
        for(int num: numeros){ //Asigna los valores del arreglo a la variable num
            System.out.println("num = " + num);
        }

        for (String nombre: nombres2){
            System.out.println("nombre = " + nombre);
        }

    }
}
