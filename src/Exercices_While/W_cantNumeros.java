package Exercices_While;

import java.util.Scanner;

public class W_cantNumeros {

    public static void main(String[] args) {
        Scanner  numeroUsuario = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero");
        numero=numeroUsuario.nextInt();

        while (numero>0 && numero <9){
            System.out.println("una cifra");
        }
    }
}
