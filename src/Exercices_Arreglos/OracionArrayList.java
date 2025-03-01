package Exercices_Arreglos;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class OracionArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oracion = "";

        while (true) {
            System.out.println("\nMenú de opciones:");
            if (oracion.isEmpty()) {
                System.out.println("1. Crear oración");
            } else {
                System.out.println("1. Borrar oración");
            }
            System.out.println("2. Cantidad de caracteres de la oración");
            System.out.println("3. Cantidad de palabras de la oración");
            System.out.println("4. Mostrar palabras ordenadas alfabéticamente");
            System.out.println("5. Ingresar un número y devolver la palabra correspondiente");
            System.out.println("6. Buscar palabra dentro de la oración");
            System.out.println("7. Modificar palabra dentro de la oración");
            System.out.println("8. Agregar contenido a la oración");
            System.out.println("9. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            if (opcion == 1) {
                if (oracion.isEmpty()) {
                    System.out.print("Ingrese una nueva oración: ");
                    oracion = scanner.nextLine();
                } else {
                    oracion = "";
                    System.out.println("Oración borrada.");
                }

            } else if (opcion == 2) {
                System.out.println("Cantidad de caracteres: " + oracion.length());

            } else if (opcion == 3) {
                String[] palabras = oracion.split(" ");
                System.out.println("Cantidad de palabras: " + palabras.length);

            } else if (opcion == 4) {
                String[] palabras = oracion.split(" ");
                ArrayList<String> palabrasList = new ArrayList<>();
                for (String palabra : palabras) {
                    palabrasList.add(palabra);
                }
                Collections.sort(palabrasList);
                System.out.println("Palabras ordenadas alfabéticamente:");
                for (String palabra : palabrasList) {
                    System.out.print(palabra + " ");
                }
                System.out.println();

            } else if (opcion == 5) {
                String[] palabras = oracion.split(" ");
                System.out.print("Ingrese un número: ");
                int numero = scanner.nextInt();
                scanner.nextLine();
                if (numero >= 1 && numero <= palabras.length) {
                    System.out.println("La palabra en la posición " + numero + " es: " + palabras[numero - 1]);
                } else {
                    System.out.println("Número inválido. Intente nuevamente.");
                }

            } else if (opcion == 6) {
                System.out.print("Ingrese la palabra a buscar: ");
                String palabraBuscada = scanner.nextLine();
                String[] palabras = oracion.split(" ");
                boolean encontrada = false;
                for (int i = 0; i < palabras.length; i++) {
                    if (palabras[i].equals(palabraBuscada)) {
                        System.out.println("Palabra encontrada en la posición " + (i + 1) + ".");
                        encontrada = true;
                        break;
                    }
                }
                if (!encontrada) {
                    System.out.println("Palabra no encontrada.");
                }

            } else if (opcion == 7) {
                System.out.print("Ingrese la palabra que desea modificar: ");
                String palabraAModificar = scanner.nextLine();
                String[] palabras = oracion.split(" ");
                boolean encontrada = false;
                for (int i = 0; i < palabras.length; i++) {
                    if (palabras[i].equals(palabraAModificar)) {
                        System.out.print("Ingrese la nueva palabra: ");
                        String nuevaPalabra = scanner.nextLine();
                        palabras[i] = nuevaPalabra;
                        encontrada = true;
                        break;
                    }
                }
                if (encontrada) {
                    oracion = String.join(" ", palabras);
                    System.out.println("Oración modificada: " + oracion);
                } else {
                    System.out.println("Palabra no encontrada. Intente nuevamente.");
                }

            } else if (opcion == 8) {
                System.out.print("Ingrese el contenido a agregar: ");
                String contenido = scanner.nextLine();
                oracion = oracion + " " + contenido;
                oracion = oracion.trim();
                System.out.println("Nueva oración: " + oracion);

            } else if (opcion == 9) {
                System.out.println("Saliendo del programa.");
                break;

            } else {
                System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
        scanner.close();
    }
}