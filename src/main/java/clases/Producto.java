package clases;

public abstract class Producto implements Calculable {
    private int id;
    private String nombreProducto;
    private double precioUnitario;
    private Proveedor proveedor;
    private CategoriaProducto categoriaProducto;
    private String descripcionProducto;

    public Producto(int id, String nombreProducto, double precioUnitario, Proveedor proveedor, CategoriaProducto categoriaProducto, String descripcionProducto) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.precioUnitario = precioUnitario;
        this.proveedor = proveedor;
        this.categoriaProducto = categoriaProducto;
        this.descripcionProducto = descripcionProducto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public CategoriaProducto getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(CategoriaProducto categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    // METODOS DE PRODUCTO
    public abstract double calcularCosto();

    @Override
    public String toString() {
        return "Producto: \n" +
                "  id = " + id + ",\n" +
                "  nombreProducto = '" + nombreProducto + "',\n" +
                "  precioUnitario = " + precioUnitario + ",\n" +
                "  proveedor = " + proveedor.getNombre() + ",\n" +
                "  categoriaProducto = " + categoriaProducto + ",\n" +
                "  descripcionProducto = '" + descripcionProducto + "'\n" ;
    }
}
