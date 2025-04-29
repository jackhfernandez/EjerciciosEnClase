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
        paradigmaSecuencial();
        paradigmaEstructurado();
    }
    
    // Ejemplo del paradigma secuencial
    public static void paradigmaSecuencial() {
        Scanner scanner = new Scanner(System.in);
        // Tipo de datos y declaracion de variables
        int n1, n2;
        double promedio;
        
        // Entrada de datos
        System.out.print("Ingrese nota 1: ");
        n1 = scanner.nextInt();
        
        System.out.print("Ingrese nota 2: ");
        n2 = scanner.nextInt();
        
        // Proceso
        promedio = (double)(n1 + n2) / 2;
        
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
}