package clases;

public class ProductoTienda extends Producto {

  private String nombreTienda;

  public ProductoTienda(String codigo, String nombre, double precioBase,
      int cantidadTotal, String direccionTienda) {
    super(codigo, nombre, precioBase, cantidadTotal);
    this.nombreTienda = direccionTienda;
  }

  @Override
  public double calcularPrecioFinal() {
    return precioBase; // Sin descuento
  }

  @Override
  public String mostrar() {
    return super.mostrar() + "\nTipo: Tienda Física" + "\nDirección: " + nombreTienda;
  }
}
