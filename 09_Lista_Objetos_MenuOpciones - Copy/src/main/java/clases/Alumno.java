package clases;

public class Alumno {

  private String codigo;
  private String nombre;
  private String carrera;
  private int edad;

  public Alumno() {
  }

  public Alumno(String codigo, String nombre, String carrera, int edad) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.carrera = carrera;
    this.edad = edad;
  }

  public String getCodigo() {
    return codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public String getCarrera() {
    return carrera;
  }

  public int getEdad() {
    return edad;
  }

  public String getAlumno() {
    return this.codigo + " - " + this.nombre + " - " + this.carrera + " - " + this.edad;
  }
  
  public String alumnoEncontrado() {
    return this.codigo + " - " + this.nombre + " - " + this.carrera + " - " + this.edad;
  }
}
