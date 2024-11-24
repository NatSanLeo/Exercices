import java.util.Scanner;

public class Vector_Height {

    public double[] height;
    double totalHeight = 0;
    double average;
    Scanner dataUser = new Scanner(System.in);

    public void enterHeight() {
        height = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the height: ");
            height[i] = dataUser.nextDouble();
        }
    }

    public void obtainAverage() {
        for (int i = 0; i < 5; i++) {
            totalHeight = totalHeight + height[i];
            average = totalHeight / height.length;
        }
        System.out.println("The total average is: " + average);
    }

    public void countTallestAndLowest() {
        int countOfTaller = 0;
        int countOfLower = 0;
        for (int i = 0; i < 5; i++) {
            if (height[i] > average) {
                countOfTaller++;
            } else
                countOfLower++;
        }
        System.out.println("There are " + countOfTaller + " people taller.");
        System.out.println("There are " + countOfLower + " people lower.");
    }

    public static void main(String[] args) {
        Vector_Height vectorHeight = new Vector_Height();
        vectorHeight.enterHeight();
        vectorHeight.obtainAverage();
        vectorHeight.countTallestAndLowest();
    }
}



