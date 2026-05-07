import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Hacemos una instancia del objeto scanner

        System.out.println("Ingresa el nombre de la factura: ");
        String nombreFactura = scanner.nextLine();
        System.out.println("Ingresa el precio del primer producto: ");
        double producto1 = scanner.nextDouble();
        System.out.println("Ingresa el precio del segundo producto:");
        double producto2 = scanner.nextDouble();

        double total = producto1 + producto2;
        double impuesto = total * 0.19;

        String goodbyeWorldThisIsMyFinalMessage = "La factura " + nombreFactura + " tiene un total bruto de " + total + " con un impuesto de " + impuesto
                + " y el monto despues de impuesto es de " + (total + impuesto);

        System.out.println(goodbyeWorldThisIsMyFinalMessage);

        scanner.close();
    }
}
