package listas;

import clases.Compras;

public class ListaCompras {

  private static final int MAX_COMPRAS = 20;
  private Compras[] lista;
  private int contador;
  private int proximoId; // Contador interno para generar IDs únicos

  public ListaCompras() {
    this.lista = new Compras[MAX_COMPRAS];
    this.contador = 0;
    this.proximoId = 1;
  }

  // Método que crea y agrega una compra, encapsulando la lógica del ID
  public boolean agregar(String codigoProd, int cantidad, double monto) {
    if (contador < MAX_COMPRAS) {
      String nuevoId = String.format("COMP%03d", proximoId++);
      Compras nuevaCompra = new Compras(nuevoId, codigoProd, cantidad, monto);
      lista[contador] = nuevaCompra;
      contador++;
      return true;
    }
    return false; // Array lleno
  }

  public String obtenerInfoCompras() {
    if (contador == 0) {
      return "El cliente no tiene compras registradas.";
    }
    String sb = "";
    for (int i = 0; i < contador; i++) {
      sb += (lista[i].mostrar()) + ("\n");
    }
    return sb;
  }
}
