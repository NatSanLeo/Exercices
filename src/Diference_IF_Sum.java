import java.util.Scanner;

//Realizar un programa que lea por teclado dos números, si el primero es mayor al segundo informar su suma y diferencia,
// en caso contrario informar el producto y la división del primero respecto al segundo.
public class Diference_IF_Sum {
    public static void main(String[] args) {
        double numberOne;
        double numberTwo;
        double sum;
        double diference;
        double multiply;
        double division;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firts number");
        numberOne = sc.nextInt();

        System.out.println("Enter second number");
        numberTwo = sc.nextInt();

        if (numberOne > numberTwo) {
            sum = numberOne + numberTwo;
            diference = numberOne - numberTwo;
            System.out.println("El primer numero es mayor que el segundo y la suma es " + sum);
            System.out.println("La diferencia del primer numero en comparación al segundo es: " + diference);
        } else {
            multiply = numberOne * numberTwo;
            division = numberOne / numberTwo;
            System.out.println("El primer numero es menor que el segundo y la multiplicación es:" + multiply);
            System.out.println("La división es: " + division);
        }

    }
}
