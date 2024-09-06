import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        int numero;
        Scanner numeroUsuario = new Scanner(System.in);
        System.out.println("Enter number");
        numero = numeroUsuario.nextInt();

        for (int s = 1; s <= numero; s++) {
            for (int n = 1; n <= s; n++) {
                if (s==n){
                    System.out.print(n);

                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
