/**
 * Ejemplo de vector y sus  operaciones
 */
package company._vectores;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class App {

  // Variables a nivel de toda la clase (class)
  static Scanner scanner = new Scanner(System.in);

  // constantes
  static final int MAX_NUM = 10;

  public static void main(String[] args) {

    // Declaracion del vector
    int numeros[] = new int[MAX_NUM];

    llenarDatos(numeros);
    presentarDatos(numeros);
  }

  // Agregar elementos al vector
  static void llenarDatos(int numeros[]) {
    int k = 10;
    for (int i = 0; i < MAX_NUM; i++) { // i = i + 1
      //System.out.print("Ingrese numero: ");
      //numeros[i] = scanner.nextInt();
      
      //numeros[i] = k;
      //k += 10; // k = K + 10
      
      numeros[i] = (int) (Math.random()*101);
    }
  }

  // Mostrar datos del vector
  static void presentarDatos(int numeros[]) {
    System.out.println("Mostrando vector");
    for (int num : numeros) {
      System.out.print(num + " ");
    }
  }
  
  // Mostrar numero mayor y numero menor
  static void encontrarMayorMenor(int numeros[]){
  }
  
  // Modificar valor
  static void modificarValor(){
    
  }
  
  // Intercambiar valores
  static void intercambiarValores(){
    
  }
}
