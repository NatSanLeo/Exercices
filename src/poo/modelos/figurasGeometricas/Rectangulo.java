package poo.modelos.figurasGeometricas;

public class Rectangulo {
  private double ancho;
  private double alto;

  public Rectangulo(double ancho, double alto) {
    this.ancho = ancho;
    this.alto = alto;
  }

  public double getAncho() {
    return ancho;
  }

  public void setAncho(double ancho) {
    this.ancho = ancho;
  }

  public double getAlto() {
    return alto;
  }

  public void setAlto(double alto) {
    this.alto = alto;
  }

  public Rectangulo() {
  }

  public double area(){
    return getAlto()*getAncho();
  }
  public double perimetro(){
    return 2*(getAlto())+(getAncho());
  }


  public void imprimirDatos(){
    System.out.println("El area es: "+area());
    System.out.println("El perimetro es: "+perimetro());
  }

}
