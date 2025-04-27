package clases;

import java.util.ArrayList;
import java.util.List;

public class DetalleSolicitud implements Metodos {
    private List<Producto> productos;
    private int cantidad;
    private String descripcion;

    public DetalleSolicitud(int cantidad, String descripcion) {
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.productos = new ArrayList<Producto>();
    }


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public List<Producto> getProductos() {
        return productos;
    }
    public  void  agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public double calcularCosto() {
        return 0;
    }

    @Override
    public String mostrarDetalle() {
        return "";
    }
}
