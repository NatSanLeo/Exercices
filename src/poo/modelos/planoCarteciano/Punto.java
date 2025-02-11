package poo.modelos.planoCarteciano;

public class Punto {
  private double x;
  private double y;

  public Punto(double x, double y) {
    this.x = x;
    this.y = y;
  }
  public Punto() {
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }
  public double distanciaDesdeOrigen(){
    return Math.sqrt(x * x + y * y);
  }
  public static double calcularDistancia(Punto p1, Punto p2) {
    double deltaX = p2.getX() - p1.getX();
    double deltaY = p2.getY() - p1.getY();
    return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
  }
  public static boolean estanAlineados(Punto p1, Punto p2, Punto p3){
    // Verificamos si la diferencia en X es 0 para evitar división por cero
    if ((p2.getX() - p1.getX() == 0) || (p3.getX() - p2.getX() == 0)) {
      // Si los tres puntos tienen la misma X, están en la misma línea vertical
      return (p1.getX() == p2.getX() && p2.getX() == p3.getX());
    }

    // Calculamos las pendientes entre los puntos
    double pendiente1 = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
    double pendiente2 = (p3.getY() - p2.getY()) / (p3.getX() - p2.getX());

    // Si las pendientes son iguales, los puntos están alineados
    return pendiente1 == pendiente2;
  }


}
