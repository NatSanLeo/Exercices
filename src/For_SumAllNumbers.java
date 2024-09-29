import java.util.Scanner;

public class For_SumAllNumbers {
    public static void main(String[] args) {
        Scanner numerosUsuario = new Scanner(System.in);


        double sum = 0;

        for (int i = 0; i <= 10; i++) {
            int valor = i;

            System.out.println("Ingrese los números");
            valor = numerosUsuario.nextInt();
            sum = sum + valor;

        }
        double average = sum / 10;
        System.out.println("La suma de los numero es: " + sum);
        System.out.println("El promedio es: " + average);
    }
}
