package Exercices_While;

import java.util.Scanner;
/*
Desarrollar un programa que permita la carga de 10 valores por teclado y
nos muestre posteriormente la suma de los valores ingresados y su promedio.

*/


public class SumAndAverage {
    public static void main(String[] args) {
        int control = 1;
        int userNumbers = 0;


        Scanner number = new Scanner(System.in);

        while (control <= 10) {
            System.out.println("Ingrese el número:" + control);
            userNumbers = number.nextInt() + userNumbers;
            control++;


        }
        double average;
        average = (userNumbers) / 10;
        System.out.println("La suma de los numeros es: " + userNumbers);
        System.out.println("El promedio es: " + average);


    }
}
