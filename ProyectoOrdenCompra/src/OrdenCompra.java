import java.util.Date;

public class OrdenCompra {
    private Integer ordenId;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private int cantidadProductos = 0;
    private static Integer id = 1;


    public OrdenCompra(String descripcion){
        this.descripcion = descripcion;
        this.ordenId = id++;
        this.productos = new Producto[4];
    }

    public Integer getId(){
        return this.ordenId;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public Date getFecha(){
        return this.fecha;
    }

    //Realizar getters de cliente y de Producto[]
    public Cliente getCliente(){
        return this.cliente;
    }

    public Producto[] getProductos(){
        return this.productos;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void setFecha(Date fecha){
        this.fecha = fecha;
    }

    public void addProducto(Producto producto){
        //Verificamos que la cantidad de productos
        if (this.cantidadProductos < this.productos.length){
            this.productos[cantidadProductos++] = producto;
        }
    }

    public int obtenerPrecioTotal(){
        int total = 0;
        for (Producto p: productos){
            total += p.getPrecio();
        }
        return total;
    }

    public StringBuilder verDetalle(){

        StringBuilder sb = new StringBuilder();

        sb.append("\nOrden id: " + this.getId());
        sb.append("\nFecha: " + this.getFecha());
        sb.append("\nCliente: " + this.getCliente());
        sb.append("\nDescripcion: " + this.getDescripcion());

        if (this.cantidadProductos >= 0){
            sb.append("\nProductos: ");
            for (Producto p: productos){
                sb.append("\nFabricante: " + p.getFabricante());
                sb.append("\nNombre: " + p.getNombre());
                sb.append("\nPrecio: " + p.getPrecio() + "\n");
            }
        }

        sb.append("Precio total: " + this.obtenerPrecioTotal());

        return sb;
    }




}
