/**
 * Clase utilizando vectores de tipo Alumno
 */
package clases;

/**
 *
 * @author admin
 */
// Lista utilizando ARRAY = ARREGLO = VECTOR
public class ListaAlumnos {

  private final int MAX = 10;

  // Vector de Alumnos
  Alumno alumnos[] = new Alumno[MAX];
  // contador de alumnos ACTUALES
  int contador;

  // Funcionalidades / operaciones (METODOS)
  public void agregar(Alumno nuevo) {
    if (this.contador < MAX) {
      this.alumnos[this.contador] = nuevo;
      this.contador++;
    }
  }

  public void presentar() {
    for (int i = 0; i < this.contador; i++) {
      System.out.println(this.alumnos[i].getAlumno());
    }
  }
}
