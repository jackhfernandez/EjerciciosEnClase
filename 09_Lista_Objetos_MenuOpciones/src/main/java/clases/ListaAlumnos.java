/**
 * Clase utilizando vectores de tipo Alumno
 */
package clases;

/**
 *
 * @author Jack
 */
// Lista utilizando ARRAY = ARREGLO = VECTOR
public class ListaAlumnos {

  private final int MAX = 2;

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

  /*
  no usar porque rompe el encapsulamiento
  
  public int getMAX() {
    return MAX;
  }

  public int getContador() {
    return contador;
  }
   */
  public String presentar() {
    String datos = "";
    for (int i = 0; i < this.contador; i++) {
      datos = datos + this.alumnos[i].getAlumno() + "\n";
    }
    return datos;
  }

  public boolean hayEspacio() {
    return this.contador < this.MAX;
  }
  
  public Alumno buscarPorCodigo(String codigoBuscar){
    for (int i = 0; i < this.contador; i++) {
      if (alumnos[i].getCodigo().equals(codigoBuscar)){
        return alumnos[i];
      }
    }
    return null;
  }
 
}
