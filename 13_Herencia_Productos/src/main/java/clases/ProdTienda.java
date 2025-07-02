package clases;

public class ProdTienda extends Producto {

  private int contador = 0;
  private final double DSCTO = 0.30;
  private int stock;

  public ProdTienda() {
  }

  public ProdTienda(int stock, String codigo, String descripcion, double precio, String categoria) {
    super(codigo, descripcion, precio, categoria);
    this.stock = stock;
  }

  @Override
  public String mostrar() {
    return super.mostrar() + " - Descuento: " + this.DSCTO + " - Stock: " + this.stock;
  }
}
