package Other_Exercices;

import java.util.Scanner;

public class RecursividadFibonacci {

    public static void main(String[] args) {

    }
    public static void fibonacci() {
        Scanner teclado = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 1;
        int fibonacci = 0;
        int MAX;
        int posicionBuscar;
        System.out.print("Ingresa la logitud del número fibonacci que quieres ver: ");
        MAX = teclado.nextInt();
        int[] fibonacciArreglo = new int[MAX];
        System.out.print(firstNumber + " ");
        System.out.print(secondNumber + " ");

        for (int i = 2; i < MAX; i++) {
            fibonacci = firstNumber + secondNumber;
            System.out.print(fibonacci + " ");
            firstNumber = secondNumber;
            secondNumber = fibonacci;
            fibonacciArreglo[i] = fibonacci;

        }
        System.out.println(" ");
        System.out.print("Ingresa una posicion para mostrarte el numero fibonacci: ");
        posicionBuscar = teclado.nextInt();
        System.out.println(
                "El numero fibonacci de la posición: " + posicionBuscar + " es:" + fibonacciArreglo[posicionBuscar - 1]);
    }
}
