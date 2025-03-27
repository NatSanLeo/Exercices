package JavaU;

import java.util.Scanner;

public class EntradaDatos {

  public static Scanner dataUser = new Scanner(System.in);


  public static void main(String[] args) {
    //enterYourName();
    //differenteTypeOfData();
    convertData();
  }

  public static void enterYourName() {
    System.out.print("Write your name: ");
    String nombre = dataUser.nextLine();
    System.out.println("Your name is: " + nombre);
  }

  public static void differenteTypeOfData() {
    System.out.print("Enter your phone: ");
    int phone = dataUser.nextInt();
    System.out.println("Your phone is: " + phone);

    System.out.print("Enter you heiht:");
    double height = dataUser.nextDouble();
    System.out.println("You height is: " + height);

    System.out.println("Enter your favorite food:");
    String favoriteFood = dataUser.next();
    System.out.println("favoriteFood: " + favoriteFood);
  }

  public static void convertData() {
    System.out.print("Enter a int number: ");
    String numberString = dataUser.nextLine();
    int intNumer = Integer.parseInt(numberString);
    System.out.println("intNumer: " + intNumer);

    System.out.println("Enter a double number: ");
    String numberDoubleString = dataUser.nextLine();
    double numberDouble = Float.parseFloat(numberDoubleString);
    System.out.println("numberDouble = " + numberDouble);
  }

}
