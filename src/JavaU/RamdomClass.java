package JavaU;

import java.util.Random;

public class RamdomClass {

  public static void main(String[] args) {
    Random ramdom = new Random();
    int ramdomNumber = ramdom.nextInt(10);
    System.out.println("The ramdon number is: " + ramdomNumber);

    ramdomNumber = ramdom.nextInt(10) + 1;
    System.out.println("The ramdon number is: " + ramdomNumber);

    double doubleRamdom = ramdom.nextDouble();

    System.out.printf("doubleRamdom  %.2f%n".formatted(doubleRamdom));
  }
}
