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
  static int contador = 0;

  public static void main(String[] args) {
    int opcion = 0;

    // Vector de productos
    Producto almacen[] = new Producto[MAX_PRO];

    // Declarar producto de Tipo Producto
    Producto p = new Producto();

    // Vector de empleados
    Empleado empleados[] = new Empleado[MAX_TRA];

    // e de tipo Empleado
    Empleado e = new Empleado();

    System.out.println("\n::: Bienvenido a soluciones ATS ::: \n");

    // Llamando funciones
    llenarAlmacen(almacen);
    menu(opcion, e, empleados, p, almacen);
  }

  // Menu
  static void menu(int opcion, Empleado e, Empleado empleados[], Producto p, Producto almacen[]) {
    do {
      System.out.println("1. Registrar empleado");
      System.out.println("2. Presentar empleados");
      System.out.println("3. Realizar venta");
      System.out.println("4. Mostrar productos");
      System.out.println("5. Mostrar sueldo de los trabajadores");
      System.out.println("6. Mostrar cantidad de tipos de pago");
      System.out.println("7. Salir");

      do {
        System.out.print("Ingrese una opcion (1-7): ");
        opcion = sc.nextInt();
      } while (opcion < 0 || opcion > 7);

      cambiarSwitch(opcion, e, empleados, p, almacen);
    } while (opcion != 7);
  }

  static void cambiarSwitch(int opcion, Empleado e, Empleado empleados[], Producto p, Producto almacen[]) {
    switch (opcion) {
      // Llenar empleado
      case 1 -> {
        contador = llenarEmpresa(e, empleados, contador);
      }
      // Presentar empleados
      case 2 -> {
        calcularSueldo(empleados, contador);
        mostrarEmpresa(empleados, contador);
      }
      // Realizar venta
      case 3 -> {
        realizarVenta(almacen, empleados, contador);
      }
      // Mostrar Productos en almacen
      case 4 -> {
        mostrarAlmacen(almacen);
      }
      // Mostrar sueldo
      case 5 -> {
        calcularSueldo(empleados, contador);
        mostrarSueldo(empleados, contador);
      }
      // Mostrar cantidad de tipos de pago
      case 6 -> {
        mostrarTiposDePago(empleados, contador);
      }
      case 7 -> { // Salir del programa
        System.out.println("\n\tSaliendo del programa");
      }
      default -> {
        System.out.println("Opcion no valida");
      }
    }
  }

  // Llenar un producto
  static Producto llenarProducto(Producto p) {
    System.out.print("ID: ");
    p.ID = sc.nextInt();
    System.out.print("NOMBRE: ");
    p.nombreProd = sc.next();
    System.out.print("PRECIO: ");
    p.precio = sc.nextDouble();
    System.out.println("");
    return p;
  }

  // Mostrar un producto
  static void mostrarProducto(Producto p) {
    System.out.println("ID: " + p.ID + "\nNOMBRE: " + p.nombreProd + "\nPRECIO: " + p.precio);
  }

  // Llenar almacen con productos
  static void llenarAlmacen(Producto almacen[]) {
    for (int i = 0; i < MAX_PRO; i++) {
      System.out.println("PRODUCTO " + (i + 1) + ": ");
      // Crear un nuevo objeto Producto en cada iteracion
      Producto p = new Producto();
      // Llenar el producto
      almacen[i] = new Producto();
      almacen[i] = llenarProducto(p);
    }
  }

  // 1. Registrar empleados
  static int llenarEmpresa(Empleado e, Empleado empleados[], int contador) {
    if (contador < MAX_TRA) {
      empleados[contador] = new Empleado();
      llenarEmpleado(empleados[contador], contador);
      contador++;
      return contador;
    } else {
      System.out.println("\nHa alcanzado el maximo de trabajadores!\n");
      return contador;
    }
  }

  // llenar empleado
  static void llenarEmpleado(Empleado e, int contador) {
    System.out.println("\nIngrese datos del empleado");
    System.out.print("CODIGO: ");
    e.codigoEmp = sc.next();
    System.out.print("NOMBRE: ");
    e.nombre = sc.next();
    System.out.print("TURNO : ");
    e.turno = sc.next();
    System.out.println("\nCantidad trabajadores " + (contador + 1));
    System.out.println("\nTrabajador registrado con exito!!!\n");
  }

  // Mostrar un empleado
  static void mostrarEmpleado(Empleado e) {
    System.out.println("\nCODIGO : " + e.codigoEmp + "\nNOMBRE : " + e.nombre + "\nTURNO  : " + e.turno);
    System.out.println("SUELDO : " + e.sueldo);

    if (e.vr == null) {
      e.vr = new VentasR();
    }
    System.out.println("TOTAL  : " + e.vr.total);
    System.out.println("CONTADO: " + e.vr.pagosContado);
    System.out.println("TARJETA: " + e.vr.pagosTarjeta + "\n");
  }

  // 2. Presentar empleados - empresa
  static void mostrarEmpresa(Empleado empleados[], int contador) {
    for (int i = 0; i < contador; i++) {
      if (empleados[i] != null) {
        mostrarEmpleado(empleados[i]);
      }
    }
  }

  // 3. Realizar venta
  static void realizarVenta(Producto almacen[], Empleado empleados[], int contador) {

    // a) Mostrar nombre de los productos
    System.out.println("\nProductos disponibles: \n");
    for (int i = 0; i < MAX_PRO; i++) {
      System.out.println((i + 1) + ". " + almacen[i].nombreProd + " - Precio: " + almacen[i].precio);
    }

    // b) Elegir producto
    System.out.print("Seleccione un producto (1-" + MAX_PRO + "): ");
    int productoSeleccionado = sc.nextInt() - 1;

    // c) Pedir al usuario la cantidad.
    System.out.print("Ingrese la cantidad: ");
    int cantidad = sc.nextInt();

    // d) Preguntar si el pago es al contado o con tarjeta
    System.out.print("\nForma de pago: \n1. Contado \n2. Tarjeta \nIngrese una opcion (1-2): ");
    int formaPago = sc.nextInt();

    // e) preguntar a que trabajador asignar la venta
    System.out.println("\nEmpleados disponibles: ");
    for (int i = 0; i < contador; i++) {
      System.out.println((i + 1) + ". " + empleados[i].nombre);
    }
    System.out.print("\nAsignar venta a empleado (1-" + contador + "): ");
    int empleadoSeleccionado = sc.nextInt() - 1;

    // f) total = cantidad * precio
    double total = cantidad * almacen[productoSeleccionado].precio;
    System.out.println("\nTotal de venta: " + total);

    // g) Inicializar el objeto ventasR si no existe
    if (empleados[empleadoSeleccionado].vr == null) {
      empleados[empleadoSeleccionado].vr = new VentasR();
    }

    // Actualizar ventas del empleado
    empleados[empleadoSeleccionado].vr.total += total;

    if (formaPago == 1) {
      empleados[empleadoSeleccionado].vr.pagosContado += total;
      System.out.println("\nPago al contado registrado\n");
    } else {
      empleados[empleadoSeleccionado].vr.pagosTarjeta += total;
      System.out.println("\nPago con tarjeta registrado\n");
    }

    System.out.println("Venta registrada con exito!!!\n");

    calcularSueldo(empleados, contador);
  }

  // 4. Mostrar productos - Almacen
  static void mostrarAlmacen(Producto almacen[]) {
    System.out.println("\nMostrando productos");
    for (int i = 0; i < MAX_PRO; i++) {
      System.out.println("\nPRODUCTO " + (i + 1));
      mostrarProducto(almacen[i]);
    }
    System.out.println("");
  }

  // 5. Calcular sueldo
  static void calcularSueldo(Empleado empleados[], int contador) {
    // * 10% de las ventas del trabajador + base = 1120
    double sueldoBase = 1120;
    double porcentaje = 0.10;

    for (int i = 0; i < contador; i++) {
      if (empleados[i] != null && empleados[i].vr != null) {
        empleados[i].sueldo = sueldoBase + (empleados[i].vr.total * porcentaje);
      } else if (empleados[i] != null) {
        empleados[i].sueldo = sueldoBase;
      }
    }
  }

  // 6. Mostrar sueldo de todos los trabajadores
  static void mostrarSueldo(Empleado empleados[], int contador) {
    // Mostrar sueldo de cada trabajador
    System.out.println("\nSueldo de los trabajadores: ");
    for (int i = 0; i < contador; i++) {
      if (empleados[i] != null) {
        System.out.println("Empleado: " + empleados[i].nombre);
        System.out.println("Codigo: " + empleados[i].codigoEmp);
        System.out.println("Sueldo: " + empleados[i].sueldo + "\n");
      }
    }
  }

  // 7. Mostrar cantidad de tipos de pago
  static void mostrarTiposDePago(Empleado empleados[], int contador) {
    // - Tarjeta - contado
    double totalContado = 0;
    double totalTarjeta = 0;

    for (int i = 0; i < contador; i++) {
      if (empleados[i] != null && empleados[i].vr != null) {
        totalContado += empleados[i].vr.pagosContado;
        totalTarjeta += empleados[i].vr.pagosTarjeta;
      }
    }
    System.out.println("\nTipos de pago ");
    System.out.println("\nTotal pagos al contado: " + totalContado);
    System.out.println("Total pagos con tarjeta: " + totalTarjeta);
    System.out.println("Total ventas: " + (totalContado + totalTarjeta) + "\n");
  }
}
