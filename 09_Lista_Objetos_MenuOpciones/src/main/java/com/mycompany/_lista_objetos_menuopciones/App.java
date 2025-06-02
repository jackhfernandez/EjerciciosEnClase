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
          opBuscarAlumnoCodigo(lista);
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

    // Verificar si la lista tiene espacion disponible
    if (lista.hayEspacio()) {

      codigo = JOptionPane.showInputDialog("Ingrese codigo: ");
      nombre = JOptionPane.showInputDialog("Ingrese nombre: ");
      carrera = JOptionPane.showInputDialog("Ingrese carrera: ");
      edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad: "));

      // Instanciar un objeto (new) asignar espacion memoria
      nuevo = new Alumno(codigo, nombre, carrera, edad);

      lista.agregar(nuevo);
      JOptionPane.showMessageDialog(null, "Alumno agregado");
    } else {
      JOptionPane.showMessageDialog(null, "Lista llena");
    }
  }
  
  // case 3
  static void opBuscarAlumnoCodigo(ListaAlumnos lista){
    // 1. Ingresar codigo buscar (MAIN)
    // 2. Recorrer la lista de alumnos hasta el contador (LISTA)
    //    2.1 Verificar (comparar) codigo ingresado - c. alumno (LISTA)
    //    2.2 Mostrar datos de alumno encontrado (MAIN)
    //    2.3 Mostrar error de alumno encontrado (MAIN)
       
    String codigoBuscar  = JOptionPane.showInputDialog("Ingrese codigo a buscar: ");
    
    Alumno alEncontrado = lista.buscarPorCodigo(codigoBuscar);
    
    if (alEncontrado != null){
      JOptionPane.showInputDialog(null, "Alumno encontrado " + alEncontrado.toString());
    } else {
      JOptionPane.showInputDialog(null, "Alumno con codigo " + codigoBuscar + " no encontrado");
    }
  }

  static int opciones() {
    String menu = "1. Agregar alumno\n"
        + "2. Presentar alumnos\n"
        + "3. Buscar alumno\n"
        + "4. Presentar alumnos por carrera\n"
        + "6. Salir";
    int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
    return opcion;
  }
}
