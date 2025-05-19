/**
 * ventaProducto
 */
package com.mycompany.ventaproducto;

import java.util.Scanner;

/**
 *
 * @author Jack
 */

// clase Producto
class Producto {
  int ID;
  String nombreProd;
  double precio;
}

// clase Empleado
class Empleado {
  String codigoEmp;
  String nombre;
  String Turno;
  double sueldo;
  VentasR vr;
}

// clase VentasR
class VentasR {
  double total;
  double pagosContado;
  double pagosTarjeta;
}

public class APP {

  // static, MAX
  static Scanner sc = new Scanner(System.in);
  static final int MAX_PRO = 2;
  static final int MAX_TRA = 2;
  static final int CONTADOR = 0;

  public static void main(String[] args) {
    int opcion = 0;
    
    // Declarar producto de Tipo Productos
    Producto p = new Producto();
    
    // Declar vector almacen
    Producto almacen[] = new Producto[MAX_PRO];

    System.out.println("\n::: Bienvenido a soluciones ATS ::: \n");

    
    // Llamando funciones
    llenarAlmacen(p);
    mostrarAlmacen(p);
    menu(opcion);
  }
  
  // PRIMERO EN MAIN : F. Agregar productos
  // Llenar un producto
  static void llenarProducto(Producto p){
    System.out.print("ID: ");
    p.ID = sc.nextInt();
    System.out.print("NOMBRE: ");
    p.nombreProd = sc.next();
    System.out.print("PRECIO: ");
    p.precio = sc.nextDouble();
  }
  
  // Mostrar un producto
  static void mostrarProducto(Producto p){
    System.out.println("ID: " + p.ID + "\nNOMBRE: " + p.nombreProd + "\nPRECIO: " + p.precio + "\n");
  }
  
  // Llenar almacen
  static void llenarAlmacen(Producto p){
    for (int i = 0; i < MAX_PRO; i++) {
      System.out.println("PRODUCTO " + (i+1) + ": ");
      llenarProducto(p);
    }
  }
  
  // Mostrar Almacen
  static void mostrarAlmacen(Producto p){
    for (int i = 0; i < MAX_PRO; i++) {
    System.out.println("\nPRODUCTO " + (i+1)+": ");
    mostrarProducto(p);
    }
  }

  // Menu
  static void menu(int opcion) {
    do {
      System.out.println("1. Llenar empleado");
      System.out.println("2. Presentar empleados");
      System.out.println("3. Realizar venta");
      System.out.println("4. Mostrar productos");
      System.out.println("9. Salir");

      do {
        System.out.print("Ingrese una opcion (1-9): ");
        opcion = sc.nextInt();
      } while (opcion < 0 || opcion > 9);

      cambiarSwitch(opcion);
    } while (opcion != 9);
  }

  static void cambiarSwitch(int opcion) {
    switch (opcion) {
      case 1 -> {
        System.out.println("1");
      }
      case 2 -> {
        System.out.println("2");
      }
      case 3 -> {
        System.out.println("3");
      }
      case 4 -> {
        System.out.println("3");
      }
      case 9 -> {
        System.out.println("\n\tSaliendo del programa");
      }
      default -> {
        System.out.println("Opcion no valida");
      }
    }
  }

  // 1. llenar empleado
  static void llenarEmpleado(){
    System.out.println("Ingrese datos del empleado");
    
  }
  // 2. Presentar empleado
  // 3. Realizar venta
  // 4. Mostrar producto
  
}
