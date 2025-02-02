package Exercices_For;

import java.util.Scanner;

public class TrianguloDeAste {
    public static void main(String[] args) {
        int numero;
        Scanner numeroUsuario = new Scanner(System.in);
        System.out.println("Enter number");
        numero = numeroUsuario.nextInt();
//v
        for (int s = 1; s <= numero; s++) {
//n ->
            for (int n=1; n<=s;n++){
                System.out.print(n);
            }
            System.out.println();
        }

    }
}
