package Exercices_If;

import java.util.Scanner;
//Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado".

public class AverageNotes {

    public static void main(String[] args) {
        double OneGrade;
        double TwoGrade;
        double ThreeGrade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the firts grade: ");
        OneGrade = sc.nextDouble();
        System.out.println("Enter the second grade: ");
        TwoGrade = sc.nextDouble();
        System.out.println("Enter the three grade: ");
        ThreeGrade = sc.nextDouble();

        double calculateAverage;
        calculateAverage = (OneGrade + TwoGrade + ThreeGrade) / 3;

        if (calculateAverage >= 7) {
            System.out.println("Promocionado" + calculateAverage);
        } else {
            System.out.println("No promocionado" + calculateAverage);
        }

    }
}
