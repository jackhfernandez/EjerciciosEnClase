/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany._vector_estructuras;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class Alumno {
  // Atributos campos - datos
  String codigo;
  String nombre;
  String curso;
  int nota;
}

public class App {
  
  static final int MAX = 10;
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    // Declarar Alumnos por separado
    Alumno A1, A2, A3, A4, A5;

    // Declarar un vector de alumnos
    Alumno alumnos[];

    // Asignacion de espacio en memoria (new)
    A1 = new Alumno();
    A2 = new Alumno();

    alumnos = new Alumno[MAX];
  }
  
  // OPERACIONES PARA 1 Alumno: llenar, mostrar
  static void llenarAlumnos(Alumno A){
    System.out.println("Ingrese codigo: ");
    A.codigo = scanner.next();
    System.out.println("Ingrese nombre: ");
    A.nombre = scanner.nextLine();
    System.out.println("Ingrese curso: ");
    A.curso = scanner.nextLine();
    System.out.println("Ingrese nota: ");
    A.nota = scanner.nextInt();
  }
  
  static void mostrarAlumno(Alumno A){
    System.out.println(A.codigo + " - " + A.nombre 
    + " - " + A.curso + " - " + A.nota);
  }
}
