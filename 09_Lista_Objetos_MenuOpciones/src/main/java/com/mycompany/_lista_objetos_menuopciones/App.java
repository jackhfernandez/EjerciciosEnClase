/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany._lista_objetos_menuopciones;

import clases.Alumno;
import clases.ListaAlumnos;
import javax.swing.JOptionPane;

/**
 *
 * @author Jack
 */
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
        }
        default -> {
        }
      }
    } while (op != 6);
  }

  // case 1
  static void opAgregarAlumnos(ListaAlumnos lista) {
    Alumno nuevo = new Alumno();
    // Leer datos del alumno
    String codigo, nombre, carrera;
    int edad;
    codigo = JOptionPane.showInputDialog("Ingrese codigo: ");
    nombre = JOptionPane.showInputDialog("Ingrese nombre: ");
    carrera = JOptionPane.showInputDialog("Ingrese carrera: ");
    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad: "));

    // Instanciar un objeto (new) asignar espacion memoria
    nuevo = new Alumno(codigo, nombre, carrera, edad);

    lista.agregar(nuevo);
    JOptionPane.showMessageDialog(null, "Alumno agregado");
  }

  static int opciones() {
    String menu = "1. Agregar alumno\n"
        + "2. Presentar alumnos\n"
        + "3. Buscar alumno\n"
        + "6. Salir";
    int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
    return opcion;
  }
}
