import javax.swing.*;

public class ActividadWrapper {
    public static void main(String[] args) {
        String cantidadString = JOptionPane.showInputDialog(null,"Ingresa la cantidad de productos: ");
        String precioUnitarioString = JOptionPane.showInputDialog(null, "Ingresa el precio unitario");

        Integer cantidad = Integer.parseInt(cantidadString);
        Integer precioUnitario = Integer.parseInt(precioUnitarioString);

        int total = precioUnitario * cantidad;

        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: " + precioUnitario);
        System.out.println("Total: " + total);
        boolean promocion = total >= 100;

        if(promocion){
            System.out.println("Aplica promocion? Si");
        }else {
            System.out.println("Aplica promocion?: No");
        }
    }
}
