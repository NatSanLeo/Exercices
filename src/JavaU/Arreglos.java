package JavaU;

import java.util.Scanner;

public class Arreglos {

  public static void main(String[] args) {
    calificaciones();

  }

  public static void arregloPrimerEjercicio() {
    int[] enteros = new int[5];
    enteros[0] = 1;
    enteros[1] = 2;
    enteros[2] = 3;
    enteros[3] = 4;
    enteros[4] = 5;

    System.out.println(
        "Primer entero: " + enteros[0] + " Segundo entero: " + enteros[1] + " Tercer entero: " + enteros[2]);
  }

  public static void recorrerArreglo() {
    int[] enteros = {100, 500, 300};
    for (int i = 0; i < enteros.length; i++) {
      System.out.println("Valor del indice: " + i + " es " + enteros[i]);
    }
  }

  public static void llenarArreglo() {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Proporciona el largo del arreglo: ");
    int largoArreglo = teclado.nextInt();
    int[] enteros = new int[largoArreglo];

    for (int i = 0; i < enteros.length; i++) {
      System.out.println("Ingresa el valor para indice: " + "[" + i + "]");
      enteros[i] = teclado.nextInt();

    }
    for (int i = 0; i < enteros.length; i++) {
      System.out.println("Valor del indice: " + i + " es " + enteros[i]);
    }
  }

  public static void calificaciones() {
    Scanner teclado = new Scanner(System.in);
    System.out.print("¿Cuantas calificaciones quieres ingresar?");
    int tamagnoArreglo = teclado.nextInt();
    int[] calificaciones = new int[tamagnoArreglo];
    int suma = 0;

    for (int i = 0; i < calificaciones.length; i++) {
      System.out.print("Ingresa la calificación para el indice" + "[" + i + "]");
      calificaciones[i] = teclado.nextInt();
    }
    for (int i = 0; i < calificaciones.length; i++) {
      System.out.println("Valor del indice: " + i + " es " + calificaciones[i]);
      suma += calificaciones[i];
    }

    System.out.println("Promedio " + suma / calificaciones.length);
  }
}

// el for lee el arreglo no lo recorre. Asignar un valor directo a un espacio en el arrgelo

