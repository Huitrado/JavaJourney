package org.lhuitrado.appfacturas;

import org.lhuitrado.appfacturas.models.*;


import java.util.Date;
import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setRfc("Simon 1234");
        cliente.setNombre("David Yoel");

        Date fecha = new Date();
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la descripcion de la factura: ");
        String desc = s.nextLine();
        Factura factura = new Factura(desc, cliente, fecha);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        System.out.println();

        for (int i  = 0; i < 5; i++){
            producto = new Producto();
            System.out.print("Ingrese producto n° " + producto.getCodigo() + ": ");
            nombre = s.nextLine();
            producto.setNombre(nombre);

            System.out.print("Ingrese el precio : $");
            precio = s.nextFloat();
            producto.setPrecio(precio);

            System.out.print("Ingrese la cantidad: ");
            cantidad = s.nextInt();

            ItemFactura item = new ItemFactura(cantidad, producto);
            factura.addItemFactura(item);
            System.out.println();

            s.nextLine(); //Esto limpia el buffer del teclado
        }
        System.out.println(factura.generarDetalle());
    }
}
