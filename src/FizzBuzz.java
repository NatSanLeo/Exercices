public class FizzBuzz {

    public static void main(String[] args) {
        int start = 1, stop = 100;

        for (int i = start; i <= stop; i++) {
            String message = "The number: " + i + " ";
            if (i % 3 == 0 && i % 5 == 0) {
                message += "FizzBuzz";
            } else if (i % 3 == 0) {
                message += "Fizz";

            } else if (i % 5 == 0) {
                message += "Buzz";


            }
            System.out.println(message);

        }

    }
}



