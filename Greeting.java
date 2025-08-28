import java.util.Scanner;

public class Greeting {

  public static void main(String[] args) {

    System.out.print("Write your input: ");
    Scanner scanner = new Scanner(System.in);
    String userInput = scanner.next();

    System.out.println("User wrote: " + userInput);

    scanner.close();
  }

}
