package Other_Exercices;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        System.out.println("Ingrese la operacion deseada: \n1: Guardar\n2: Cargar. \n3: Salir.");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Seleccionaste la opción guardar");
                break;
            case 2:
                System.out.println("Seleccionaste la opción cargar");
                break;
            case 3:
                System.out.println("Seleccionaste la opción salir");
                break;
            default:
                System.out.println("Ingresa un opción valida");
        }
    }
}

