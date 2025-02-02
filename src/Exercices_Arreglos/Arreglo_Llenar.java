package Exercices_Arreglos;

import java.util.Scanner;

public class Arreglo_Llenar {
    public class Llenar_Arreglo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Crear un arreglo de 5 enteros
            int[] numeros = new int[5];

            System.out.println("Ingresa 5 números:");

            // Usar un bucle para llenar el arreglo
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt(); // Guardar el número ingresado en la posición i
            }

            // Mostrar el contenido del arreglo
            System.out.println("\nLos números ingresados son:");
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Número en posición " + i + ": " + numeros[i]);
            }
        }
    }
}