/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany._clases_objetos;

import clases.Alumno;
import javax.swing.JOptionPane;

/**
 *
 * @author Jack
 */
public class App {

  public static void main(String[] args) {
    // Construir Objetos
    Alumno A1 = new Alumno();
    Alumno A2 = new Alumno();

    A1.setCodigo("020030A");
    System.out.println("Codigo: " + A1.getCodigo());

    A1.setNombre("Juan Perez");
    System.out.println("NOmbre: " + A1.getNombre());

    // Copiar nombre de A2 en A1
    A2.setNombre(A1.getNombre());

    // Leer carrera por pantalla
    String carrera = JOptionPane.showInputDialog("Ingrese carrera: ");
    A1.setCarrera(carrera);

    JOptionPane.showMessageDialog(null, "Carrera: " + A1.getCarrera());
    
    JOptionPane.showInputDialog(null, "Edad: " + A1.getEdad());
    
    Alumno A3 = new Alumno("111111", "Fernando");
    Alumno A4 = new Alumno("111111", "Fernando", 20, "Fisica");
  }
}
