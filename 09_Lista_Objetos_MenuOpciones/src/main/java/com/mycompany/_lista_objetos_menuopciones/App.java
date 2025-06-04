package com.mycompany._lista_objetos_menuopciones;

import clases.Alumno;
import clases.ListaAlumnos;
import javax.swing.JOptionPane;

public class App {

  public static void main(String[] args) {

    int op;
    ListaAlumnos lista = new ListaAlumnos();
    do {
      op = opciones();
      switch (op) {
        case 1 -> {
          opAgregarAlumnos(lista);
        }
        case 2 -> {
          JOptionPane.showMessageDialog(null, lista.presentar());
        }
        case 3 -> {
          opBuscarAlumnoCodigo(lista);
        }
        case 4 -> {
          presentarAlPorCarrera(lista);
        }
        case 5 -> {
          totalAlumnosPorCarrera(lista);
        }
        case 6 -> {

        }
        default -> {
        }
      }
    } while (op != 7);
  }

  // case 1
  static void opAgregarAlumnos(ListaAlumnos lista) {
    Alumno nuevo = new Alumno();
    // Leer datos del alumno
    String codigo, nombre, carrera;
    int edad;

    // Verificar si la lista tiene espacio disponible
    if (lista.hayEspacio()) {

      codigo = JOptionPane.showInputDialog("Codigo: ");
      nombre = JOptionPane.showInputDialog("Nombre: ");
      carrera = JOptionPane.showInputDialog("Carrera: ");
      edad = Integer.parseInt(JOptionPane.showInputDialog("Edad: "));

      // Instanciar un objeto (new) asignar espacion memoria
      nuevo = new Alumno(codigo, nombre, carrera, edad);

      lista.agregar(nuevo);
      JOptionPane.showMessageDialog(null, "Alumno agregado");
    } else {
      JOptionPane.showMessageDialog(null, "Lista llena");
    }
  }

  // case 3
  static void opBuscarAlumnoCodigo(ListaAlumnos lista) {
    // 1. Ingresar codigo buscar (MAIN)
    // 2. Recorrer la lista de alumnos hasta el contador (LISTA)
    // 2.1 Verificar (comparar) codigo ingresado - c. alumno (LISTA)
    // 2.2 Mostrar datos de alumno encontrado (MAIN)
    // 2.3 Mostrar error de alumno encontrado (MAIN)

    String codigoBuscar = JOptionPane.showInputDialog("Ingrese codigo a buscar: ");

    Alumno alEncontrado = lista.buscarPorCodigo(codigoBuscar);

    if (alEncontrado != null) {
      JOptionPane.showInputDialog(null, "Alumno encontrado\n" + alEncontrado.alumnoEncontrado());
    } else {
      JOptionPane.showInputDialog(null, "Alumno con codigo " + codigoBuscar + " no encontrado");
    }
  }

  static int opciones() {
    String menu = "1. Agregar alumno\n"
        + "2. Presentar alumnos\n"
        + "3. Buscar alumno por codigo\n"
        + "4. Presentar alumnos por carrera\n"
        + "5. Total alumnos por carrera\n"
        + "6. Ordenar alumnos por carrera\n"
        + "7. Salir";
    int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
    return opcion;
  }

  // case 4
  static void presentarAlPorCarrera(ListaAlumnos lista) {
    // que muestre datos de todos los alumnos
    String carreraBuscar = JOptionPane.showInputDialog("Ingrese la carrera a buscar: ");
    // Clase de java para representar datos mutables permite modificar contenido
    StringBuilder resultado = new StringBuilder("Alumnos de la carrera " + carreraBuscar + ":\n\n");
    boolean encontrado = false;

    // Recorrer la lista de alumnos
    for (int i = 0; i < lista.getCantidad(); i++) {
      Alumno alumno = lista.getAlumno(i);
      if (alumno.getCarrera().equalsIgnoreCase(carreraBuscar)) {
        resultado.append(alumno.alumnoEncontrado()).append("\n");
        encontrado = true;
      }
    }

    if (encontrado) {
      JOptionPane.showMessageDialog(null, resultado.toString());
    } else {
      JOptionPane.showMessageDialog(null, "No se encontraron alumnos en la carrera " + carreraBuscar);
    }
  }

  // case 5
  static void totalAlumnosPorCarrera(ListaAlumnos lista) {
    // Muestra la cantidad de alumnos por carrera
    int cantidad = lista.getCantidad();

    if (cantidad == 0) {
      JOptionPane.showInputDialog(null, "No hay alumnos registrados!!!");
    }

    // Identificar carreras unicas y contar
    String carreras[] = new String[cantidad];
    int contador[] = new int[cantidad];
    int totalCarreras = 0;

    for (int i = 0; i < cantidad; i++) {
      Alumno alumno = lista.getAlumno(i);
      String carreraActual = alumno.getCarrera();
      boolean carreraRegistrada = false;

      // Buscar si la carrera ya fue registrada anteriormente
      for (int j = 0; j < totalCarreras; j++) {
        if (carreras[j].equals(carreraActual)) {
          contador[j]++;
          carreraRegistrada = true;
          break;
        }
      }

      // Si la carrera no fue registrada, agregarla al arreglo
      if (!carreraRegistrada) {
        carreras[totalCarreras] = carreraActual;
        contador[totalCarreras] = 1; // Iniciar contador en 1
        totalCarreras++;
      }
    }

    // Mostrar resultados
    StringBuilder resultado = new StringBuilder("Cantidad de alumnos por carrera:\n");
    for (int i = 0; i < totalCarreras; i++) {
      resultado.append(carreras[i]).append(": ").append(contador[i]).append(" alumno(s)\n");
    }
    JOptionPane.showMessageDialog(null, resultado.toString());
  }

  // case 6
  static void ordenarAlPorCarrera() {
    // Mostrar alumnos ordenados de forma alfabetica por carrera

  }
}
