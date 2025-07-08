package listas;

import clases.Cliente;

public class ListaClientes {

  private static final int MAX_CLIENTES = 20;
  private Cliente[] lista;
  private int contador;

  public ListaClientes() {
    this.lista = new Cliente[MAX_CLIENTES];
    this.contador = 0;
  }

  public boolean agregar(Cliente cliente) {
    if (contador < MAX_CLIENTES && cliente != null) {
      lista[contador] = cliente;
      contador++;
      return true;
    }
    return false;
  }

  public Cliente buscarPorDni(String cedula) {
    for (int i = 0; i < contador; i++) {
      if (lista[i].getDni().equals(cedula)) {
        return lista[i];
      }
    }
    return null;
  }

  public String obtenerInfoTodosDetallado() {
    if (contador == 0) {
      return "No hay clientes registrados.";
    }
    String sb = "REPORTE DE CLIENTES Y COMPRAS \n";
    for (int i = 0; i < contador; i++) {
      sb += ("================================\n");
      sb += (lista[i].mostrarDetalleCompleto()) + ("\n");
    }
    return sb;
  }
}
