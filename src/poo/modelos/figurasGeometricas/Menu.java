package poo.modelos.figurasGeometricas;

import java.util.Scanner;

public class Menu {

  public static void main(String[] args) {

    menu();
  }


  public static void menu() {
    int opcion;
    Scanner teclado = new Scanner(System.in);
    do {
      System.out.println("""
                        ___________________________________________________________
                        1. Circulo
                        2. Trinagulo
                        3. Rectangulo
                        4. Salir ❌
                        ___________________________________________________________
          """);

      System.out.println("Ingrese una opción:");
      opcion = teclado.nextInt();

      switch (opcion) {
        case 1 -> {
          System.out.println("Ingresa el radio");
          double radio = teclado.nextDouble();
          Circulo circulo = new Circulo(radio);
          circulo.imprimirDatos();
        }

        case 2 -> {
          System.out.println("Ingresa base");
          double base = teclado.nextDouble();
          System.out.println("Ingresa altura");
          double altura = teclado.nextDouble();

          Triangulo triangulo = new Triangulo(base, altura);
          triangulo.imprimirDatos();
        }

        case 3 -> {
          System.out.println("Ingresa base del rectangulo");
          double anchoRectangulo = teclado.nextDouble();
          System.out.println("Ingresa altura del rectangulo");
          double altoRectangulo = teclado.nextDouble();

          Rectangulo rectangulo = new Rectangulo(anchoRectangulo, altoRectangulo);
          rectangulo.imprimirDatos();
        }
        case 4 -> System.out.println("Gracias por utilizar nuestro programa");
      }
    } while (opcion != 4)
        ;

  }

}
