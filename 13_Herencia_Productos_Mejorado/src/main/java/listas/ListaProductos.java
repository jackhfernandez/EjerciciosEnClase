package listas;

import clases.Producto;

public class ListaProductos {

  private static final int MAX_PRODUCTOS = 50;
  private Producto[] lista;
  private int contador;

  public ListaProductos() {
    this.lista = new Producto[MAX_PRODUCTOS];
    this.contador = 0;
  }

  public boolean agregar(Producto producto) {
    if (contador < MAX_PRODUCTOS && producto != null) {
      lista[contador] = producto;
      contador++;
      return true;
    }
    return false;
  }

  public Producto buscarPorCodigo(String codigo) {
    for (int i = 0; i < contador; i++) {
      if (lista[i].getCodigo().equalsIgnoreCase(codigo)) {
        return lista[i];
      }
    }
    return null; // No encontrado
  }

  public String obtenerInfoTodos() {
    if (contador == 0) {
      return "No hay productos registrados.";
    }
    String sb = "   LISTA DE PRODUCTOS \n";
    for (int i = 0; i < contador; i++) {
      sb += ("----------------------------\n");
      sb += (lista[i].mostrar()) + ("\n");
    }
    return sb;
  }
}
