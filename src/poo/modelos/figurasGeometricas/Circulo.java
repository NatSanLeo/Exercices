package poo.modelos.figurasGeometricas;

public class Circulo {
  private double radio;


  public Circulo(double radio) {
    this.radio = radio;
  }

  public Circulo() {

  }

  public double getRadio() {
    return radio;
  }

  public void setRadio(double radio) {
    this.radio = radio;
  }
  public double area(){
    return Math.PI*(getRadio()*getRadio());
  }
  public double perimetro(){
    return (2* Math.PI*getRadio());
  }
  public void imprimirDatos(){
    System.out.println("El radio del circulo es: " +getRadio());
  }
}
