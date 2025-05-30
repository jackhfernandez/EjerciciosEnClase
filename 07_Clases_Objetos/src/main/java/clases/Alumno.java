/**
 * Clase alumno
 */
package clases;

/**
 *
 * @author Jack
 */
public class Alumno {

  // 1. Atributos privados
  public String codigo;
  public String nombre;
  private int edad;
  private String carrera;

  // 2. OPERACIONES. (Metodos)
  // A. Metodos de acceso (Get: obtener valor privado)
  // set: modificar el valor privado)
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String nuevoCodigo) {
    codigo = nuevoCodigo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public String getCarrera(){
    return carrera;
  }
  
  public void setCarrera(String carrera){
    this.carrera = carrera;
  }
  
  public int getEdad(){
    return edad;
  }
  
  // B. constructor
  // Metodo que se ejecuta cuando se utiliza NEW

  // Nombre del metodo lleva el mismo nombre de la clase
  public Alumno(String codigo, String nombre, int edad, String carrera) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.edad = edad;
    this.carrera = carrera;
  }
  
  public Alumno(){

    // Inicializar valores
    this.carrera = "EPIC";
    this.edad = 16;
  }

  public Alumno(String codigo, String nombre) {
    this.codigo = codigo;
    this.nombre = nombre;
  }

  public Alumno(String codigo, String nombre, String carrera) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.carrera = carrera;
  }
 
  // C: Metodos de accion (propios)
  public String getAlumno(){
    return this.codigo + " - " + this.nombre + " - " +
        this.edad + " - " + this.carrera;
  }
}
