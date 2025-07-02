package App;

// ** Jackh ** //
import clases.*;
import javax.swing.JOptionPane;
import listas.*;

public class App {

  public static void main(String[] args) {

    ListaProductos lp = new ListaProductos();

    int opcion;

    do {
      opcion = mostrarMenuPrincipal();

      switch (opcion) {
        //Registar pedido
        case 1 ->
          agregarProductosOnline(lp);
        //Registar pedido
        case 2 ->
          agregarProductosTienda(lp);
        // Mostrar pedidos por cliente
        case 3 ->
          mostrarProductos(lp);
        // Mostrar clientes por plato

        // Salir
        case 7 ->
          JOptionPane.showMessageDialog(null, "Gracias por usar el sistema ATS!",
              "Sistema", JOptionPane.INFORMATION_MESSAGE);

        default ->
          JOptionPane.showMessageDialog(null, "Opcion invalida!", "Error", JOptionPane.ERROR_MESSAGE);
      }
    } while (opcion != 7);
  }

  static void agregarProductosOnline(ListaProductos lp) {
    if (lp.getContador() < lp.getMax()) {
      // Pedir datos del producto online
      String codigo = JOptionPane.showInputDialog("Codigo:");
      if (codigo == null || codigo.trim().isEmpty()) {
        return;
      }

      String descripcion = JOptionPane.showInputDialog("Descripcion:");
      if (descripcion == null || descripcion.trim().isEmpty()) {
        return;
      }

      String precioStr = JOptionPane.showInputDialog("Precio:");
      if (precioStr == null || precioStr.trim().isEmpty()) {
        return;
      }

      String categoria = JOptionPane.showInputDialog("Categoria:");
      if (categoria == null || categoria.trim().isEmpty()) {
        return;
      }

      String nombreTienda = JOptionPane.showInputDialog("Nombre de la tienda:");
      if (nombreTienda == null || nombreTienda.trim().isEmpty()) {
        return;
      }

      String nroEstanteStr = JOptionPane.showInputDialog("Nro de estante:");
      if (nroEstanteStr == null || nroEstanteStr.trim().isEmpty()) {
        return;
      }

      try {
        double precio = Double.parseDouble(precioStr.trim());
        int nroEstante = Integer.parseInt(nroEstanteStr.trim());

        ProdOnline producto = new ProdOnline(nombreTienda, nroEstante, codigo, descripcion, precio, categoria);
        lp.agregar(producto);

        JOptionPane.showMessageDialog(null, "Producto online agregado exitosamente!",
            "Éxito", JOptionPane.INFORMATION_MESSAGE);

      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error, datos no validos!",
            "Error", JOptionPane.ERROR_MESSAGE);
      }
    }
  }

  static void agregarProductosTienda(ListaProductos lp) {
    if (lp.getContador() < lp.getMax()) {

      String codigo = JOptionPane.showInputDialog("Codigo:");
      if (codigo == null || codigo.trim().isEmpty()) {
        return;
      }

      String descripcion = JOptionPane.showInputDialog("Descripcion:");
      if (descripcion == null || descripcion.trim().isEmpty()) {
        return;
      }

      String precioStr = JOptionPane.showInputDialog("Precio:");
      if (precioStr == null || precioStr.trim().isEmpty()) {
        return;
      }

      String categoria = JOptionPane.showInputDialog("Categoria:");
      if (categoria == null || categoria.trim().isEmpty()) {
        return;
      }

      String stockStr = JOptionPane.showInputDialog("Stock:");
      if (stockStr == null || stockStr.trim().isEmpty()) {
        return;
      }

      try {
        double precio = Double.parseDouble(precioStr.trim());
        int stock = Integer.parseInt(stockStr.trim());

        ProdTienda producto = new ProdTienda(stock, codigo, descripcion, precio, categoria);
        lp.agregar(producto);

        JOptionPane.showMessageDialog(null, "Producto de tienda agregado exitosamente!",
            "Éxito", JOptionPane.INFORMATION_MESSAGE);

      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error, datos ingresados no validos!",
            "Error", JOptionPane.ERROR_MESSAGE);
      }
    }
  }

  static void mostrarProductos(ListaProductos lp) {
    if (lp.getContador() == 0) {
      JOptionPane.showMessageDialog(null, "No hay productos registrados");
    } else {
      JOptionPane.showMessageDialog(null, lp.presentar());

    }
  }

  // 2. Menu
  public static int mostrarMenuPrincipal() {
    String menu = "========   PRODUCTOS ATS ============\n\n"
        + "1. Agregar productos Online\n"
        + "2. Agregar productos Tienda\n"
        + "3. Mostrar productos\n"
        + "7. Salir";

    String input = JOptionPane.showInputDialog(null, menu, "Menu Principal",
        JOptionPane.QUESTION_MESSAGE);

    if (input == null) {
      return 7;
    }

    try {
      return Integer.parseInt(input.trim());
    } catch (NumberFormatException e) {
      return -1;
    }
  }
}
