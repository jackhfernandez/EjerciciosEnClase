package datos;

public class EmpleadoPlanilla extends Empleado {

  // Atributos especificos
  private String cargo;
  private int tiempoServicio;

  public EmpleadoPlanilla() {
  }

  @Override
  public void calcularSueldo() {
    if (this.cargo.equals("Gerente")) {
      this.sueldo=5000;
    } else {
      if (this.cargo.equals("Asesor")) {
        this.sueldo=3000;
      } else {
        this.sueldo=1500;
      }
    }
  }

  public EmpleadoPlanilla(String cargo, int tiempoServicio, String dni, String nombres, int edad, int nroHijos) {
    super(dni, nombres, edad, nroHijos);
    this.cargo = cargo;
    this.tiempoServicio = tiempoServicio;
  }
  
  

  public String getCargo() {
    return cargo;
  }

  public int getTiempoServicio() {
    return tiempoServicio;
  }

  @Override
  public String mostrar() {
    return super.mostrar() + " - " + this.cargo + " - " + this.tiempoServicio
    + " - Sueldo: " + this.sueldo;
  }
}
