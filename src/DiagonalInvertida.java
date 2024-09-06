import java.util.Scanner;

public class DiagonalInvertida {
    public static void main(String[] args) {
        int numero;
        Scanner numeroUsuario = new Scanner(System.in);
        System.out.println("Enter number");
        numero = numeroUsuario.nextInt();

        for (int s = 1; s <= numero; s++) {
            for (int n = 1; n <= numero; n++) {
                if ((n + s) == numero) {
                    System.out.print(n);

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
