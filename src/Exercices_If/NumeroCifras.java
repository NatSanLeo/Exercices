package Exercices_If;

import java.util.Scanner;

public class NumeroCifras {
    //Se ingresa por teclado un número positivo de uno o dos dígitos (1..99)
    // mostrar un mensaje indicando si el número tiene uno o dos dígitos.
    public static void main(String[] args) {
        int oneNumber;
        Scanner number = new Scanner(System.in);
        System.out.println("Enter firts number: ");
        oneNumber = number.nextInt();

        if (oneNumber > 9) {
            System.out.println("El numero tiene dos digito: " + oneNumber);
        } else {
            System.out.println("El numero es de un digito: " + oneNumber);
        }

    }
}
