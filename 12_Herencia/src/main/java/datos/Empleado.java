// superclase clase padre
package datos;

public abstract class Empleado {

  private String dni;
  private String nombres;
  private int edad;
  protected double sueldo;
  protected int nroHijos;
  
  public abstract void calcularSueldo();

//  public void setSueldo(double sueldo) {
//    this.sueldo = sueldo;
//  }
//
//  public double getSueldo() {
//    return sueldo;
//  }
  
  public Empleado() {
  }

  public Empleado(String dni, String nombres, int edad, int nroHijos) {
    this.dni = dni;
    this.nombres = nombres;
    this.edad = edad;
    this.nroHijos = nroHijos;
  }

  public String getDni() {
    return dni;
  }

  public String getNombres() {
    return nombres;
  }

  public int getEdad() {
    return edad;
  }

  public String mostrar() {
    return this.dni + " - " + this.nombres + " - " + this.edad;
  }
}
