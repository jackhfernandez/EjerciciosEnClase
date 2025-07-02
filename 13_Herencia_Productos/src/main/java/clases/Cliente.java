package clases;

public class Cliente {

  private String dni;
  private String nombres;
  private String genero;

  public Cliente() {
  }

  public Cliente(String dni, String nombres, String genero) {
    this.dni = dni;
    this.nombres = nombres;
    this.genero = genero;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }
  
  
}
