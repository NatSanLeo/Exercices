import java.util.Scanner;

public class ForCountOfValues {
    public static void main(String[] args) {
        Scanner numeroIngresoUsuarios = new Scanner(System.in);
        int numerosMayoresMil = 0;
        int numerosAIngresar = 0;
        int valorNumero = 0;

        System.out.println("Ingresa la cantidad de numeros que quieres ingresar");
        numerosAIngresar = numeroIngresoUsuarios.nextInt();

        for (int i = 1; i <= numerosAIngresar; i++) {
            System.out.println("Ingrese los numeros: ");
            valorNumero = numeroIngresoUsuarios.nextInt();
            if (valorNumero >= 1000) {
                numerosMayoresMil = numerosMayoresMil + 1;
            }

        }
        System.out.println("La cantidad de numeros mayores a 1000 (mil): " + numerosMayoresMil);
    }
}

