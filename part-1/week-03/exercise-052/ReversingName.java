import java.util.Scanner;

public class ReversingName {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Type your name: ");
    String name = reader.nextLine();
    String nameReversed = "";
    int i = name.length();
    while (i > 0) {
      i--;
      nameReversed += name.charAt(i);
    }
    System.out.println("In reverse order: " + nameReversed);
  }

}