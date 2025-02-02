package Exercices_If;

import java.util.Scanner;

public class CompareLastname {
    public static void main(String[] args) {
        Scanner userData =new Scanner(System.in);

        String lastNameOne="";
        String lastNameTwo="";

        System.out.print("Ingresa el primer apellido: " + lastNameOne);
        lastNameOne=userData.nextLine();

        System.out.print("Ingresa el segundo apellido: " + lastNameTwo);
        lastNameTwo=userData.nextLine();

        if (lastNameOne.equals(lastNameTwo)){
            System.out.println("Los apellidos son igules.");

        }else
            System.out.println("Los apellidos son diferentes.");


    }
}
