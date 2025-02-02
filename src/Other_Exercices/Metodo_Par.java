package Other_Exercices;

import java.util.Scanner;

public class Metodo_Par {
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        esPar(solicitarNumero());
    }

    public static int solicitarNumero() {
        Integer numero = null;
        System.out.println("Por favor ingrese un número:");
        do {
            try {
                numero = teclado.nextInt();
            } catch (Exception e) {
                teclado.nextLine();
                System.out.println("No ingresó un número, intente nuevamente:");
            }
        } while (numero == null);
        return numero;
    }

    public static void esPar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("El " + numero + " es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}
