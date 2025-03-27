package JavaU;

public class Exercices_While {

  public static void main(String[] args) {
    //firtsWhile();
    //secondWhile();
    //firtsDoWhile();
    //numerosInversosDoWhile();
    //numerosInversosWhile();
    numerosImparesDoWhile();

  }

  public static void firtsWhile() {
    int contador = 1;
    while (contador <= 4) {
      System.out.println(contador++);
    }
  }

  public static void secondWhile() {
    int limit = 1;
    while (limit <= 20) {
      if (limit % 2 == 0) {
        System.out.println("Numero par: " + limit);
      }
      limit++;
    }
  }

  public static void firtsDoWhile() {
    int contador = 1;
    do {
      System.out.println(contador++);
    } while (contador <= 3);

  }

  public static void numerosInversosDoWhile() {
    int contador = 10;
    do {
      System.out.print(contador-- + " ");
    } while (contador > 0);
  }

  public static void numerosInversosWhile() {
    int contador = 10;
    while (contador > 0) {
      System.out.print(contador-- + " ");
    }
  }

  public static void numerosImparesDoWhile() {
    int contador = 1;
    while (contador <= 20) {
      if (contador % 2 != 0) {
        System.out.print(contador + " ");
      }
      contador++;
    }
  }
}
