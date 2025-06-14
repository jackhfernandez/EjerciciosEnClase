package clases;

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

  public int getCantidad() {
    return contador;
  }

  public Alumno getAlumno(int indice) {
    if (indice >= 0 && indice < this.contador) {
      return this.alumnos[indice];
    } else {
      return null;
    }
  }
 
}
