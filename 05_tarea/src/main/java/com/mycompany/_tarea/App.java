package com.mycompany._tarea;

import java.util.Scanner;

/**
 *
 * @author Jack
 */
// class df
class DatosFamiliares {
  String direccion;
  int numHijos;
  String distrito;
}

//Clase Empleado :
class Empleado {
  int Dni;
  String nombre;
  int Edad;
  String AreaTrabajo;
  DatosFamiliares df;
}

public class App {

  final static int MAX = 2;
  final static Scanner entrada = new Scanner(System.in);
  
  public static void main(String[] args) {

    Empleado[] empresa = new Empleado[MAX];
    //llenamos Empleados 
    LlenarEmpresa(empresa);
    //mostramos
    MostrarEmpresa(empresa);

    //menu con la funciones Extra
    MenuFuncionesExtra(empresa);

  }
  // llenar DF :
  static void llenarDF(DatosFamiliares df) {

    System.out.println("Ingrese Distrito : ");
    df.distrito = entrada.next();
    System.out.println("Ingrese Numero de Hijos : ");
    df.numHijos = entrada.nextInt();
    entrada.nextLine();
    System.out.println("Ingrese Direccion : ");
    df.direccion = entrada.nextLine();

  }

  static void mostrarDF(DatosFamiliares df) {
    System.out.println("Distrito : " + df.distrito
        + " Num Hijos : " + df.numHijos + " Direccion : " + df.direccion);
  }

  //Funciones :
  static void LlenarEmpleado(Empleado empleado) {

    System.out.print("Ingrese DNI : ");
    empleado.Dni = entrada.nextInt();
    entrada.nextLine();
    System.out.print("Ingrese Nombre : ");
    empleado.nombre = entrada.nextLine();

    System.out.print("Ingrese Edad : ");
    empleado.Edad = entrada.nextInt();
    entrada.nextLine();
    System.out.print("Ingrese Area de Trabajo : ");
    empleado.AreaTrabajo = entrada.nextLine();

    empleado.df = new DatosFamiliares();
    llenarDF(empleado.df);

  }

  static void MostrarEmpleado(Empleado E) {
    System.out.println("Dni : " + E.Dni + " Nombre " + E.nombre
        + " Edad : " + E.Edad + " Area de Trabajo " + E.AreaTrabajo);
    mostrarDF(E.df);
  }

  //funciones para empresa
  static void LlenarEmpresa(Empleado[] empresa) {
    System.out.println("\nIngresar datos\n");
    for (int i = 0; i < MAX; i++) {
      System.out.println("Ingrese Datos de Empleado " + (i + 1));
      empresa[i] = new Empleado();
      LlenarEmpleado(empresa[i]);
    }
  }

  static void MostrarEmpresa(Empleado[] empresa) {
    for (int i = 0; i < MAX; i++) {
      MostrarEmpleado(empresa[i]);
    }
  }

  //Funciones Extras :
  //Empleados por Area de Trabajo
  static void EmpleadosPorArea(Empleado[] empresa) {
    String area;
    System.out.println("Ingrese Area de Trabajo : ");
    area = entrada.nextLine();
    for (int i = 0; i < MAX; i++) {
      if (empresa[i].AreaTrabajo.equals(area)) {
        MostrarEmpleado(empresa[i]);
      }
    }
  }

  //total de Empleados de todas la areas (aqui se se coloca cada area de trabajo y se cuenta el total y se muetra no se pide area por q mostrara todas)
  static void TotalEmpleadosPorArea(Empleado[] empresa) {
    System.out.println("::::: Empleados por Area de Trabajo ::::::");

    // Crear un array de areas de trabajo únicas
    String[] areasUnicas = new String[MAX];
    int[] conteoAreas = new int[MAX];
    int totalAreasUnicas = 0;

    for (int i = 0; i < MAX; i++) {
      if (empresa[i] != null && empresa[i].AreaTrabajo != null) {
        boolean encontrada = false;
        String areaActual = empresa[i].AreaTrabajo;

        for (int j = 0; j < totalAreasUnicas; j++) {
          if (areaActual.equals(areasUnicas[j])) {
            conteoAreas[j]++;
            encontrada = true;
            break;
          }
        }

        if (!encontrada) {
          areasUnicas[totalAreasUnicas] = areaActual;
          conteoAreas[totalAreasUnicas] = 1;
          totalAreasUnicas++;
        }
      }
    }

    // Mostrar el resultado
    for (int i = 0; i < totalAreasUnicas; i++) {
      System.out.println("Area de Trabajo: " + areasUnicas[i]
          + " - Total de Empleados: " + conteoAreas[i]);
    }
  }

