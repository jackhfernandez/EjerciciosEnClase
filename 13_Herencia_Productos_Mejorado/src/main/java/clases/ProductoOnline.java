package clases;

public class ProductoOnline extends Producto {

  private double descuento; // Descuento en formato decimal, ej: 0.10 para 10%

  public ProductoOnline(String codigo, String nombre, double precioBase,
      int cantidadTotal, double descuento) {
    super(codigo, nombre, precioBase, cantidadTotal);
    this.descuento = descuento;
  }

  @Override
  public double calcularPrecioFinal() {
    double dscto = descuento/100;
    return precioBase * (1 - dscto);
  }

  @Override
  public String mostrar() {
    return super.mostrar() + "\nTipo: Online" + "\nDescuento: " + descuento + "%";
  }
}
