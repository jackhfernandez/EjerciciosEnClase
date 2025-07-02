package clases;

public class Compras {

  private String idCompra;
  private String codigoProducto;
  private int cantidad;
  private double monto;

  public Compras() {
  }

  public Compras(String idCompra, String codigoProducto, int cantidad, double monto) {
    this.idCompra = idCompra;
    this.codigoProducto = codigoProducto;
    this.cantidad = cantidad;
    this.monto = monto;
  }

  
  public String getIdCompra() {
    return idCompra;
  }

  public void setIdCompra(String idCompra) {
    this.idCompra = idCompra;
  }

  public String getCodigoProducto() {
    return codigoProducto;
  }

  public void setCodigoProducto(String codigoProducto) {
    this.codigoProducto = codigoProducto;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public double getMonto() {
    return monto;
  }

  public void setMonto(double monto) {
    this.monto = monto;
  }

  
}
