package Exercices_If;

import java.util.Scanner;

public class ShowName {
    public static void main(String[] args) {

        Scanner UserData = new Scanner(System.in);

        String nombreOne = "";
        String nombreTwo = "";

        int ageOne;
        int ageTwo;

        System.out.println("Ingrese el primer nombre: " + nombreOne);
        nombreOne = UserData.nextLine();

        System.out.println("Ingresa tu edad: ");
        ageOne = UserData.nextInt();
        UserData.nextLine();


        System.out.println("Ingrese el segundo nombre: " + nombreTwo);
        nombreTwo = UserData.nextLine();

        System.out.println("Ingresa tu edad: ");
        ageTwo = UserData.nextInt();

        if (ageOne > ageTwo) {
            System.out.println("La persona con mayor edad es: " + nombreOne);
        } else if (ageTwo > ageOne) {

            System.out.println("La persona con mayor edad es: " + nombreTwo);

        }


    }
}
