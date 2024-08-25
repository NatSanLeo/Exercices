import java.util.Scanner;

public class Income {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int income;

        System.out.println("Ingrese el income");
        income = scanner.nextInt();
        if (income > 3000) {
            System.out.println("Esta persona debe abonar impuestos");
        } else System.out.println("Esta persona no debe abonar impuestos");
    }
}
