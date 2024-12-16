import java.util.Scanner;

public class IntegradoraDos {

    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese numero 1: ");
        int num1 = miScanner.nextInt();
        System.out.println("Ingrese numero 2: ");
        int num2 = miScanner.nextInt();
        String opcion = "";
        System.out.println("Ingrese la operacion deseada\nSuma\nResta\nMultiplicacion\nDivision");
        opcion = miScanner.next();

        switch (opcion) {
            case "Suma":
                System.out.println("El resultado de la suma entre " + num1 + " y " + num2 + " es: " + (num1 + num2));
                break;

            case "Resta":
                System.out.println("El resultado de la resta entre " + num1 + " y " + num2 + " es: " + (num1 - num2));
                break;

            case "Multiplicacion":
                System.out.println("El resultado de la multiplicacion entre " + num1 + " y " + num2 + " es: " + (num1 * num2));
                break;

            case "Division":
                if (num2 == 0) {
                    System.out.println("No se puede dividir un numero entre 0");
                } else {
                    System.out.println("El resultado de la division entre " + num1 + " y " + num2 + " es: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("La opcion ingresada no es valida...");

        }
    }
}


