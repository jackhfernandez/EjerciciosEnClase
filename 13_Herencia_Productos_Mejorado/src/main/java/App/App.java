package App;

import javax.swing.JOptionPane;
import clases.*;
import listas.*;

public class App {

  public static void main(String[] args) {

    ListaProductos inventario = new ListaProductos();
    ListaClientes clientes = new ListaClientes();

    cargarDatosIniciales(inventario, clientes);
    mostrarMenuPrincipal(clientes, inventario);
  }

  private static void mostrarMenuPrincipal(ListaClientes clientes, ListaProductos inventario) {
    String opcion;
    do {
      opcion = JOptionPane.showInputDialog("""
                                              ATS TECH SOLUTIONS \n
                                           1. Registrar Producto
                                           2. Registrar Cliente
                                           3. Realizar Compra
                                           4. Mostrar Inventario de Productos
                                           5. Mostrar Reporte de Clientes y Compras
                                           6. Salir
                                           Elija una opcion: """);

      if (opcion == null) { // Maneja el caso de que el usuario cierre la ventana
        opcion = "6";
      }

      switch (opcion) {
        case "1" ->
          registrarProducto(inventario);
        case "2" ->
          registrarCliente(clientes);
        case "3" ->
          realizarCompra(clientes, inventario);
        case "4" ->
          mostrarInventarioProductos(inventario);
        case "5" ->
          mostrarReporteClientes(clientes);
        case "6" ->
          mostrarTexto("Saliendo del sistema...");
        default ->
          mostrarTexto("Opción no válida.");
      }
    } while (!opcion.equals("6"));
  }

  private static void registrarProducto(ListaProductos inventario) {

    String tipo = JOptionPane.showInputDialog("Tipo de producto \n1. Online \n2. Tienda");
    if (tipo == null) {
      return;
    }

    String codigo = JOptionPane.showInputDialog("Código:");
    String nombre = JOptionPane.showInputDialog("Nombre:");
    double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio Base:"));
    int stock = Integer.parseInt(JOptionPane.showInputDialog("Stock Inicial:"));

    Producto nuevoProducto = null;
    if (tipo.equals("1")) {
      double desc = Double.parseDouble(JOptionPane.showInputDialog("Descuento (0-100%):"));
      nuevoProducto = new ProductoOnline(codigo, nombre, precio, stock, desc);
    } else if (tipo.equals("2")) {
      String dir = JOptionPane.showInputDialog("Nombre tienda:");
      nuevoProducto = new ProductoTienda(codigo, nombre, precio, stock, dir);
    }

    if (inventario.agregar(nuevoProducto)) {
      mostrarTexto("Producto registrado con éxito.");
    } else {
      mostrarTexto("Error: No se pudo registrar el producto.");
    }
  }

  private static void registrarCliente(ListaClientes clientes) {
    String dni = JOptionPane.showInputDialog("DNI:");
    if (clientes.buscarPorDni(dni) != null) {
      mostrarTexto("Ya existe un cliente con ese DNI.");
      return;
    }
    String nombre = JOptionPane.showInputDialog("Nombre del cliente:");
    Cliente nuevoCliente = new Cliente(dni, nombre);
    if (clientes.agregar(nuevoCliente)) {
      mostrarTexto("Cliente registrado con éxito.");
    } else {
      mostrarTexto("Error: No se pudo registrar al cliente.");
    }
  }

  private static void realizarCompra(ListaClientes clientes, ListaProductos inventario) {
    String cedula = JOptionPane.showInputDialog("Ingrese DNI:");
    Cliente cliente = clientes.buscarPorDni(cedula);
    if (cliente == null) {
      mostrarTexto("Cliente no encontrado.");
      return;
    }

    String codigoProd = JOptionPane.showInputDialog("Ingrese código del producto:");
    Producto producto = inventario.buscarPorCodigo(codigoProd);
    if (producto == null) {
      mostrarTexto("Producto no encontrado.");
      return;
    }

    int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad a comprar:"));
    if (!producto.hayStockSuficiente(cantidad)) {
      mostrarTexto("Error: Stock insuficiente. Disponible: " + producto.getCantidadTotal());
      return;
    }

    // El producto y el cliente se encargan de la lógica
    double monto = producto.calcularPrecioFinal() * cantidad;
    if (cliente.registrarCompra(codigoProd, cantidad, monto)) {
      producto.reducirStock(cantidad);
      mostrarTexto("Compra realizada con éxito por un total de: S/ " + monto);
    } else {
      mostrarTexto("Error: El cliente ha alcanzado su límite de compras.");
    }
  }

  private static void mostrarInventarioProductos(ListaProductos inventario) {
    String reporte = inventario.obtenerInfoTodos();
    mostrarTexto("Reporte de Inventario\n\n" + reporte);
  }

  private static void mostrarReporteClientes(ListaClientes clientes) {
    String reporte = clientes.obtenerInfoTodosDetallado();
    mostrarTexto("Reporte de Clientes\n\n" + reporte);
  }
  
  private static void mostrarTexto(String message){
    JOptionPane.showMessageDialog(null, message);
  }

  private static void cargarDatosIniciales(ListaProductos inventario, ListaClientes clientes) {
    inventario.agregar(new ProductoOnline("001", "Laptop Gamer", 4500, 10, 15));
    inventario.agregar(new ProductoTienda("002", "Mouse Óptico", 75, 30, "Av. Lambayeque 123"));
    clientes.agregar(new Cliente("111111", "Juan Perez"));
  }
}
