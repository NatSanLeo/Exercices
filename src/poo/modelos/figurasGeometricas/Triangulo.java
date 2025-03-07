package poo.modelos.figurasGeometricas;

public class Triangulo {
  private double base;
  private  double altura;

  public Triangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
  }
  public Triangulo() {

  }

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double area(){
    return (getBase()*getAltura())/2;
  }

  public void imprimirDatos(){
    System.out.println("El area del triangulo es: "+ area());
  }
}
