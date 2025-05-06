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
  static final int MAX = 5;
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    /*
    // Declaracion de vectores paralelos
    int notas[] = new int[MAX];
    String nomAlumnos[] = new String[MAX];
    String cursos[] = new String[MAX];*/
    
    int notas[] = {15, 13, 19, 14, 17};
    String nomAlumnos[] = {"Jack", "Hoover", "Developer", "Fernandez", "Reyes"};
    String cursos[] = {"HD", "HD", "HD", "MATE", "POO"};

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
      System.out.print("Alumno "+(i+1)+": ");
      nomAlumnos[i] = scanner.next();
      cursos[i] = leerCurso(); 
      notas[i] = leerNota();
    }
  }

  // Presentar vectores
  static void presentarDatos(int notas[], String nomAlumnos[], String cursos[]) {
    System.out.println("Mostrando arreglos paralelos");
    for (int i = 0; i < MAX; i++) {
      System.out.println(nomAlumnos[i] + " - " + cursos[i] + " - " + notas[i]);
    }
  }

  // Encontrar el nombre del alumno con mayor nota
  static void mayorNota(int notas[], String nomAlumnos[]) {
    System.out.print("\nAlumno con mayor nota: ");
    int nota = notas[0];
    String alumno = nomAlumnos[0];
    
    for (int i = 0; i < MAX; i++) {
      if (nota < notas[i]) {
        nota = notas[i];
        alumno = nomAlumnos[i];
      }
    }
    System.out.print(alumno + " con nota " + nota);
  }

  // Presentar total de alumnos por CURSO
  static void totalAlumnoCurso(int notas[], String nomAlumnos[], String cursos[]) {
    System.out.print("\n\nCantidad alumnos por curso ");
    int contador = 0;
    String nombreCurso = cursos[0];

    for (int i = 0; i < MAX - 1; i++) {
      if (nombreCurso.equals(cursos[i])) {
        nombreCurso = cursos[i];
        contador++;
      }
    }
    System.out.println(contador + " - en el curso de " + nombreCurso);
  }

  // Leer nota
  static int leerNota() {
    int nota;
    do {
      System.out.print("Ingrese nota (0 - 20): ");
      nota = scanner.nextInt();
    } while (nota < 0 || nota > 20);
    return nota;
  }

  // Leer nombre alumno
  static String leerCurso() {
    String curso;
    do {
      System.out.print("Ingrese el curso (POO - HD - MATE): ");
      curso = scanner.next();
    } while (!curso.equals("POO") || !curso.equals("HD") || !curso.equals("MATE"));
    return curso;
  }
}
