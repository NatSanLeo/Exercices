package Exercices_If;

import java.util.Scanner;

public class MultiplesOfNumbers {
    public static void main(String[] args) {
        Scanner numeroIngresaUsuario = new Scanner(System.in);
        int multiposTres = 0;
        int multiplosCinco = 0;
        int cantidadNumeros = 10;
        int numeroUsuario;

        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.println("Ingrese los números:");
            numeroUsuario = numeroIngresaUsuario.nextInt();
            if (numeroUsuario % 3 == 0) {
                multiposTres = multiposTres + 1;
            }
            if (numeroUsuario % 5 == 0) {
                multiplosCinco = multiplosCinco + 1;
            }


        }
        System.out.println("Numeros multiplos de 5: " + multiplosCinco);
        System.out.println("Numeros multiplos de 3: " + multiposTres);

    }
}
