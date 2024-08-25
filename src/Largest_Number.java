import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        int number1;
        int number2;
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number one:");
        number1 = number.nextInt();
        System.out.println("Enter numer two:");
        number2 = number.nextInt();
        if (number1 >= number2) {
            System.out.println("The largest number is: " + number1);
        } else if (number2 > number1) {
            System.out.println("The largest number is: " + number2);

        }
    }
}
