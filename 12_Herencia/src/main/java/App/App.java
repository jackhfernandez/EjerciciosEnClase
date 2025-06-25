package App;

import datos.*;
import listas.*;
import javax.swing.JOptionPane;

// author Jack Fernandez
public class App {

  public static void main(String[] args) {
    Empleado objE = new Empleado("55555555", "Juan Perez", 28);
    EmpleadoPlanilla objP = new EmpleadoPlanilla("Gerente", 5, "888888", "Ana LOpez", 40);
    EmpleadoContratado objC = new EmpleadoContratado(20, 30, "88888", "Pedro Ramirez", 30);
    EmpleadoTemporal objT = new EmpleadoTemporal(20, 30, "444444", "John Doe", 0);

    // Prueba individual de objetos de la herencia
//    JOptionPane.showMessageDialog(null, "Empleado: \n" + objE.mostrar());
//    JOptionPane.showMessageDialog(null, "Empleado Planilla: \n" + objP.mostrar());
//    JOptionPane.showMessageDialog(null, "Empleado Contratado: \n" + objC.mostrar());
    // Prueba de la herencia real
//    presentarObjeto(objE);
//    presentarObjeto(objP);
//    presentarObjeto(objC);
//    presentarObjeto(objT);
    // Lista
    ListaEmpleados lista = new ListaEmpleados();

    lista.Agregar(objE);
    lista.Agregar(objP);
    lista.Agregar(objC);
    lista.Agregar(objT);

    JOptionPane.showMessageDialog(null, lista.presentar());
  }

  //presentarObjeto(obj);
  static void presentarObjeto(Empleado obj) {
    JOptionPane.showMessageDialog(null, "Empleado: \n" + obj.mostrar());

  }
}
