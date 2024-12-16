import java.util.Scanner;

public class Calificacion {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa una nota: ");
        int nota = teclado.nextInt();

        if (nota >= 90 && nota <= 100) {
            System.out.println("A");
        } else if (nota >= 80 && nota <= 89) {
            System.out.println("B");

        } else if (nota >= 70 && nota <= 79) {
            System.out.println("C");

        } else if (nota >= 60 && nota <= 69) {
            System.out.println("D");

        } else if (nota < 60 && nota >= 0) {
            System.out.println("F");

        } else {
            System.out.println("Número fuera del rango valido");
        }

    }

}
