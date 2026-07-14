import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EjemploOrdenes {
    public static void main(String[] args) {
        Date fechaActual = new Date();
        OrdenCompra orden1 = new OrdenCompra("Orden de compra Numero 1. ");
        OrdenCompra orden2 = new OrdenCompra("Orden de compra Numero 2. ");
        OrdenCompra orden3 = new OrdenCompra("Orden de compra Numero 3. ");

        orden1.setCliente(new Cliente("Luis", "Huitrado"));
        orden1.setFecha(fechaActual);
        orden2.setCliente(new Cliente("Dabid", "Yoel"));
        orden2.setFecha(fechaActual);
        orden3.setCliente(new Cliente("Miriam", "Marquez"));
        orden3.setFecha(fechaActual);


        orden1.addProducto(new Producto("Lala", "Leche Deslactosada 1 Galon", 55));
        orden1.addProducto(new Producto("El Panque", "Morenas", 35));
        orden1.addProducto(new Producto("Bimbo", "Panque Marmoleado", 54));
        orden1.addProducto(new Producto("Marinela", "Principe", 25));

        orden2.addProducto(new Producto("Malboro", "Cigarros feos", 70));
        orden2.addProducto(new Producto("The Coca Cola Company", "Coca Cola 3 Lts", 55));
        orden2.addProducto(new Producto("Kraken", "Kraken", 200));
        orden2.addProducto(new Producto("Grupo peniafiel", "Penafiel", 30));

        orden3.addProducto(new Producto("Crema del rancho", "De la de 40", 40));
        orden3.addProducto(new Producto("Tortilleria Balorant", "1kg de tortillas Phoenix por favor", 35));
        orden3.addProducto(new Producto("Fud", "1kg de salchicha de pavo", 50));
        orden3.addProducto(new Producto("Tajin", "Tajin", 30));

        System.out.println(orden1.verDetalle());
        System.out.println(orden2.verDetalle());
        System.out.println(orden3.verDetalle());
    }
}