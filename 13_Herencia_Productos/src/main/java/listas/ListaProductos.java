package listas;

import clases.*;

public class ListaProductos {

  private final int MAX_CANTIDAD = 10;
  private int contador = 0;

  private Producto productos[];

  public ListaProductos() {
    productos = new Producto[MAX_CANTIDAD];
  }

  public void agregar(Producto p) {
    if (this.contador < MAX_CANTIDAD) {
      productos[this.contador] = p;
      contador++;
    }
  }

  public String presentar() {
    String datos = "Mostrando productos\n";
    for (int i = 0; i < this.contador; i++) {
      datos += "Producto " + (i+1) + "\n";
      datos += this.productos[i].mostrar() + "\n";
    }
    return datos;
  }

  public int getContador() {
    return contador;
  }
  
  public int getMax(){
    return MAX_CANTIDAD;
  }
}
