/**
 * APP para mostrar los diferentes paradigmas de programacion
 */

package com.mycompany._sintaxis_java;

import java.util.Scanner;

/**
 *
 * @author Jack
 */
public class App {

  // Declaracion de constante
  static final double PRECIO = 25;

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    //paradigmaSecuencial();
    //paradigmaEstructurado();
    paradigmaProcedimental();
  }

  // Ejemplo del paradigma secuencial
  public static void paradigmaSecuencial() {
    // Tipo de datos y declaracion de variables
    int n1, n2;
    double promedio;

    // Entrada de datos
    System.out.print("Ingrese nota 1: ");
    n1 = scanner.nextInt();

    System.out.print("Ingrese nota 2: ");
    n2 = scanner.nextInt();

    // Proceso
    promedio = (n1 + n2) / 2.0;

    // salida de datos
    System.out.println("Promedio " + promedio);
  }

  public static void paradigmaEstructurado() {
    String nombreProducto;
    int cantidad;
    double monto;

    System.out.print("Nombre producto: ");
    nombreProducto = scanner.next();

    System.out.print("Cantidad de productos: ");
    cantidad = scanner.nextInt();

    monto = cantidad * PRECIO;

    if (cantidad > 3 ) {
      double dcto = monto*0.20;
      monto = monto - dcto;
    }
    System.out.println("- Producto: "+nombreProducto+ "\n- Monto: " + monto);
  }

  public static void paradigmaProcedimental(){
    int num1, num2, num3;
    num1 = leerNumero("Ingrese numero 1: ");
    num2 = leerNumero("Ingrese numero 2: ");
    num3 = leerNumero("Ingrese numero 3: ");

    // Encontrar el mayor valor
    if (num1 > num2 && num1 > num3) {
      System.out.println("El mayor es: " + num1);
    } else if (num2 > num1 && num2 > num3) {
      System.out.println("El mayor es: " + num2);
    } else {
      System.out.println("El mayor es: " + num3);
    }
  }

  public static int leerNumero(String mensaje){
    int numero;
    System.out.print(mensaje);
    numero = scanner.nextInt();
    return numero;
  }
}