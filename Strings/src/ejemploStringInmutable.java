public class ejemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programacion Java"; //Es un tipo especial. no es primitivo
        String profesor = "David Yoel";

        //STRING SON INMUTABLES Y .CONCAT CREA UNA NUEVA INSTANCIA
        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        //EXPRESIONES LAMDA
        String resultado2 = curso.transform((c) -> {
            return c + " con" + profesor;
        });

        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);

        //REPLACE
        String resultado3 = resultado.replace("a", "A");
        System.out.println("resultado3 = " + resultado3);

        //CUALQUIER METODO QUE MODIFIQUE LA STRING VA A CREAR UNA NUEVA INSTANCIA

    }
}
