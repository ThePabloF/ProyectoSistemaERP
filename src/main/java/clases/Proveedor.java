package clases;

import java.util.ArrayList;
import java.util.List;

public class Proveedor {
    private int id;
    private String nombre;
    private String nombreDepartamento;
    private List<Producto> productos;
    private String telefono;
    private String correo;
    private Direccion direccion;

    public Proveedor(int id, String nombre, String nombreDepartamento, String telefono, String correo, Direccion direccion) {
        this.id = id;
        this.nombre = nombre;
        this.nombreDepartamento = nombreDepartamento;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        productos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    //METODOS
    public List<Producto> getProductos() {
        return productos;
    }
    public void addProductos(Producto producto) {
        this.productos.add(producto);
    }

}
