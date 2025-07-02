package clases;

public abstract class Producto {

  private final int MAX_PRO = 10;
  private String codigo;
  private String descripcion;
  private double precio;
  private String categoria;

  public Producto() {
  }

  public Producto(String codigo, String descripcion, double precio, String categoria) {
    this.codigo = codigo;
    this.descripcion = descripcion;
    this.precio = precio;
    this.categoria = categoria;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public String mostrar(){
    return " - Codigo: " + this.codigo + " - Descripcion: "+ this.descripcion
        + " - Precio: " + this.precio + " - Categoria: "+ " - "+ this.categoria;
  }
}
