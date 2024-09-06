import java.util.Scanner;

public class Ajedrez {
    public static void main(String[] args) {
        int numero;
        Scanner numeroUsuario = new Scanner(System.in);
        System.out.println("Enter number");
        numero = numeroUsuario.nextInt();

        for (int s = 1; s <= numero; s++) {
            int sum;

            for (int n = 1; n <= numero; n++) {
                sum = s + n;
                if (sum % 2 == 0) {
                    System.out.print("X");

                } else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}


