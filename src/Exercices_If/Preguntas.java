package Exercices_If;

import java.util.Scanner;

public class Preguntas {
    /* Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información:
    cantidad total de preguntas que se le realizaron y la cantidad de preguntas que contestó correctamente.
    Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del mismo según el
     porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
     Nivel máximo:	Porcentaje>=90%.
     Nivel medio:	Porcentaje>=75% y <90%.
     Nivel regular:	Porcentaje>=50% y <75%.
     Fuera de nivel:	Porcentaje<50%.*/
    public static void main(String[] args) {
        int questionNumbers;
        int correctQuestios;
        Scanner question = new Scanner(System.in);
        System.out.println("Ingrese numero de preguntas totales: ");
        questionNumbers = question.nextInt();

        System.out.println("Ingrese numero de preguntas correctas: ");
        correctQuestios = question.nextInt();

        double averageCorrectQuestion = (correctQuestios * 100) / questionNumbers;
        System.out.println(averageCorrectQuestion + "%");

        if (averageCorrectQuestion >= 90) {
            System.out.println("Tu porcetaje de preguntas correctas fue: " + averageCorrectQuestion + "%" + " Tu nivel fue: máximo");
        } else if (averageCorrectQuestion >= 75 && averageCorrectQuestion < 90) {
            System.out.println("Tu porcetaje de preguntas correctas fue: " + averageCorrectQuestion + "%" + " Tu nivel fue: medio");


        } else if (averageCorrectQuestion >= 50 && averageCorrectQuestion < 75) {
            System.out.println("Tu porcetaje de preguntas correctas fue: " + averageCorrectQuestion + "%" + " Tu nivel fue: regular");


        } else if (averageCorrectQuestion < 50) {
            System.out.println("Tu porcetaje de preguntas correctas fue: " + averageCorrectQuestion + "%" + " Tu nivel fue: bajo");


        }


    }
}
