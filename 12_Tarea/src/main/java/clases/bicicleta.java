package clases;

public class bicicleta extends Vehiculo {

  private int nroLlantas;
  private double nroPasajeros;

  public bicicleta() {
  }

  public bicicleta(int nroLlantas, double nroPasajeros, String marca, String modelo, int fabricacion) {
    super(marca, modelo, fabricacion);
    this.nroLlantas = nroLlantas;
    this.nroPasajeros = nroPasajeros;
  }

  public int getNroLlantas() {
    return nroLlantas;
  }

  public double getNroPasajeros() {
    return nroPasajeros;
  }

  public String mostrar() {
    return super.mostrar() + " - " + this.nroLlantas + " - " + this.nroPasajeros;
  }
}