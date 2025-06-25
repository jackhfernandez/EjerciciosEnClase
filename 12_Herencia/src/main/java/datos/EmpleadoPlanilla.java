package datos;

public class EmpleadoPlanilla extends Empleado {

  // Atributos especificos
  private String cargo;
  private int tiempoServicio;

  public EmpleadoPlanilla() {
  }

  public EmpleadoPlanilla(String cargo, int tiempoServicio,
      String dni, String nombres, int edad) {
    super(dni, nombres, edad);

    this.cargo = cargo;
    this.tiempoServicio = tiempoServicio;
  }

  public String getCargo() {
    return cargo;
  }

  public int getTiempoServicio() {
    return tiempoServicio;
  }

  public String mostrar() {
    return super.mostrar() + " - " + this.cargo + " - " + this.tiempoServicio;
  }
}
