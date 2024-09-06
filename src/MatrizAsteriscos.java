import java.util.Scanner;

public class MatrizAsteriscos {
    public static void main(String[] args) {
        int numero;
        Scanner numeroUsuario = new Scanner(System.in);
        System.out.println("Enter number");
        numero = numeroUsuario.nextInt();

        for (int s = 0; s <= numero; s++) {
            for (int o = 0; o <= numero; o++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
