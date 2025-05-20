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
    
    // Vector empresa
    Empleado empresa[] = new Empleado[MAX];

    // Llenar empleados
    llenarEmpresa(empresa);
    
    // Mostrar 
    mostrarEmpresa(empresa);
  }
  
  // Llenar datos familiares
  static void llenarDf(DatosFamiliares df){
    System.out.println("\nIngresar datos familiares");
    System.out.print("Direccion: ");
    df.direccion = scanner.next();
    System.out.print("Nro Hijos: ");
    df.numHijos = scanner.nextInt();
    System.out.print("Distrito: ");
    df.distrito = scanner.next();
  }
  
  // Mostrar datos familiares
  static void mostrarDf(DatosFamiliares df){
    System.out.println("Direccion: " + df.direccion + "\nDistrito: " + df.distrito + "\nNro hijos: " + df.numHijos);
  }
  
  // Llenar datos empleado
  static void llenarEmpleado(Empleado e){
    System.out.println("LLenar datos del empleado");
    System.out.print("DNI: ");
    e.dni = scanner.next();
    System.out.print("NOMBRE: ");
    e.nombres = scanner.next();
    System.out.print("EDAD: ");
    e.edad = scanner.nextInt();
    System.out.print("Area Trabajo: ");
    e.areaTrabajo = scanner.next();
    e.df = new DatosFamiliares();
    llenarDf(e.df);
  }
  
  // Mostrar empleado
  static void mostrarEmpleado(Empleado e){
    System.out.println("\nNOMBRE: "+e.nombres+"\nDNI: "+e.dni+"\nEDAD: "+e.edad+ "\nArea Trabajo: "+e.areaTrabajo);
    mostrarDf(e.df);
  }
  
  // LLenar empresa
  static void llenarEmpresa(Empleado empresa[]){
    for (int i = 0; i < MAX; i++) {
      System.out.println("\nEmpleado " + (i+1));
      empresa[i] = new Empleado();
      llenarEmpleado(empresa[i]);
    }
  }
  
  // Mostrar empresa
  static void mostrarEmpresa(Empleado empresa[]){
    System.out.println("\nMostrando empleados");
    for (int i = 0; i < MAX; i++) {
      mostrarEmpleado(empresa[i]);
    }
  }
}
