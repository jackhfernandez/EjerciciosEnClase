// superclase clase padre
package clases;

public class Vehiculo {

  private String marca;
  private String modelo;
  private int fabricacion;

  public Vehiculo() {
  }

  public Vehiculo(String marca, String modelo, int fabricacion) {
    this.marca = marca;
    this.modelo = modelo;
    this.fabricacion = fabricacion;
  }

  public String getMarca() {
    return marca;
  }

  public String getModelo() {
    return modelo;
  }

  public int getFabricacion() {
    return fabricacion;
  }

  public String mostrar() {
    return this.marca + " - " + this.modelo + " - " + this.fabricacion;
  }
}