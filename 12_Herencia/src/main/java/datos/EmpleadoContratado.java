package datos;

public class EmpleadoContratado extends Empleado {

  private int horasTrabajadas;
  private double precioHora;

  public EmpleadoContratado() {
  }
  
  @Override
  public void calcularSueldo(){
    this.sueldo = this.horasTrabajadas* this.precioHora;
  }

  public EmpleadoContratado(int horasTrabajadas, double precioHora, String dni, String nombres, int edad, int nroHijos) {
    super(dni, nombres, edad, nroHijos);
    this.horasTrabajadas = horasTrabajadas;
    this.precioHora = precioHora;
  }
  
  public int getHorasTrabajadas() {
    return horasTrabajadas;
  }

  public double getPrecioHora() {
    return precioHora;
  }

  @Override
  public String mostrar() {
    return super.mostrar() + " - " + this.horasTrabajadas + " - " + this.precioHora +
        " - Suelgo: " + this.sueldo;
  }
}
