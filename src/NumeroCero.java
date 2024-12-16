import java.util.Scanner;

public class NumeroCero {

    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Ingresa el número: ");
        double numero1 = miScanner.nextDouble();

        if (numero1 > 0) {
            System.out.println("El número es positivo.");
        } else if (numero1 < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");

        }
    }
}


