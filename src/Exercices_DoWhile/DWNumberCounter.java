package Exercices_DoWhile;

import java.util.Scanner;

public class DWNumberCounter {
    public static void main(String[] args) {
        Scanner numeroUsuaro = new Scanner(System.in);

        int number = 0;


        int contador = number;

        do {
            System.out.println("Ingresa un numero entre 0 y 999");
            number = numeroUsuaro.nextInt();

            if (number >= 100) {
                System.out.println("Tiene 3 digitos");
            }
            if (number <= 99 & number > 9) {
                System.out.println("Tiene 2 digitos");
            }
            if (number <= 9) {
                System.out.println("Tiene 1 digito");
            }

        }
        while (number != 0);

    }
}
