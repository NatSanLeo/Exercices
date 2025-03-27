package Other_Exercices;

import java.util.Scanner;

public class DiasSemanaBetter {

  public static void main(String[] args) {
    Scanner userData = new Scanner(System.in);
    System.out.print("Ingrese un número para saber que día es:");
    int opcion = userData.nextInt();
    switch (opcion) {
      case 1 -> System.out.println("Lunes");
      case 2 -> System.out.println("Martes");
      case 3 -> System.out.println("Miercoles");
      case 4 -> System.out.println("Jueves");
      case 5 -> System.out.println("Viernes");
      case 6 -> System.out.println("Sabado");
      default -> System.out.println("opcion erronea");


    }

  }

}
