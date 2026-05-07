public class ejemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programacion Java"; //Es un tipo especial. no es primitivo
        String profesor = "David Yoel";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println("detalle = " + detalle);

        int numeroA = 10;
        int numeroB = 5;

        //PRECEDENCIA DE LOS OPERADORES
        System.out.println(detalle + " " + (numeroA + numeroB));
        System.out.println(numeroA + numeroB + detalle);

        String detalle2 = curso.concat(" con ".concat(profesor));
        System.out.println("detalle2 = " + detalle2);
    }
}
