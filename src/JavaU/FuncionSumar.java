package JavaU;

import java.util.Scanner;

public class FuncionSumar {


  public static void main(String[] args) {
    implementarFuncionEsPar();
  }

  static int funcionSumar(int a, int b) {
    int resultado = a + b;
    return resultado;
  }

  public static void implementarFuncionSumar() {
    int valorUno = 3;
    int valorDos = 8;
    int resultadoFuncion = funcionSumar(valorUno, valorDos);
    System.out.println("resultadoFuncionSuma: " + resultadoFuncion);
    resultadoFuncion = funcionSumar(10, 20);
    System.out.println("resultadoFuncionSuma: " + resultadoFuncion);
  }

  public static boolean funcionEsPar(int numero) {
    if (numero % 2 == 0) {
      return true;

    } else {
      return false;
    }
  }

  public static boolean funcionEsParSimplificado(int numero) {
    return (numero % 2 == 0) ? true : false;
  }

  public static void implementarFuncionEsPar() {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese un número: ");
    int numero = teclado.nextInt();
    boolean resultadoFuncion = funcionEsParSimplificado(numero);
    System.out.println("El número ingresado es par? " + resultadoFuncion);
  }
}
