package clases;

public class ProductoSinIva extends Producto {
    private double porcentajeIva;
    public ProductoSinIva(double porcentajeIva,int id, String nombreProducto, double precioUnitario, Proveedor proveedor, CategoriaProducto categoriaProducto, String descripcionProducto) {
        super(id, nombreProducto, precioUnitario, proveedor, categoriaProducto, descripcionProducto);
        this.porcentajeIva = porcentajeIva;
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
