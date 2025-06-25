package datos;

public class EmpleadoTemporal extends Empleado{

  private int dia;
  private double salario;

  public EmpleadoTemporal() {
  }

  public EmpleadoTemporal(int dia, double salario, String dni, String nombres, int edad) {
    super(dni, nombres, edad);
    this.dia = dia;
    this.salario = salario;
  }

  public int getDia() {
    return dia;
  }

  public double getSalario() {
    return salario;
  }
  
  public String mostrar(){
    return super.mostrar() + " - " + this.dia + " - " + this.salario;
  }
}
