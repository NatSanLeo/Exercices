package Exercices_DoWhile;

import java.util.Scanner;

public class DW_AverageAdd {
    public static void main(String[] args) {

        double num;
        int cant = 0;
        double suma = 0;

        Scanner UserNumber = new Scanner(System.in);

        do {
            System.out.println("Ingresa el número");
            num = UserNumber.nextDouble();

            if (num != 0) {
                suma = suma + num;
                cant = cant + 1;
            }

        } while (num != 0);


        if (cant != 0) {
            double average = suma / cant;
            System.out.println("La suma de los valores es: " + suma);
            System.out.println("La cantidad es: " + cant);

            System.out.println("El promedio de los valores es: " + average);
        } else
            System.out.println("No se ingresaron valores");

    }

}
