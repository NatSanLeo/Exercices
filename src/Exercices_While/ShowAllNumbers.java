package Exercices_While;

import java.util.Scanner;

public class ShowAllNumbers {
    public static void main(String[] args) {
        int numeroUsuario;
        int centinela = 0;
        Scanner userNumber = new Scanner(System.in);
        System.out.println("Ingrese el numero:");
        numeroUsuario = userNumber.nextInt();

        while (centinela < numeroUsuario) {
            System.out.print(centinela = centinela + 1);
        }
    }

}
