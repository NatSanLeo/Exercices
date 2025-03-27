package JavaU.temasAvanzados;

public interface Traductor {

  //public y abstract
  void traducir();

  //Metodos con implementación por default
  default void iniciarTraductor() {
    System.out.println("Iniciando traductor...");
  }
}

class Ingles implements Traductor {

  @Override
  public void traducir() {
    System.out.println("Traduzco a Ingles");
  }
}

class Frances implements Traductor {

  @Override
  public void traducir() {
    System.out.println("Traduzco a Frances");
  }

  @Override
  public void iniciarTraductor() {
    System.out.println("Iniciando traductor en frances");
  }
}

class PruebaTraductor {

  public static void main(String[] args) {
    Traductor ingles = new Ingles();
    ingles.traducir();
    ingles.iniciarTraductor();

    Traductor frances = new Frances();
    frances.traducir();
    frances.iniciarTraductor();
  }
}
