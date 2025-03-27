package JavaU;

import java.util.Random;
import java.util.Scanner;

public class GenerateID {

  public static void main(String[] args) {
    Scanner userData = new Scanner(System.in);
    Random numberRamdon = new Random();

    System.out.println("** Enter the follow infomration to generate the ID Unique **");
    System.out.print("Name: ");
    String name = userData.nextLine().toUpperCase().substring(0,2);
    System.out.print("Last Name: ");
    String lastName = userData.nextLine().toUpperCase().substring(0,2);
    System.out.print("Birth year:");
    String birthYear = Integer.toString(userData.nextInt()).substring(2,4);
    int randomToId = numberRamdon.nextInt(9999) + 1;
    System.out.printf("""
        The unique ID is:%s%s%s%04d """,name,lastName,birthYear,randomToId);
    //"numero ramdon: ",randomToId





  }

}
