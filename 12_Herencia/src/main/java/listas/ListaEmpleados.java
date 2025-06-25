package listas;

import datos.Empleado;

public class ListaEmpleados {

  private final int MAX = 10;
  
  private int contador =0;
  
  private Empleado empleados[];
  
  public ListaEmpleados(){
    empleados = new Empleado[MAX];
  }
  
  public void Agregar(Empleado obj){
    if (this.contador < MAX ) {
      empleados[this.contador] = obj;
      this.contador++;
    }
  }
  
  public String presentar(){
    String datos = "";
    for (int i = 0; i < this.contador; i++) {
      datos += this.empleados[i].mostrar() + "\n";
    }
    return datos;
  }
}
