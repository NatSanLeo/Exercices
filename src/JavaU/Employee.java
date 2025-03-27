package JavaU;

import java.util.Scanner;

public class Employee {

  public static void main(String[] args) {
    Scanner userData = new Scanner(System.in);
    System.out.println("** Employee **");

    System.out.print("Employee name: ");
    String employeeName = userData.nextLine();

    System.out.print("Employee age: ");
    int employeeAge = Integer.parseInt(userData.nextLine());

    System.out.print("Enter you earn: ");
    double employeeEarn = Double.parseDouble(userData.nextLine());

    System.out.print("Are you a boos? (true/false): ");
    boolean isBoss = Boolean.parseBoolean(userData.nextLine());

    System.out.println("**Employee Informatio**");
    System.out.println("Name: "+ employeeName);
    System.out.println("Age: "+ employeeAge);
    //System.out.println("Earn: "+"$"+employeeEarn);
    System.out.printf("Earn: $ %.2f%n", employeeEarn);//-> solo me va a mostrar dos decimales
    System.out.println("Is a boss: "+isBoss);
  }

}
