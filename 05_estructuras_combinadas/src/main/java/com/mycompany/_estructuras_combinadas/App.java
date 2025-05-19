/**
 * Crear un programa con las siguientes condiciones:
 * crear dos clases: DatosFamiliares y Empleado
 * DatosFamiliares:
 * - Direccion
 * - NumeroHijos
 * - Distrito
 * 
 */
package com.mycompany._estructuras_combinadas;

import java.util.Scanner;

/**
 *
 * @author Jack
 */

// 1. Crear clase datosFamiliares
// llenar (dato familiar) y mostrar
class DatosFamiliares {
  // Atributos
  String direccion;
  int numHijos;
  String distrito;
}

// 2. Crear clase empleados (5 atributos)
// llenar empleado, mostrar
class Empleado {
  // Atributos
  String dni;
  String nombres;
  int edad;
  String areaTrabajo;
  DatosFamiliares df;
}

public class App {

  // Scanner y Const
  static Scanner scanner = new Scanner(System.in);
  static final int MAX = 2;
  
  // 3. en ele main, crear el vector empresa
  // cons MAX -> 3
  public static void main(String[] args) {
    
    //DatosFamiliares df = new DatosFamiliares();
    //Empleado e = new Empleado();
    
    // Vector empresa
    Empleado empresa[] = new Empleado[MAX];

    // Llenar empleados
    llenarEmpresa(empresa);
    
    // Mostrar 
    //mostrarEmpresa(empresa);
  }
  
  // Llenar datos familiares
  static void llenarDatosFamiliares(DatosFamiliares df){
    System.out.println("\nIngresar datos familiares");
    System.out.println("Direccion: ");
    df.direccion = scanner.next();
    System.out.println("Nro Hijos: ");
    df.numHijos = scanner.nextInt();
    System.out.println("Distrito: ");
    df.distrito = scanner.next();
  }
  
  // Mostrar datos familiares
  static void mostrarDatosFamiliares(DatosFamiliares df){
    System.out.println("\nMostrando datos familiares");
    System.out.println("Direccion: " + df.direccion + "Distrito: " + df.distrito + "Nro hijos: " + df.numHijos);
  }
  
  // Llenar datos empleado
  static void llenarEmpleado(Empleado empleado){
    System.out.println("LLenar datos del empleado");
    System.out.print("DNI: ");
    empleado.dni = scanner.next();
    System.out.print("NOMBRE: ");
    empleado.nombres = scanner.next();
    System.out.print("EDAD: ");
    empleado.edad = scanner.nextInt();
    System.out.print("Area Trabajo: ");
    empleado.areaTrabajo = scanner.next();
    empleado.df = new DatosFamiliares();
    llenarDatosFamiliares(empleado.df);
  }
  
  // Mostrar empleado
  static void mostrarEmpleado(Empleado empleado){
    System.out.println("NOMBRE: "+empleado.nombres+" DNI: "+empleado.dni+" EDAD: "+empleado.edad+ " Area Trabajo: "+empleado.areaTrabajo);
    mostrarDatosFamiliares(empleado.df);
  }
  
  // LLenar empresa
  static void llenarEmpresa(Empleado empresa[]){
    for (int i = 0; i < MAX; i++) {
      System.out.println("Empleado " + (i+1));
      empresa[i] = new Empleado();
      llenarEmpleado(empresa[i]);
    }
  }
  
  // Mostrar empresa
  static void mostrarEmpresa(Empleado empleado, Empleado empresa []){
    for (int i = 0; i < MAX; i++) {
      mostrarEmpleado(empresa[i]);
      mostrarDatosFamiliares(empleado.df);
    }
  }
}
