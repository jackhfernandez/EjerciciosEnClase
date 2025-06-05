package clases;

// Lista utilizando ARRAY = ARREGLO = VECTOR
public class ListaAlumnos {

  private final int MAX = 2;

  // Vector de Alumnos
  private Alumno alumnos[] = new Alumno[MAX];
  // contador de alumnos ACTUALES
  private int contador;

  // Funcionalidades / operaciones (METODOS)
  public void agregar(Alumno nuevo) {
    if (this.contador < MAX) {
      this.alumnos[this.contador] = nuevo;
      this.contador++;
    }
  }

  public String presentar() {
    if (contador == 0) {
      return "No hay alumnos registrados.";
    }
    
    String datos = "";
    for (int i = 0; i < this.contador; i++) {
      datos = datos + this.alumnos[i].getAlumno() + "\n";
    }
    return datos;
  }

  public boolean hayEspacio() {
    return this.contador < this.MAX;
  }
  
  public Alumno buscarPorCodigo(String codigoBuscar) {
    for (int i = 0; i < this.contador; i++) {
      if (alumnos[i].getCodigo().equals(codigoBuscar)) {
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

  public String presentarAlumnosPorCarrera(String carreraBuscar) {
    if (contador == 0) {
      return "No hay alumnos registrados.";
    }

    String resultado = "Alumnos de la carrera " + carreraBuscar + ":\n\n";
    boolean encontrado = false;

    for (int i = 0; i < this.contador; i++) {
      if (alumnos[i].getCarrera().equalsIgnoreCase(carreraBuscar)) {
        resultado = resultado + alumnos[i].alumnoEncontrado() + "\n";
        encontrado = true;
      }
    }

    if (!encontrado) {
      return "No se encontraron alumnos en la carrera " + carreraBuscar;
    }

    return resultado;
  }

  public String obtenerTotalAlumnosPorCarrera() {
    if (contador == 0) {
      return "No hay alumnos registrados.";
    }

    // Identificar carreras unicas y contar
    String carreras[] = new String[contador];
    int contadores[] = new int[contador];
    int totalCarreras = 0;

    for (int i = 0; i < contador; i++) {
      String carreraActual = alumnos[i].getCarrera();
      boolean carreraRegistrada = false;

      // Buscar si la carrera ya fue registrada anteriormente
      for (int j = 0; j < totalCarreras; j++) {
        if (carreras[j].equals(carreraActual)) {
          contadores[j]++;
          carreraRegistrada = true;
          break;
        }
      }

      // Si la carrera no fue registrada, agregarla al arreglo
      if (!carreraRegistrada) {
        carreras[totalCarreras] = carreraActual;
        contadores[totalCarreras] = 1;
        totalCarreras++;
      }
    }

    // Construir resultado
    String resultado = "Cantidad de alumnos por carrera:\n";
    for (int i = 0; i < totalCarreras; i++) {
      resultado = resultado + carreras[i] + ": " + contadores[i] + " alumno(s)\n";
    }

    return resultado;
  }

  public String obtenerAlumnosOrdenadosPorCarrera() {
    if (contador == 0) {
      return "No hay alumnos registrados.";
    }

    // Crear una copia de los alumnos para no alterar el orden original
    Alumno alumnosTemp[] = new Alumno[contador];
    for (int i = 0; i < contador; i++) {
      alumnosTemp[i] = alumnos[i];
    }

    // Ordenamiento usando bubble sort por carrera
    for (int i = 0; i < contador - 1; i++) {
      for (int j = 0; j < contador - i - 1; j++) {
        if (alumnosTemp[j].getCarrera().compareToIgnoreCase(alumnosTemp[j + 1].getCarrera()) > 0) {
          Alumno temp = alumnosTemp[j];
          alumnosTemp[j] = alumnosTemp[j + 1];
          alumnosTemp[j + 1] = temp;
        }
      }
    }

    // Construir resultado agrupado por carrera
    String resultado = "Alumnos ordenados por carrera:\n\n";
    String carreraActual = "";

    for (int i = 0; i < contador; i++) {
      // Si cambia la carrera, mostrar el nombre de la nueva carrera
      if (!alumnosTemp[i].getCarrera().equals(carreraActual)) {
        carreraActual = alumnosTemp[i].getCarrera();
        resultado = resultado + "\n\t" + carreraActual + "\n";
      }
      resultado = resultado + alumnosTemp[i].alumnoEncontrado() + "\n";
    }

    return resultado;
  }

  public boolean validarCodigoUnico(String codigo) {
    return buscarPorCodigo(codigo) == null;
  }

  public boolean estaVacia() {
    return contador == 0;
  }

  public boolean estaLlena() {
    return contador >= MAX;
  }
}
