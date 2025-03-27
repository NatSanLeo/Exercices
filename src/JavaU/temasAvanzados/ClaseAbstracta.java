package JavaU.temasAvanzados;

public class ClaseAbstracta {

  public static void main(String[] args) {
    Rectangulo rectangulo = new Rectangulo();
    rectangulo.dibujar();
    Circulo circulo = new Circulo();
    circulo.dibujar();
  }
}

//clase abstracta
abstract class FiguraGeometrica {

  public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica {

  public void dibujar() {
    System.out.println("Se dibuja un Rectangulo");

  }

}

class Circulo extends FiguraGeometrica {

  @Override
  public void dibujar() {
    System.out.println("Se dibuja un Circulo");
  }
}