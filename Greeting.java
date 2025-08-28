import java.util.Scanner;

public class Greeting {

  public static void main(String[] args) {

    System.out.print("Write your name: ");
    Scanner scanner = new Scanner(System.in);
    String userInput = scanner.next();

    System.out.print("Write your age: ");
    Integer age = scanner.nextInt();

    scanner.close();

    if (age >= 18) {
      System.out.println("Congratulations " + userInput + " you can vote!");
    }
  }
}
