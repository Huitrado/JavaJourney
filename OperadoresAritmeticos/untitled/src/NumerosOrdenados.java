import java.util.Scanner;

public class NumerosOrdenados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
        double num1 = scanner.nextDouble();
        System.out.println("Ingresa el segundo numero");
        double num2 = scanner.nextDouble();

        String numerosOrdenados = (num1 > num2) ? (num1 + " " + num2) : (num2 + " " +num1);
        System.out.println("numerosOrdenados = " + numerosOrdenados);

        scanner.close();
    }
}
