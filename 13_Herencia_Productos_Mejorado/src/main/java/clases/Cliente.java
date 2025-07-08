package clases;

import listas.ListaCompras;

public class Cliente {

  private String dni;
  private String nombre;
  private ListaCompras comprasRealizadas; // Cada cliente tiene su propia lista de compras

  public Cliente(String cedula, String nombre) {
    this.dni = cedula;
    this.nombre = nombre;
    this.comprasRealizadas = new ListaCompras(); // Se inicializa la lista vacía
  }

  // Getters
  public String getDni() {
    return dni;
  }

  public String getNombre() {
    return nombre;
  }

  // Lógica de Negocio
  public boolean registrarCompra(String codigoProd, int cantidad, double montoTotal) {
    // Delega la creación de la compra a su propia lista
    return this.comprasRealizadas.agregar(codigoProd, cantidad, montoTotal);
  }

  public String mostrar() {
    return "DNI: " + dni + "\nNombre: " + nombre;
  }

  public String mostrarDetalleCompleto() {
    String sb = "";
    sb += (mostrar());
    sb += ("\nCompras Realizadas:\n");
    sb += (comprasRealizadas.obtenerInfoCompras());
    return sb;
  }
}
