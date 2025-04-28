package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejecutable {
    private List<DetalleSolicitud> detallesSolicitud;
    private List<Proveedor> proveedores;
    private int idProveedores = 100;
    private int idSolicitudes = 200;
    private int idproductos = 300;
    private List<Producto> productos;

    Scanner sc = new Scanner(System.in);

    public Ejecutable() {
        this.detallesSolicitud = new ArrayList<DetalleSolicitud>();
        this.productos = new ArrayList<Producto>();
        this.proveedores = new ArrayList<>();
    }

    public void registrarProveedores(Proveedor proveedor) {
        this.proveedores.add(proveedor);
    }
    public void crearProveedor() {
        System.out.println("---Creando proveedor---");
        System.out.println("Ingrese el nombre del proveedor: ");
        String nombre = sc.next();
        System.out.println("Ingrese el nombre del departamento: ");
        String departamento = sc.next();
        System.out.println("Ingrese el telefono del proveedor: ");
        String telefono = sc.next();
        System.out.println("Ingrese el correo del proveedor: ");
        String correo = sc.next();
        System.out.println("Ingresando Direccion del proveedor: ");
        System.out.println("Calle principal: ");
        String principal = sc.next();
        System.out.println("Calle secundaria: ");
        String secundaria = sc.next();
        System.out.println("Numero de propiedad: ");
        String numCalle = sc.next();
        System.out.println("Nombre de pais: ");
        String pais = sc.next();
        System.out.println("Nombre de provincia: ");
        String provincia = sc.next();
        System.out.println("Nombre de ciudad: ");
        String ciudad = sc.next();

        // Crear la dirección
        Direccion direccion = new Direccion(principal, secundaria,numCalle, ciudad, pais, provincia);

        // Crear el proveedor
        Proveedor proveedor = new Proveedor(nombre, departamento, telefono, correo, direccion);
        proveedor.setId(idProveedores++);

        // Agregar el proveedor a la lista general
        proveedores.add(proveedor);

        System.out.println("Proveedor registrado exitosamente.");
    }
    public void listarProveedores() {
        for (Proveedor proveedor : proveedores) {
            System.out.println(proveedor);
        }
    }
    public Proveedor buscarProveedorPorId(int idBuscado) {
        int izquierda = 0;
        int derecha = proveedores.size() - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            Proveedor proveedorMedio = proveedores.get(medio);

            if (proveedorMedio.getId() == idBuscado) {
                return proveedorMedio;
            } else if (proveedorMedio.getId() < idBuscado) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return null;
    }

    //------------------------------PRODUCTO------------------------------

    public void registrarProducto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre del producto:");
        String nombreProducto = scanner.nextLine();

        System.out.println("Ingrese precio unitario:");
        double precioUnitario = scanner.nextDouble();

        System.out.println("Ingrese descripción del producto:");
        String descripcion = scanner.nextLine();

        System.out.println("Seleccione una categoría:");
        CategoriaProducto[] categorias = CategoriaProducto.values();
        for (int i = 0; i < categorias.length; i++) {
            System.out.println((i + 1) + ". " + categorias[i]);
        }

        int opcion = scanner.nextInt();
        scanner.nextLine(); // limpiar salto de línea otra vez

        CategoriaProducto categoriaSeleccionada = null;
        if (opcion >= 1 && opcion <= categorias.length) {
            categoriaSeleccionada = categorias[opcion - 1];
            System.out.println("Categoría seleccionada: " + categoriaSeleccionada);
        } else {
            System.out.println("Opción no válida.");
            // Aquí podrías volver a pedir que ingrese bien, pero sigamos por ahora
        }
        // Mostrar proveedores disponibles
        System.out.println("Proveedores disponibles:");
        for (Proveedor p : proveedores) {
            System.out.println(p.getId() + " - " + p.getNombre());
        }

        System.out.println("Ingrese el ID del proveedor al que pertenece el producto:");
        int idProveedor = scanner.nextInt();
        scanner.nextLine();

        Proveedor proveedorSeleccionado = buscarProveedorPorId(idProveedor);

        if (proveedorSeleccionado == null) {
            System.out.println("Proveedor no encontrado.");
            return;
        }

        System.out.println("¿Su producto tiene iva?(true/false)");
        boolean iva = scanner.nextBoolean();
        if (iva){
            Producto nuevoProducto = new ProductoConIva(idproductos,nombreProducto, precioUnitario,proveedorSeleccionado,categoriaSeleccionada, descripcion);
            System.out.println(nuevoProducto.calcularCosto());
            productos.add(nuevoProducto);
            proveedorSeleccionado.getProductos().add(nuevoProducto);
            System.out.println(" Producto registrado exitosamente.");
        }else {
            Producto nuevoProducto = new ProductoSinIva(idproductos,nombreProducto, precioUnitario,proveedorSeleccionado,categoriaSeleccionada, descripcion);
            System.out.println(nuevoProducto.calcularCosto());
            productos.add(nuevoProducto);
            proveedorSeleccionado.getProductos().add(nuevoProducto);

            System.out.println(" Producto registrado exitosamente.");
        }

    }



    public void registrarDetalles(DetalleSolicitud detallesSolicitud) {
        this.detallesSolicitud.add(detallesSolicitud);
    }
    public void registrarSolicitud(DetalleSolicitud detallesSolicitud) {
        this.detallesSolicitud.add(detallesSolicitud);
    }
}