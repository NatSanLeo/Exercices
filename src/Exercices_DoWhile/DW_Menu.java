package Exercices_DoWhile;

import java.util.Scanner;

public class DW_Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (salir != true) {
            System.out.print("\n*** Menú Principal ***\n"
                    + "1. Comprar producto\n"
                    + "2. Realizar devolución\n"
                    + "3. Ver mis pedidos\n"
                    + "4. Exercices_If.Preguntas frecuentes\n"
                    + "5. Salir\n"
                    + "Elige una opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Elegiste Comprar producto");

                    break;
                case 2:
                    System.out.println("Elegiste realizar devolución");
                    break;

                case 3:
                    System.out.println("Ver mis pedidos");
                    break;

                case 4:
                    System.out.println("Exercices_If.Preguntas frecuentes");
                    break;

                case 5:
                    System.out.println("Saliendo del menú...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }
        sc.close();
    }
}