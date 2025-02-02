package Exercices_While;

import java.util.Scanner;

public class WhileAddAndAverage {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        int oneNumber = 0;
        int countOfNumber = 0;
        int addNumbers = 0;
        int maxNumber=10;


        while (countOfNumber < maxNumber) {
            countOfNumber = countOfNumber + 1;
            System.out.println("Enter ten numbers");
            oneNumber = number.nextInt();
            addNumbers = addNumbers + oneNumber;
        }
        double average = addNumbers / maxNumber;
        System.out.println("Total add is: " + addNumbers);
        System.out.println("The average is: " + average);


    }
}
