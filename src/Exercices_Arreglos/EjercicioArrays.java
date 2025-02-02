package Exercices_Arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArrays {
    public static void main(String[] args) {
        rellenarArreglo();
    }

    public static void ordenarArreglos() {
        int[] numeros = {1, 56, 24, 11, 89, 34, 23, 44, 76, 98};
        System.out.println("Arreglo inicial: " + Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.println("Arreglo ordenado ascendente: " + Arrays.toString(numeros));
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + ", ");
        }
    }

    public static void buscarArreglo() {
        Scanner sc = new Scanner(System.in);
        int[] BinarySearch = {5, 10, 15, 20, 25};
        System.out.println("Por favor ingrese el valor que desea buscar");
        int valor = sc.nextInt();
        int index = Arrays.binarySearch(BinarySearch, valor);
        if (index >= 0) {
            System.out.println("El indice del valor buscado es: " + index);
        } else {
            System.out.println("El valor no se encuentra en el Arreglo");
        }
        sc.close();
    }

    public static void compararArreglos() {
        int[] BinarySearch1 = {5, 10, 15, 20, 29};
        int[] BinarySearch2 = {5, 10, 15, 20, 25};
        boolean isEqual = Arrays.equals(BinarySearch1, BinarySearch2);
        if (isEqual == true) {
            System.out.println("Los arreglos son Iguales");
        } else {
            System.out.println("Los arreglos son Diferentes");
        }
    }

    public static void copiarArreglo() {
        int[] arreglo = {1, 2, 3, 4, 5};
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(i + " " + arreglo[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el índice inicial");
        int inicial = sc.nextInt();
        System.out.println("Ingrese el índice final");
        int fin = sc.nextInt();
        if (inicial < fin && fin <= arreglo.length) {
            int[] parteDeUnaCopia = Arrays.copyOfRange(arreglo, inicial, fin + 1);
            System.out.print(Arrays.toString(parteDeUnaCopia));
        } else {
            System.out.println("Error. El índice final debe ser mayor que el inicial y menor o igual al tamaño del arreglo.");
        }
    }

    public static void rellenarArreglo() {
        int valorRellenar;
        int valorRandom = (int) (Math.random() * 20) + 1;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamanoArregloUsuario = teclado.nextInt();
        int[] arregloUsuario = new int[tamanoArregloUsuario];
        System.out.print("Ingre el numero para llenarlo: ");
        valorRellenar = teclado.nextInt();
        Arrays.fill(arregloUsuario, valorRandom);
        System.out.println(Arrays.toString(arregloUsuario));
        Arrays.fill(arregloUsuario, valorRellenar);
        System.out.println(Arrays.toString(arregloUsuario));
    }
}
