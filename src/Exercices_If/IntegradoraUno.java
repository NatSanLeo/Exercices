package Exercices_If;

import java.util.Scanner;

public class IntegradoraUno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Ingresa un número para saber si es par o impar:");
        num = teclado.nextInt();
        if (num == 0) {
            System.out.println("El número ingresado es neutro aditivo");
        } else if (num % 2 == 0) {
            System.out.println("El número ingresado es par");
        } else {
            System.out.println("El número ingresado es impar");
        }
    }

}

