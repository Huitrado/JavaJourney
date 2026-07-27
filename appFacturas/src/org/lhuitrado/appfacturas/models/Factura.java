package org.lhuitrado.appfacturas.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items; //Factura e itemFactura tiene una relacion de uno a muchos, es conocida como agregacion, por ello se usa el metodo add
    private int indiceItems;
    public static final int MAX_ITEMS = 10;
    private static int ultimoFolio;


    public Factura(String descripcion, Cliente cliente, Date fecha) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.fecha = fecha;
        this.folio = ++ultimoFolio;
    }

    public int getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemFactura(ItemFactura item) {
        if (indiceItems < MAX_ITEMS) {
            this.items[indiceItems++] = item;
        }

    }

    public float calcularTotal() {
        float total = 0.0f;
        for (ItemFactura item : this.items) {
            if (item == null) {
                continue;
            }
            total += item.calcularImporte();
        }
        return total;
    }

    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura N: ");
        sb.append("Folio ")
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\t RFC: ")
                .append(cliente.getRfc())
                .append("\nDescripcion: ")
                .append(this.descripcion);


        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM 'del' yyyy");

        sb.append("Fecha Emision: ").append(df.format(this.fecha))
                .append("\n")
                .append("\n")
                .append("\n#\tNombre\t$\tCant.\tTotal\n");

        for (ItemFactura item: this.items){
            if(item == null){
                continue;
            }

            sb.append(item.getProducto().getCodigo())
                    .append("\t")
                    .append(item.getProducto().getNombre())
                    .append("\t")
                    .append(item.getProducto().getPrecio())
                    .append("\t")
                    .append(item.getCantidad())
                    .append("\t")
                    .append(item.calcularImporte())
                    .append("\n");
        }
        sb.append("\nGran Total: ").append(calcularTotal());

        return sb.toString();
    }
}
