/**
 * Clase curso
 */
package clases;

/**
 *
 * @author admin
 */
public class Curso {
  
  // Atributos
  private String codigo;
  private String nombre;
  private int creditos;
  private String horario;
  private String carrera;

  // Constructor. ctrl + barra
  public Curso() {
  }

  public Curso(String codigo, String nombre, int creditos, String horario, String carrera) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.creditos = creditos;
    this.horario = horario;
    this.carrera = carrera;
  }

  // Constructor. ctrl + barra
  public Curso(String codigo, String nombre, String carrera) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.carrera = carrera;
  }

  public String getCarrera() {
    return carrera;
  }

  public void setCarrera(String carrera) {
    this.carrera = carrera;
  }
  
  public String getCurso(){
    return this.codigo + " - " + this.nombre + " - " + this.creditos;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getCreditos() {
    return creditos;
  }

  public void setCreditos(int creditos) {
    this.creditos = creditos;
  }

  public String getHorario() {
    return horario;
  }

  public void setHorario(String horario) {
    this.horario = horario;
  }
  
}
