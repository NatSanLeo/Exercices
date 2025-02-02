package Exercices_If;

import java.util.Scanner;

public class Subject_Grading {
    public static void main(String[] args) {
        double noteOne;
        double noteTwo;
        double noteThree;
        Scanner notes = new Scanner(System.in);


        System.out.println("Enter firts grade: ");
        noteOne=notes.nextDouble();

        System.out.println("Enter second gade: ");
        noteTwo=notes.nextDouble();

        System.out.println("Enter third gade: ");
        noteThree=notes.nextDouble();


        double sumTotalGrade= noteOne+noteTwo+noteThree;
        double averageGrade= sumTotalGrade/3;
        System.out.println("The average is: "+averageGrade);

        if (averageGrade>=7){
            System.out.println("Promocionado");

        } else if (averageGrade>=4) {
            System.out.println("Regular");


        } else if (averageGrade<4) {
            System.out.println("Reprobado");

        }
    }

}
