/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany._clases_objetos;

import clases.Alumno;
import clases.Curso;
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
    Alumno A4 = new Alumno("111111", "Ana", 19, "Fisica");
    
    JOptionPane.showMessageDialog(null, A4.getAlumno());
    
    // Creacion de objetos tipo curso
    Curso C1, C2, C3;
    
   C1 = new Curso();
   C1.setCodigo("CL600");
   C1.setNombre("POO");
   C1.setCreditos(4);
   
   C2 = new Curso("cl700", "Fundamentos", 5, "LU 7:30 - 10:00", "EPICI");
   
   C3 = new Curso();
   String codigo, nombre;
   int creditos;
   
   codigo = JOptionPane.showInputDialog("Ingrese codigo: ");
   nombre = JOptionPane.showInputDialog("Ingrese nombre del curso: ");
   creditos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese creditos: "));
       
   C3.setCodigo(codigo);
   C3.setNombre(nombre);
   C3.setCreditos(creditos);
   
   JOptionPane.showInputDialog(null, "Curso 1\n" + C1.getCurso());
   JOptionPane.showInputDialog(null, "Curso 2\n" + C1.getCurso());
   JOptionPane.showInputDialog(null, "Curso 3\n" + C1.getCurso());
  }
}
