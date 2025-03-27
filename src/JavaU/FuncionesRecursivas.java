package JavaU;

public class FuncionesRecursivas {

  public static void main(String[] args) {
    imprimirValor(5);
  }

  public static void imprimirValor(int numero) {
    if (numero == 1) {
      System.out.println("numero: " + numero + " ");
    } else {
      imprimirValor(numero - 1);
      System.out.println("numero: " + numero);
    }
  }
}
