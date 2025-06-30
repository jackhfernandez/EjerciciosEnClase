package clases;

public class Auto extends Vehiculo {

  // Atributos especificos
  private String paisFabricacion;
  private int nroPuertas;

  public Auto() {
  }

  public Auto(String paisFabricacion, int nroPuertas, String marca, String modelo, int fabricacion) {
    super(marca, modelo, fabricacion);
    this.paisFabricacion = paisFabricacion;
    this.nroPuertas = nroPuertas;
  }

  public String getPaisFabricacion() {
    return paisFabricacion;
  }

  public int getNroPuertas() {
    return nroPuertas;
  }

  public String mostrar() {
    return super.mostrar() + " - " + this.paisFabricacion + " - " + this.nroPuertas;
  }
}