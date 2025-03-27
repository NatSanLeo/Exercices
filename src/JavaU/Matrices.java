package JavaU;

import java.util.Scanner;

public class Matrices {

  public static void main(String[] args) {
    sumaDiagonalMatriz();
  }

  public static void crearMatriz() {
    final int FILAS = 2;
    final int COLUMNAS = 3;

    int[][] matriz = new int[FILAS][COLUMNAS];
    matriz[0][0] = 100;
    matriz[0][1] = 200;
    matriz[0][2] = 300;
    matriz[1][0] = 400;
    matriz[1][1] = 500;
    matriz[1][2] = 600;

    for (int filas = 0; filas < FILAS; filas++) {
      for (int columnas = 0; columnas < COLUMNAS; columnas++) {
        System.out.println("Valor [" + filas + "]" + "[" + columnas + "]: " + matriz[filas][columnas]);
      }
    }
  }

  public static void fixCrearMatriz() {
    int[][] matriz = new int[][]{
        {100, 200, 300},
        {400, 500, 600}};

    for (int filas = 0; filas < matriz.length; filas++) {
      for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
        System.out.println("Valor [" + filas + "]" + "[" + columnas + "]: " + matriz[filas][columnas]);
      }
    }
  }

  public static void llenandoMatriz() {
    int filas, columnas;
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingresa las filas de la matriz:");
    filas = teclado.nextInt();

    System.out.print("Ingresa las columnas de la matriz:");
    columnas = teclado.nextInt();

    int[][] matriz = new int[filas][columnas];
    for (int fil = 0; fil < filas; fil++) {
      for (int colum = 0; colum < columnas; colum++) {
        System.out.print("Valor [" + fil + "][" + colum + "]=");
        matriz[fil][colum] = teclado.nextInt();
      }
    }
    for (int fil = 0; fil < filas; fil++) {
      for (int colum = 0; colum < columnas; colum++) {
        System.out.println("Valor [" + filas + "][" + colum + "]" + matriz[fil][colum]);
      }
    }
  }

  public static void sumaDiagonalMatriz() {
    int filasMatriz;
    int columnasMatriz;
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingresa las filas de la matriz:");
    filasMatriz = teclado.nextInt();
    System.out.print("Ingresa las columnas de la matriz:");
    columnasMatriz = teclado.nextInt();
    int[][] matrizSumar = new int[filasMatriz][columnasMatriz];
    for (int filas = 0; filas < filasMatriz; filas++) {
      for (int columnas = 0; columnas < columnasMatriz; columnas++) {
        System.out.print("Valor [" + filas + "][" + columnas + "]=");
        matrizSumar[filas][columnas] = teclado.nextInt();
      }
    }
    int sumaDiagonal = 0;
    for (int filas = 0; filas < filasMatriz; filas++) {
      for (int columnas = 0; columnas < columnasMatriz; columnas++) {
        if (filas == columnas) {
          sumaDiagonal += matrizSumar[filas][columnas];
        }
      }
    }
    System.out.println("La suma de la diagonal es: " + sumaDiagonal);
  }
}
