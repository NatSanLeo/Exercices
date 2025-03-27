package JavaU.temasAvanzados;

public class ArgumentosVariables {

  public static void main(String[] args) {
    imprimirNumeros(1, 2, 3, 2, 2, 2, 2, 2, 2);//var args
    variosParametros("Nata", 2, 3, 4, 5);
  }

  static void variosParametros(String nombre, int... numeros) {
    System.out.println("Nombre: " + nombre);
    imprimirNumeros(numeros);
  }

  private static void imprimirNumeros(int... numeros) {
    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i] + " ");
    }
  }

}
