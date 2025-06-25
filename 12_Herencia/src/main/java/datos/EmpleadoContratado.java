package datos;

public class EmpleadoContratado extends Empleado {

  private int horasTrabajadas;
  private double precioHora;

  public EmpleadoContratado() {
  }

  public EmpleadoContratado(int horasTrabajadas, double precioHora, String dni, String nombres, int edad) {
    super(dni, nombres, edad);
    this.horasTrabajadas = horasTrabajadas;
    this.precioHora = precioHora;
  }

  public int getHorasTrabajadas() {
    return horasTrabajadas;
  }

  public double getPrecioHora() {
    return precioHora;
  }

  public String mostrar() {
    return super.mostrar() + " - " + this.horasTrabajadas + " - " + this.precioHora;
  }
}
