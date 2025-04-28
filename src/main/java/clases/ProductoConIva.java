package clases;

public class ProductoConIva extends Producto{

    public ProductoConIva(int id, String nombreProducto, double precioUnitario, Proveedor proveedor, CategoriaProducto categoriaProducto, String descripcionProducto) {
        super(id, nombreProducto, precioUnitario, proveedor, categoriaProducto, descripcionProducto);
    }

    @Override
    public double calcularCosto() {
        return  (getPrecioUnitario()*0.15)+getPrecioUnitario();
    }

    @Override
    public String mostrarDetalle() {
        return "";
    }
}
