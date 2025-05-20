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
  String turno;
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

    Empleado empleados[] = new Empleado[MAX_TRA];

    Empleado e = new Empleado();

    System.out.println("\n::: Bienvenido a soluciones ATS ::: \n");

    // Llamando funciones
    llenarAlmacen(p);
    menu(opcion, e, empleados, p);
  }

  // Menu
  static void menu(int opcion, Empleado e, Empleado empleados[], Producto p) {
    do {
      System.out.println("1. Llenar empleado");
      System.out.println("2. Presentar empleados");
      System.out.println("3. Realizar venta");
      System.out.println("4. Mostrar productos");
      System.out.println("5. Mostrar sueldo");
      System.out.println("6. Salir");

      do {
        System.out.print("Ingrese una opcion (1-9): ");
        opcion = sc.nextInt();
      } while (opcion < 0 || opcion > 6);

      cambiarSwitch(opcion, e, empleados, p);
    } while (opcion != 6);
  }

  static void cambiarSwitch(int opcion, Empleado e, Empleado empleados[], Producto p) {
    switch (opcion) {
      // Llenar empleado
      case 1 -> {
        llenarEmpresa(e, empleados, CONTADOR);
      }
      // Presentar empleados
      case 2 -> {
        mostrarEmpresa(e, CONTADOR);
      }
      // Realizar venta
      case 3 -> {
        System.out.println("3");
      }
      // Mostrar Productos en almacen
      case 4 -> {
        mostrarAlmacen(p);
      }
      // Mostrar venta
      case 5 -> {
        System.out.println("5");
      }
      case 6 -> { // Salir del programa
        System.out.println("\n\tSaliendo del programa");
      }
      default -> {
        System.out.println("Opcion no valida");
      }
    }
  }

  // PRIMERO EN MAIN : Func Agregar productos
  // Llenar un producto
  static void llenarProducto(Producto p) {
    System.out.print("ID: ");
    p.ID = sc.nextInt();
    System.out.print("NOMBRE: ");
    p.nombreProd = sc.next();
    System.out.print("PRECIO: ");
    p.precio = sc.nextDouble();
    System.out.println("");
  }

  // Mostrar un producto
  static void mostrarProducto(Producto p) {
    System.out.println("ID: " + p.ID + "\nNOMBRE: " + p.nombreProd + "\nPRECIO: " + p.precio + "\n");
  }

  // Llenar almacen
  static void llenarAlmacen(Producto p) {
    for (int i = 0; i < MAX_PRO; i++) {
      System.out.println("PRODUCTO " + (i + 1) + ": ");
      llenarProducto(p);
    }
  }

  // 1. Llenar empleado mientras sea menor
  // Llenar empresa
  static void llenarEmpresa(Empleado e, Empleado empleados[], int CONTADOR) {
    
      llenarEmpleado(e, CONTADOR);
     
    System.out.println("Ha alcanzado el maximo de trabajadores!");

  }

  // llenar empleado
  static void llenarEmpleado(Empleado e, int CONTADOR) {
    System.out.println("\nIngrese datos del empleado");
    System.out.print("CODIGO: ");
    e.codigoEmp = sc.next();
    System.out.print("NOMBRE: ");
    e.nombre = sc.next();
    System.out.print("TURNO: ");
    e.turno = sc.next();
    CONTADOR++;
    System.out.println("\nCantidad trabajadores " + CONTADOR);
    System.out.println("\nTrabajador registrado con exito!!!\n");
  }

  // Mostrar un empleado
  static void mostrarEmpleado(Empleado e) {
    System.out.println("\nCODIGO: " + e.codigoEmp + "\nNOMBRE" + e.nombre + "\nTURNO: " + e.turno);
    System.out.println("SUELDO: " + e.sueldo);
    //e.vr = new ventasR();
    System.out.println("ventas" + e.vr + "\n");
  }

  // 2. Presentar empleados - empresa
  static void mostrarEmpresa(Empleado e, int CONTADOR) {
    for (int i = 0; i <= CONTADOR; i++) {
      mostrarEmpleado(e);
    }
  }

  // 3. Realizar venta
  static void venta() {

  }

  // 4. Mostrar productos - Almacen
  static void mostrarAlmacen(Producto p) {
    for (int i = 0; i < MAX_PRO; i++) {
      System.out.println("\nPRODUCTO " + (i + 1) + ": ");
      mostrarProducto(p);
    }
  }
}
