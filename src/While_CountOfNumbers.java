import java.util.Scanner;

public class While_CountOfNumbers {

    public static void main(String[] args) {
        int userNumber;
        int number = 0;
        Scanner numero = new Scanner(System.in);
        System.out.println("Enter the userNumber");
        userNumber = numero.nextInt();

        while (userNumber >= number) {
            System.out.print(number++ + " ");
        }


    }
}
