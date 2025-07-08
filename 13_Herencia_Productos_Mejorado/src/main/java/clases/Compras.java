package clases;

public class Compras {

  private String idCompra;
  private String codigoProducto;
  private int cantidad;
  private double montoTotal;

  public Compras(String idCompra, String codigoProducto, int cantidad, double montoTotal) {
    this.idCompra = idCompra;
    this.codigoProducto = codigoProducto;
    this.cantidad = cantidad;
    this.montoTotal = montoTotal;
  }

  public String mostrar() {
    return "\nID Compra: " + idCompra + "\nProducto: " + codigoProducto
        + "\nCantidad: " + cantidad + "\nTotal: S/ " + montoTotal;
  }
}
