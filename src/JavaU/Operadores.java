package JavaU;

import java.util.Scanner;

public class Operadores {

  public static void main(String[] args) {
    //operadoresAritmeticos();
    //operadoresUnarios();
    //operadoresAsignacion();
    //operadoresComparacion();
    //operadoresLogicos();
    operadoreAndEx();
  }

  public static void operadoresAritmeticos() {
    int a = 40, b = 7, result;
    result = a + b;
    System.out.println("result sum: " + result);
    result = a - b;
    System.out.println("result resta: " + result);
    result = a * b;
    System.out.println("result multiply: " + result);
    result = a / b;
    System.out.println("result division: " + result);
    result = a % b;
    System.out.println("result modulo: " + result);
  }

  public static void operadoresUnarios() {
    int a = 40, b = 7, result;
    boolean c = true;
    System.out.println(+a);

    System.out.println(-a);

    //preincremento
    a = 23;
    System.out.println(++a);
    System.out.println(a);

    //postIncremento
    System.out.println("PostIncrement: " + (a++));
    System.out.println(a);

    //preDecremento
    System.out.println("preDecremento: " + --b);
    System.out.println("preDecremento: " + b);
    //postDecremento
    System.out.println("postDecremento:" + b--);
    System.out.println("postDecremento:" + b);
  }

  public static void operadoresAsignacion() {
    String name = "Nat";
    //+= compuesto de suma
    int numeroInicial = 12;
    System.out.println("Nuevo numero suma: " + (numeroInicial += 9));
    int numeroSuma = 34;
    System.out.println("Nuevo numero resta: " + (numeroSuma -= 1));
    int numeroMultiplicacion = 2;
    System.out.println("Nuevo numero resta: " + (numeroMultiplicacion *= 2));
    int numeroDivicion = 22323;
    System.out.println("Nuevo numero division: " + (numeroDivicion /= 2));

    String nombre = "Sam", apellido = "Santos", mama = "Nata";
    System.out.printf("Mi nombres es %s %s y mi mama es: %s", nombre, apellido, mama);
  }

  public static void operadoresComparacion() {
    int a = 90, b = 89;
    System.out.printf("%n A %d es igual a b %d? " + (a == b), a, b);
    System.out.printf("%n A %d es distinto de b %d? " + (a != b), a, b);
    System.out.printf("%n A %d es mayor que b %d? " + (a > b), a, b);
    System.out.printf("%n A %d es mayor o igual que b %d? " + (a >= b), a, b);
    System.out.printf("%n A %d es menor que b %d? " + (a < b), a, b);
    System.out.printf("%n A %d es menor o igual que b %d? " + (a <= b), a, b);

  }

  public static void operadoresLogicos() {
    boolean a = true, b = false, result;
    System.out.println("A y B son VERDADEROS? " + (result = a && b));
    System.out.println("A o B son VERDADEROS? " + (result = a || b));
    //not ! invierte el valor de la variable.

    System.out.println("Valor inicial A: " + a + "Valor con operador NOT A: " + (!a));

  }

  public static void operadoreAndEx() {
    final int MINIMO = 0;
    final int MAXIMO = 5;
    System.out.print("Ingresa un numero entre 0 y 5: ");
    Scanner userData = new Scanner(System.in);
    int result = userData.nextInt();
    boolean estaDentroRango = result >= MINIMO && result <= MAXIMO;
    System.out.println(estaDentroRango);


  }


}
