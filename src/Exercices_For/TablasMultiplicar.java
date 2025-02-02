package Exercices_For;

import java.util.Scanner;

public class TablasMultiplicar {
    public static void main(String[] args) {
        int number1;

        Scanner numbers = new Scanner(System.in);
        System.out.println("Ingrese el numero de la tabla de multiplicar que deseas ver: ");
        number1 = numbers.nextInt();

        System.out.println("La tabla de multimplicar que vas a ver es la del numero: " + number1);

        for (int m = 1; m <= 10; m++) {
            int result = number1 * m;
            System.out.println(number1 + "X" + m + "=" + result);
        }
    }
}
