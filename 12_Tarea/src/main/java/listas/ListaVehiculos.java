package listas;

import clases.Vehiculo;

public class ListaVehiculos {

  private final int MAX = 10;
  
  private int contador =0;
  
  private Vehiculo vehiculos[];
  
  public ListaVehiculos(){
    vehiculos = new Vehiculo[MAX];
  }
  
  public void Agregar(Vehiculo obj){
    if (this.contador < MAX ) {
      vehiculos[this.contador] = obj;
      this.contador++;
    }
  }
  
  public String presentar(){
    String datos = "";
    for (int i = 0; i < this.contador; i++) {
      datos += this.vehiculos[i].mostrar() + "\n";
    }
    return datos;
  }
}