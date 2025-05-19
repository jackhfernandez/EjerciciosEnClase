/**
 * ventaProducto
 */
package com.mycompany.ventaproducto;

import java.util.Scanner;

/**
 *
 * @author Jack
 */


public class VentaProducto {

  // static, MAX
  static Scanner sc = new Scanner(System.in);
  static final int MAX_PRO = 3;
  static final int MAX_TRA = 3;
  static final int CONTADOR = 0;

  public static void main(String[] args) {
    int opcion = 0;

    System.out.println("\n::: Bienvenido a soluciones ATS ::: \n");

    // funcion llenar clase producto
    System.out.println("llamar funcion class Producto");
    menu(opcion);
  }

  // Menu
  static void menu(int opcion) {
    do {
      System.out.println("1. Llenar empleado");
      System.out.println("2. Presentar empleados");
      System.out.println("3. Realizar venta");
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
      case 9 -> {
        System.out.println("\n\tSaliendo del programa");
      }
      default -> {
        System.out.println("Opcion no valida");
      }
    }
  }

  // 1. llenar empleado
  // 2. Presentar empleado
  // 3. Realizar venta
}
