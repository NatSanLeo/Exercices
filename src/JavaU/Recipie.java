package JavaU;

import java.util.Scanner;

public class Recipie {

  public static void main(String[] args) {
    System.out.println("** Recipie **");
    Scanner userData = new Scanner(System.in);
    System.out.print("Enter name of recipe: ");
    String nameRecipie = userData.nextLine();
    System.out.print("Enter the ingredients: ");
    String ingredientsOfRecipie = userData.nextLine();
    System.out.print("Enter time to cook: ");
    int tipeToCook = userData.nextInt();
    System.out.print("What is the level? ");
    String levelOfRecipie = userData.next();

    System.out.println("**There is you recipie**");
    System.out.println("The name of recipie is: " + nameRecipie + " the ingredients are: " + ingredientsOfRecipie
            + " the time to  cook is: " + tipeToCook +
        " this recipie have a difficult level: " + levelOfRecipie);

  }

}
