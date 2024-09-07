import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        int control = 1;
        int userNumbers = 0;


        Scanner number = new Scanner(System.in);

        while (control <= 10) {
            System.out.println("Ingrese el número:" + control);
            userNumbers = number.nextInt() + userNumbers;
            control++;


        }
        double average;
        average = (userNumbers) / 10;
        System.out.println("La suma de los numeros es: " + userNumbers);
        System.out.println("El promedio es: " + average);


    }
}
