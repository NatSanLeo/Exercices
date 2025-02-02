package Exercices_If;

import java.util.Scanner;

public class Divisible {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int numero = sc.nextInt();
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.print("es divisible entre ambos");
        } else if (numero % 5 == 0) {
            System.out.print("es divisible entre 5");
        } else if (numero % 3 == 0) {
            System.out.print("es divisible entre 3");
        }

        if (numero % 3 != 0 && numero % 5 != 0) {
            System.out.print("no es divisible por ninguno");
        }

    }
}