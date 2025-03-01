package Exercices_Arreglos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayListMeritos {

    public static Scanner teclado = new Scanner(System.in);
    public static ArrayList<Integer> notas = new ArrayList<>();

    public static void main(String[] args) {
        agregarNotas();
        mostrarNotas();
        mostrarNotasordenadas();
    }

    public static void agregarNotas() {
        while (true) {

            System.out.print("Ingrese la nota entre 1 y 10: ");
            Integer nota = teclado.nextInt();
            if (nota <= 10 && nota >= 1) {
                notas.add(nota);
            } else {
                System.out.println("La nota no esta en el rango adecuado");
            }

            System.out.print("¿Desea agregar mas notas? (si/no): ");
            String respuesta = teclado.next().toLowerCase().trim();
            if (respuesta.equals("no")) {
                break;
            }
        }
    }

    public static void mostrarNotas() {
        System.out.println("Lista de ciudades ingresadas: ");
        for (Integer nota : notas) {
            System.out.println("- " + nota);

        }
    }
    public static void mostrarNotasordenadas(){
        Collections.sort(notas);
        System.out.println("notas ordenadas ascendente "+"- " + notas);
        Collections.reverse(notas);
        System.out.println("notas ordenadas descendente "+"- " + notas);
    }
}