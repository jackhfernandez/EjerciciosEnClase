/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany._listas_objetos;

import clases.Alumno;
import clases.ListaAlumnos;

/**
 *
 * @author Jack
 */
public class App {

  public static void main(String[] args) {
    Alumno A1 = new Alumno("A001", "Juan", "EPICI", 17);
    Alumno A2 = new Alumno("A002", "Juan", "EPICI", 17);
    Alumno A3 = new Alumno("A003", "Juan", "EPICI", 17);
    
    // Objetos
    ListaAlumnos LA = new ListaAlumnos();
    
    // Agregar
    LA.agregar(A1);
    LA.agregar(A2);
    LA.agregar(A3);
    
    // Presentar
    LA.presentar();
  }
}
