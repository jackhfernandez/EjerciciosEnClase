/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany._lista_objetos_menuopciones;

import clases.ListaAlumnos;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class App {

  public static void main(String[] args) {

    int op;
    ListaAlumnos lista = new ListaAlumnos();
    do{
      op = opciones();
      switch (op){
        case 1 -> {}
        case 2 -> {}
        case 3 -> {}
        default -> {}
      }
    } while (op != 6);
  }
  
  // case 1
  static void opAgregarAlumnos(){
    
  }
  
  static int opciones(){
    String menu = "1. Agregar alumno\n" +
                  "2. Presentar alumnos\n" +
                  "3. Buscar alumno\n" +
                  "6. Salir";
    int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
    return opcion;
  }
}
