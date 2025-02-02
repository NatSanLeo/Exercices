package Other_Exercices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivSegura {

    public static void main(String[] args) {
        try {

            System.out.println("Ingrese un numero para dividir");
            Scanner teclado = new Scanner(System.in);
            int numeroUno = teclado.nextInt();
            System.out.println("Ingrese un numero para dividir");
            teclado.close();
            int numeroDos = teclado.nextInt();
            int resultado;
            resultado = numeroUno / numeroDos;
            System.out.println("Resultado de la division es: " + resultado);


        } catch (ArithmeticException e) {
            System.out.println("Realizaste una division por cero y recuerda que no se puede dividir por cero.");
        } catch (InputMismatchException e) {
            System.out.println("Por ahora solo puedes ingresar numeros enteros.");
        }


    }

}
