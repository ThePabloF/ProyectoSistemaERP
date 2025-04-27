package clases;

public class ProductoConIva extends Producto{

    public ProductoConIva(int id, String nombreProducto, double precioUnitario, Proveedor proveedor, CategoriaProducto categoriaProducto, String descripcionProducto) {
        super(id, nombreProducto, precioUnitario, proveedor, categoriaProducto, descripcionProducto);
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
