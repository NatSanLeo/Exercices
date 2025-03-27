package JavaU.temasAvanzados.exepciones;

public class PruebaAritmetica {

  public static void main(String[] args) {
    try {
      double resultado = Aritmetica.division(12, 1);
      System.out.println("Resultado: " + resultado);
    } catch (Exception e) {
      System.out.println("Ocurrio un error" + e);
    } finally {
      System.out.println("Se reviso la división entre cero");
    }
  }

}
