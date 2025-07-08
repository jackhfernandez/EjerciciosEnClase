package clases;

public abstract class Producto {

  protected String codigo;
  protected String nombre;
  protected double precioBase;
  protected int cantidadTotal;

  public Producto(String codigo, String nombre, double precioBase, int cantidadTotal) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.precioBase = precioBase;
    this.cantidadTotal = cantidadTotal;
  }

  // Getters
  public String getCodigo() {
    return codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public double getPrecioBase() {
    return precioBase;
  }

  public int getCantidadTotal() {
    return cantidadTotal;
  }

  public boolean hayStockSuficiente(int cantidad) {
    return this.cantidadTotal >= cantidad;
  }

  public void reducirStock(int cantidad) {
    if (hayStockSuficiente(cantidad)) {
      this.cantidadTotal -= cantidad;
    }
  }

  public void aumentarStock(int cantidad) {
    this.cantidadTotal += cantidad;
  }

  // Métodos Polimórficos
  public abstract double calcularPrecioFinal();

  public String mostrar() {
    return "Código: " + codigo + "\nNombre: " + nombre + "\nPrecio Base: S/ "
        + precioBase + "\nStock: " + cantidadTotal;
  }
}
