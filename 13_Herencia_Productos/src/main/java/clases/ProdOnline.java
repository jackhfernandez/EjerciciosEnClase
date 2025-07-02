package clases;

public class ProdOnline extends Producto {

  private int contador=0;
  private String nombreTienda;
  private int nroEstante;

  public ProdOnline() {
  }

  public ProdOnline(String nombreTienda, int nroEstante, String codigo, String descripcion, double precio, String categoria) {
    super(codigo, descripcion, precio, categoria);
    this.nombreTienda = nombreTienda;
    this.nroEstante = nroEstante;
  }

  @Override
  public String mostrar(){
    return super.mostrar() + " - Tienda: " + this.nombreTienda + " - Nro estante: " + this.nroEstante;
  }
}
