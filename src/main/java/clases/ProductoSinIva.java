package clases;

public class ProductoSinIva extends Producto {

    public ProductoSinIva(int id, String nombreProducto, double precioUnitario, Proveedor proveedor, CategoriaProducto categoriaProducto, String descripcionProducto) {
        super(id, nombreProducto, precioUnitario, proveedor, categoriaProducto, descripcionProducto);
    }


    @Override
    public double calcularCosto() {
        return getPrecioUnitario();
    }


}
