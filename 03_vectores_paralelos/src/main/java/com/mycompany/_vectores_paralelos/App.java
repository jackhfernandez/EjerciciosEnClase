/** *********************************************************
 * VECTORES PARALELOS: tienen la misma cantidad de elementos
 ********************************************************* */
package com.mycompany._vectores_paralelos;

import java.util.Scanner;

/**
 *
 * @author Jack
 */
public class App {

  // Constant y Scanner
  static final int MAX = 3;
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    /*
    // Declaracion de vectores paralelos
    int notas[] = new int[MAX];
    String nomAlumnos[] = new String[MAX];
    String cursos[] = new String[MAX];*/
    
    int notas[] = {15, 13, 14};
    String nomAlumnos[] = {"jack", "fernandez", "reyes"};
    String cursos[] = {"hd", "hd", "nose"};
    
    //llenadoDatos(notas, nomAlumnos, cursos);
    presentarDatos(notas, nomAlumnos, cursos);
    mayorNota(notas, nomAlumnos);
    totalAlumnoCurso(notas, nomAlumnos, cursos);

  }

  // Llenado de los vectores
  // FUNCION: 
  // Sus propias variables
  //    - Los parametros (en los parentesis)
  //    - Declarar dentro de la funcion
  static void llenadoDatos(int notas[], String nomAlumnos[], String cursos[]) {
    for (int i = 0; i < MAX; i++) {
      System.out.print("Nota   " + (i + 1) + ": ");
      notas[i] = scanner.nextInt();

      System.out.print("Alumno " + (i + 1) + ": ");
      nomAlumnos[i] = scanner.next();

      System.out.print("Curso  " + (i + 1) + ": ");
      cursos[i] = scanner.next();
    }
  }

  // Presentar vectores
  static void presentarDatos(int notas[], String nomAlumnos[], String cursos[]) {
    for (int i = 0; i < MAX; i++) {
      System.out.println(nomAlumnos[i] + " - " + cursos[i] + " - " + notas[i]);
    }
  }

  // Encontrar el nombre del alumno con mayor nota
  static void mayorNota(int notas[], String nomAlumnos[]) {
    System.out.println("\nAlumno con mayor nota");
    for (int i = 0; i < MAX-1; i++) {
      if (notas[i] > notas[(i + 1)]) {
        System.out.println(nomAlumnos[i]);
        System.out.println(notas[i]);
      }
    }
  }

  // Presentar total de alumnos por CURSO
  static void totalAlumnoCurso(int notas[], String nomAlumnos[], String cursos[]) {
    System.out.println("\nCantidad alumnos por curso");
    int contador = 0; String nombreCurso="";
    for (int i = 0; i < MAX-1; i++) {
      if (!nombreCurso.equals(cursos[i])) {
        nombreCurso=cursos[i];
        contador++;
        
      }
    }
    System.out.println("\nCantidad alumnos en el mismo curso " + contador+" "+ nombreCurso);
  }

  // Leer nota
  
  
}
