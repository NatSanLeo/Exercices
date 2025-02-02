package Exercices_While;

import java.util.Scanner;

public class W_cantNumeros {

    public static void main(String[] args) {
        Scanner numeroUsuario = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Ingrese un número (0 para salir):");
            numero = numeroUsuario.nextInt();

            if (numero > 0 && numero < 10) {
                System.out.println("una cifra");
            }

        } while (numero != 0);

        System.out.println("Programa terminado");
    }
}