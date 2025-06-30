package datos;

public class EmpleadoTemporal extends Empleado{

  private int dia;
  private double salario;

  public EmpleadoTemporal (){
  }
  
  
  @Override
  public void calcularSueldo(){
    this.sueldo = salario;
    if (this.dia > 5){
      this.sueldo += 20;
    }
  }

  public EmpleadoTemporal(int dia, double salario, String dni, String nombres, int edad, int nroHijos) {
    super(dni, nombres, edad, nroHijos);
    this.dia = dia;
    this.salario = salario;
  }

  public int getDia() {
    return dia;
  }

  public double getSalario() {
    return salario;
  }
  
  @Override
  public String mostrar(){
    return super.mostrar() + " - " + this.dia + " - " + this.salario + " - Sueldo: " + this.sueldo;
  }
}
