package Exercices_If;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FahrenheitCelsius {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double temperatura;
        String unidadMedida;

        try {
            System.out.print("Ingresa la temperatura: ");
            temperatura = teclado.nextDouble();

            System.out.print("Ingresa la unidad de medida, ingresa F para Fahrenheit y C para Celsius: ");
            unidadMedida = teclado.next();

            if (unidadMedida.equalsIgnoreCase("C")) {
                temperatura = (temperatura * 9 / 5) + 32;
                System.out.println("La temperatura en Fahrenheit es: " + temperatura);

            } else if (unidadMedida.equalsIgnoreCase("F")) {
                temperatura = (temperatura - 32) * 5 / 9;
                System.out.println("La temperatura en Celsius es: " + temperatura);
            } else {
                System.out.println("No ingresaste un valor correcto.");
            }
            teclado.close();


        } catch (InputMismatchException e) {
            System.out.println("Ingresaste un valor de tempratura incorrecto.");

        } catch (Exception e) {
            System.out.println(e);

        }

    }
}