package Exercices_DoWhile;

import java.util.Scanner;

public class DW_weight {
    public static void main(String[] args) {

        int cantidadOne = 0;
        int cantidadTwo = 0;
        int cantidadThree = 0;

        double rangeOne = 10.2;
        double rangeTwo = 9.2;
        double rangeThree = 0;

        double weight = 0;
        Scanner weightUser = new Scanner(System.in);

        do {
            System.out.println("Ingresa el peso de las pieza: ");
            weight = weightUser.nextDouble();

            if (weight > rangeOne) {
                cantidadOne++;

            }
            else if (weight >= rangeTwo) {
                cantidadTwo++;
            }
            else if (weight > 0) {
                cantidadThree++;
            }


        } while (weight != 0);
        int sumaCants = cantidadOne + cantidadTwo + cantidadThree;

        System.out.println("Total de piezas ingresadad: " + sumaCants);
        System.out.println("Cantidad de piezas por tipo Rango 1: " + cantidadOne);
        System.out.println("Cantidad de piezas por tipo Rango 2: " + cantidadTwo);
        System.out.println("Cantidad de piezas por tipo Rango 3: " + cantidadThree);



    }
}