  //Nombre del El Empleado con Mayor numero de Hijos
  static void EmpleadoConMayorHijos(Empleado[] empresa) {
    int maxHijos = 0;
    String nombre = "";
    for (int i = 0; i < MAX; i++) {
      if (empresa[i].df.numHijos > maxHijos) {
        maxHijos = empresa[i].df.numHijos;
        nombre = empresa[i].nombre;
      }
    }
    System.out.println("Empleado con mayor numero de hijos: " + nombre + " con " + maxHijos + " hijos.");
  }

  //total de empleados por distrito
  static void TotalEmpleadosPorDistrito(Empleado[] empresa) {
    String distrito;
    System.out.println("Ingrese Distrito : ");
    distrito = entrada.nextLine();
    int contador = 0;
    for (int i = 0; i < MAX; i++) {
      if (empresa[i].df.distrito.equals(distrito)) {
        contador++;
      }
    }
    System.out.println("Total de Empleados en el Distrito " + distrito + " : " + contador);
  }

  //ordenamiento Empleados por Edad (insercion)
  static void OrdenarEmpleadosPorEdad(Empleado[] empresa) {
    for (int i = 1; i < MAX; i++) {
      Empleado temp = empresa[i];
      int j = i - 1;
      while (j >= 0 && empresa[j].Edad > temp.Edad) {
        empresa[j + 1] = empresa[j];
        j--;
      }
      empresa[j + 1] = temp;
    }
    System.out.println("Empleados ordenados por Edad : ");
    MostrarEmpresa(empresa);
  }

  //busqueda de empleado por DNI
  static void BuscarEmpleadoPorDNI(Empleado[] empresa) {
    int dni;
    System.out.println("Ingrese DNI : ");
    dni = entrada.nextInt();
    for (int i = 0; i < MAX; i++) {
      if (empresa[i].Dni == dni) {
        MostrarEmpleado(empresa[i]);
      }
    }
  }

  //modificar datos de empleado
  static void ModificarDatosEmpleado(Empleado[] empresa) {
    int dni;
    System.out.println("Ingrese DNI : ");
    dni = entrada.nextInt();
    for (int i = 0; i < MAX; i++) {
      if (empresa[i].Dni == dni) {
        System.out.println("Ingrese nuevo nombre : ");
        empresa[i].nombre = entrada.next();
        System.out.println("Ingrese nueva edad : ");
        empresa[i].Edad = entrada.nextInt();
        System.out.println("Ingrese nuevo area de trabajo : ");
        empresa[i].AreaTrabajo = entrada.next();
        llenarDF(empresa[i].df);
      }
    }
  }

  //eliminar empleado ( no eliminar por q generar error  si no dejar sus datos como 0)
  static void EliminarEmpleado(Empleado[] empresa) {
    int dni;
    System.out.println("Ingrese DNI : ");
    dni = entrada.nextInt();
    for (int i = 0; i < MAX; i++) {
      if (empresa[i].Dni == dni) {
        empresa[i].Dni = 0;
        empresa[i].nombre = "";
        empresa[i].Edad = 0;
        empresa[i].AreaTrabajo = "";
        empresa[i].df.distrito = "";
        empresa[i].df.numHijos = 0;
        empresa[i].df.direccion = "";
      }
    }
  }

  //menu con la funciones Extra:
  static void MenuFuncionesExtra(Empleado[] empresa) {
    int opcion;
    do {
      System.out.println("\n:::: Soluciones ATS :::::");
      System.out.println("1. Empleados por area de trabajo");
      System.out.println("2. Mostrar total empleados por area");
      System.out.println("3. Empleado con mayor numero de hijos");
      System.out.println("4. Total de empleados por distrito");
      System.out.println("5. Ordenar Empleados por Edad");
      System.out.println("6. Buscar empleado por DNI");
      System.out.println("7. Modificar campo empleado");
      System.out.println("8. Eliminar empleado");
      System.out.println("9. Salir");
      System.out.print("Ingrese una opcion: ");
      opcion = entrada.nextInt();
      entrada.nextLine();
      switch (opcion) {
        case 1 -> EmpleadosPorArea(empresa);
        case 2 -> TotalEmpleadosPorArea(empresa);
        case 3 -> EmpleadoConMayorHijos(empresa);
        case 4 -> TotalEmpleadosPorDistrito(empresa);
        case 5 -> OrdenarEmpleadosPorEdad(empresa);
        case 6 -> BuscarEmpleadoPorDNI(empresa);
        case 7 -> ModificarDatosEmpleado(empresa);
        case 8 -> EliminarEmpleado(empresa);
        case 9 -> System.out.println("Saliendo del menu...");
        default -> System.out.println("Opcion invalida");
      }
    } while (opcion != 9);
  }

}
