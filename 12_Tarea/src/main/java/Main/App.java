package Main;

import clases.*;
import listas.*;
import javax.swing.JOptionPane;

// author Jack Fernandez
public class App {

  public static void main(String[] args) {
    Vehiculo objE = new Vehiculo("Toyota", "Camry", 2020);
    bicicleta bicicleta = new bicicleta(2, 1, "Trek", "Mountain", 2019);
    Auto auto = new Auto("Japón", 4, "Honda", "Civic", 2021);
    Bus bus = new Bus(15, 5, "Mercedes", "Sprinter", 2018);

    // Prueba individual de objetos de la herencia
//    JOptionPane.showMessageDialog(null, "Vehiculo: \n" + objE.mostrar());
//    JOptionPane.showMessageDialog(null, "Vehiculo Planilla: \n" + bicicleta.mostrar());
//    JOptionPane.showMessageDialog(null, "Vehiculo Contratado: \n" + auto.mostrar());
    // Prueba de la herencia real
//    presentarObjeto(objE);
//    presentarObjeto(bicicleta);
//    presentarObjeto(auto);
//    presentarObjeto(bus);
    // Lista
    ListaVehiculos lista = new ListaVehiculos();

    lista.Agregar(objE);
    lista.Agregar(bicicleta);
    lista.Agregar(auto);
    lista.Agregar(bus);

    JOptionPane.showMessageDialog(null, lista.presentar());
  }

  //presentarObjeto(obj);
  static void presentarObjeto(Vehiculo v) {
    JOptionPane.showMessageDialog(null, "Vehiculo: \n" + v.mostrar());
  }
}