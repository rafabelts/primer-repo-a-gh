import java.util.Scanner;

public class Greeting {

  public static void main(String[] args) {

    System.out.print("Write your input: ");
    Scanner scanner = new Scanner(System.in);
    String userInput = scanner.next();

    for (int i = 0; i < 3; i++) {
      System.out.println(userInput);
    }

    scanner.close();
  }

}
