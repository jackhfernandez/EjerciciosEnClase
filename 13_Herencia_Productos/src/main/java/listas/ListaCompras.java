package listas;

import clases.*;

public class ListaCompras {

  private final int MAX_COMPRAS = 10;
  private int contador;
  private Compras listaCompras[];
  
  public ListaCompras(){
    listaCompras = new Compras[MAX_COMPRAS];
  }
  
  public int getMax(){
    return MAX_COMPRAS;
  }
  
  public int getContador(){
    return contador;
  }
}
