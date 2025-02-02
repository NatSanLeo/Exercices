package Exercices_DoWhile;

import java.util.Scanner;

public class DW_Aleatorio {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int numAleatorio = (int)(Math.random() * 20) + 1;

        System.out.println(numAleatorio);


        int opcionNumero = 0;

        do {
            System.out.println("Adivina el número");
            opcionNumero = input.nextInt();

            if (opcionNumero > numAleatorio){
                System.out.println("El número ingresado es mayor al generado.");
            }
            if (opcionNumero < numAleatorio) {
                System.out.println("El número ingreso es menor al generado.");
            } if (opcionNumero==numAleatorio){
                System.out.println("Adivinaste el numero");
            }

        } while ( opcionNumero != numAleatorio);

        input.close();

    }


}