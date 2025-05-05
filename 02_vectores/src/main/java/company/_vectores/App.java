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
    encontrarMayorMenor(numeros);
    modificarValor(numeros);
    intercambiarValores(numeros);
  }

  // Agregar elementos al vector
  static void llenarDatos(int numeros[]) {
    int k = 10;
    for (int i = 0; i < MAX_NUM; i++) { // i = i + 1
      //System.out.print("Ingrese numero: ");
      //numeros[i] = scanner.nextInt();

      //numeros[i] = k;
      //k += 10; // k = K + 10
      numeros[i] = (int) (Math.random() * 101);
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
  static void encontrarMayorMenor(int numeros[]) {
    System.out.println("\n\nMostrando numero mayor - menor");
    int mayor = numeros[0]; // numeros[] = {10,30,5,4,2,6,..}
    int menor = numeros[0];

    for (int i = 0; i < MAX_NUM; i++) {
      if (mayor < numeros[i]) {
        mayor = numeros[i];
      }
      if (menor > numeros[i]) {
        menor = numeros[i];
      }
    }
    System.out.println("Mayor: " + mayor);
    System.out.println("Menor: " + menor);
  }

  // Modificar valor
  static void modificarValor(int numeros[]) {
    System.out.println("\nModificar valor");
    int pos, valor;
    
    System.out.print("Indique la posicion: ");
    pos = scanner.nextInt();
    
    System.out.print("Indique el valor: ");
    valor = scanner.nextInt();
    
    numeros[pos] = valor;
    
    presentarDatos(numeros);
    
  }

  // Intercambiar valores
  static void intercambiarValores(int numeros[]) {
    System.out.println("\n\nIntercambiar valores ");
    
    System.out.println("Ingrese la primera posicion: ");
    int pos1 = scanner.nextInt();
    
    System.out.println("Ingrese la segunda posicion: ");
    int pos2 = scanner.nextInt();
    
    int aux = numeros[pos1];
    numeros[pos1] = numeros[pos2];
    numeros[pos2] = aux;
    
    presentarDatos(numeros);
  }
}
