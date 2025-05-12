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
  
  static final int MAX = 2;
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
    
    // Llamar funciones 
    llenado(alumnos);
    presentar(alumnos);
    buscarPorCodigo(alumnos);
  }
  
  // OPERACIONES PARA 1 Alumno: llenar, mostrar
  static void llenarAlumnos(Alumno A){
    System.out.print("Ingrese codigo: ");
    A.codigo = scanner.next();
    scanner.nextLine();
    System.out.print("Ingrese nombre: ");
    A.nombre = scanner.nextLine();
    System.out.print("Ingrese curso: ");
    A.curso = scanner.nextLine();
    System.out.print("Ingrese nota: ");
    A.nota = scanner.nextInt();
  }
  
  static void mostrarAlumno(Alumno A){
    System.out.println(A.codigo + " - " + A.nombre 
    + " - " + A.curso + " - " + A.nota);
  }
  
  // OPeraciones | Funciones para el vector alumnos
  // Llenado, Presentar , Ordenar, Busqueda, Intercambiar
  static void llenado(Alumno alumnos[]){
    for (int i = 0; i < MAX; i++) {
      System.out.println("Alumno " + (i+1) + ": ");
      // Llamando a la funcion
      
      alumnos[i] = new Alumno();
      llenarAlumnos(alumnos[i]);
      
      /*// Linea a linea
      System.out.println("Ingrese nombre: ");
      alumnos[i].nombre = scanner.nextLine();*/
    }
  }
  
  static void presentar(Alumno alumnos[]){
    System.out.println("\nMostrando alumno\n");
    for (int i = 0; i < MAX; i++) {
      mostrarAlumno(alumnos[i]);
    }
  }
  
  // FUNCION PARA MOSTRAR ALUMNOS POR CODIGO
  // Mostrar datos del alumno encontrado o mensaje de error
  static void buscarPorCodigo(Alumno alumnos[]){
    System.out.print("Ingrese el codigo: ");
    String codigo = scanner.next();
    boolean encontrado=false;
    int indice =0;
    for (int i = 0; i < MAX; i++) {
      if(codigo.equals(alumnos[i].codigo)) {
        indice = i;
        encontrado=true;
      } else {
        encontrado=false;
      }
    }
    if (encontrado == true){
      System.out.println("\nAlumno encontrado");
      mostrarAlumno(alumnos[indice]);
    } else {
      System.out.println("\nAlumno no encontrado");
    }
  }
}
