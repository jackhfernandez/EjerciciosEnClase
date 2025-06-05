package com.mycompany._lista_objetos_menuopciones;

import clases.Alumno;
import clases.ListaAlumnos;
import javax.swing.JOptionPane;

public class App {

  public static void main(String[] args) {
    int op;
    ListaAlumnos lista = new ListaAlumnos();
    
    do {
      op = mostrarMenu();
      procesarOpcion(op, lista);
    } while (op != 7);
  }

  static int mostrarMenu() {
    String menu = ":::: Soluciones ATS ::::\n"
        + "1. Agregar alumno\n"
        + "2. Presentar alumnos\n"
        + "3. Buscar alumno por codigo\n"
        + "4. Presentar alumnos por carrera\n"
        + "5. Total alumnos por carrera\n"
        + "6. Ordenar alumnos por carrera\n"
        + "7. Salir";
    
    try {
      return Integer.parseInt(JOptionPane.showInputDialog(menu));
    } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(null, "Por favor ingrese un numero valido");
      return mostrarMenu();
    }
  }

  static void procesarOpcion(int opcion, ListaAlumnos lista) {
    switch (opcion) {
      case 1 -> agregarAlumno(lista);
      case 2 -> mostrarTodosLosAlumnos(lista);
      case 3 -> buscarAlumnoPorCodigo(lista);
      case 4 -> presentarAlumnosPorCarrera(lista);
      case 5 -> mostrarTotalAlumnosPorCarrera(lista);
      case 6 -> mostrarAlumnosOrdenados(lista);
      case 7 -> JOptionPane.showMessageDialog(null, "¡Gracias por usar soluciones ATS!");
      default -> JOptionPane.showMessageDialog(null, "Opcion no valida");
    }
  }

  static void agregarAlumno(ListaAlumnos lista) {
    if (lista.estaLlena()) {
      JOptionPane.showMessageDialog(null, "Lista llena. No se pueden agregar mas alumnos.");
      return;
    }

    try {
      String codigo = solicitarDato("Codigo:");
      if (!Alumno.validarCodigo(codigo)) {
        JOptionPane.showMessageDialog(null, "El codigo no puede estar vacio");
        return;
      }

      if (!lista.validarCodigoUnico(codigo.trim())) {
        JOptionPane.showMessageDialog(null, "Ya existe un alumno con ese codigo");
        return;
      }

      String nombre = solicitarDato("Nombre:");
      if (!Alumno.validarNombre(nombre)) {
        JOptionPane.showMessageDialog(null, "El nombre no puede estar vacio");
        return;
      }

      String carrera = solicitarDato("Carrera:");
      if (!Alumno.validarCarrera(carrera)) {
        JOptionPane.showMessageDialog(null, "La carrera no puede estar vacia");
        return;
      }

      String edadStr = solicitarDato("Edad:");
      if (edadStr == null || edadStr.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "La edad no puede estar vacia");
        return;
      }

      int edad = Integer.parseInt(edadStr);
      if (!Alumno.validarEdad(edad)) {
        JOptionPane.showMessageDialog(null, "La edad debe ser un numero entre 1 y 119");
        return;
      }

      Alumno nuevo = new Alumno(codigo.trim(), nombre.trim(), carrera.trim(), edad);
      lista.agregar(nuevo);
      JOptionPane.showMessageDialog(null, "Alumno agregado exitosamente");

    } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(null, "La edad debe ser un numero valido");
    }
  }

  static String solicitarDato(String mensaje) {
    String dato = JOptionPane.showInputDialog(mensaje);
    return dato;
  }

  static void mostrarTodosLosAlumnos(ListaAlumnos lista) {
    JOptionPane.showMessageDialog(null, lista.presentar());
  }

  static void buscarAlumnoPorCodigo(ListaAlumnos lista) {
    if (lista.estaVacia()) {
      JOptionPane.showMessageDialog(null, "No hay alumnos registrados.");
      return;
    }

    String codigo = solicitarDato("Ingrese el codigo a buscar:");
    if (!Alumno.validarCodigo(codigo)) {
      JOptionPane.showMessageDialog(null, "Debe ingresar un codigo valido");
      return;
    }

    Alumno alumnoEncontrado = lista.buscarPorCodigo(codigo.trim());
    
    if (alumnoEncontrado != null) {
      JOptionPane.showMessageDialog(null, "Alumno encontrado:\n" + alumnoEncontrado.alumnoEncontrado());
    } else {
      JOptionPane.showMessageDialog(null, "Alumno con codigo " + codigo + " no encontrado");
    }
  }

  static void presentarAlumnosPorCarrera(ListaAlumnos lista) {
    if (lista.estaVacia()) {
      JOptionPane.showMessageDialog(null, "No hay alumnos registrados.");
      return;
    }

    String carrera = solicitarDato("Ingrese la carrera a buscar:");
    if (!Alumno.validarCarrera(carrera)) {
      JOptionPane.showMessageDialog(null, "Debe ingresar una carrera valida");
      return;
    }

    String resultado = lista.presentarAlumnosPorCarrera(carrera.trim());
    JOptionPane.showMessageDialog(null, resultado);
  }

  static void mostrarTotalAlumnosPorCarrera(ListaAlumnos lista) {
    String resultado = lista.obtenerTotalAlumnosPorCarrera();
    JOptionPane.showMessageDialog(null, resultado);
  }

  static void mostrarAlumnosOrdenados(ListaAlumnos lista) {
    String resultado = lista.obtenerAlumnosOrdenadosPorCarrera();
    JOptionPane.showMessageDialog(null, resultado);
  }
}
