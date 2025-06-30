package clases;

public class Bus extends Vehiculo{

  private int toneladas;
  private double motor;

  public Bus() {
  }

  public Bus(int toneladas, double motor, String marca, String modelo, int fabricacion) {
    super(marca, modelo, fabricacion);
    this.toneladas = toneladas;
    this.motor = motor;
  }

  public int getToneladas() {
    return toneladas;
  }

  public double getMotor() {
    return motor;
  }
  
  public String mostrar(){
    return super.mostrar() + " - " + this.toneladas + " - " + this.motor;
  }
}