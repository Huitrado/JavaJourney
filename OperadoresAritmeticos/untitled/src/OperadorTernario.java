import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        //El operador ternario asigna o devuelve valor dependiendo el valor, si es true or false

        //variable = condicion ? (si es verdadero regresa un valor) : (Si es falso regresa otro)

        String variable = 7 == 7 ? "True":"False";
        System.out.println("variable = " + variable);
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la nota de mates entre 2.0 - 7.0");
        matematicas = scanner.nextDouble();
        System.out.println("Ingresa la nota de ciencias entre 2.0 - 7.0");
        ciencias = scanner.nextDouble();
        System.out.println("Ingresa la nota de historia entre 2.0 - 7.0");
        historia = scanner.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;

        String estado = "";
        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("Su promedio es de = " + promedio);
        System.out.println("estado = " + estado);
    }
}
