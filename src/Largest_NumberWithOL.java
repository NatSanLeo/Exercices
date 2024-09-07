import java.util.Scanner;
/*
Confeccionar un programa que lea por teclado tres números distintos y nos muestre el mayor.
*/



public class Largest_NumberWithOL {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int number1;
        int number2;
        int number3;


        System.out.println("Ingrese el primero numero a comparar");
        number1 = number.nextInt();
        System.out.println("Ingrese el segundo numero a comparar");
        number2 = number.nextInt();
        System.out.println("Ingrese el segundo numero a comparar");
        number3 = number.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("El numero " + number1 + " es el mayor de los tres números");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("El numero " + number2 + " es el mayor de los tres números");

        } else if (number3 > number1 && number3 > number2) {
            System.out.println("El numero " + number3 + " es el mayor de los tres números");


        }


    }


}
