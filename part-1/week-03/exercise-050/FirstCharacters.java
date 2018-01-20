import java.util.Scanner;

public class FirstCharacters {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Type your name: ");
    String name = reader.nextLine();
    int charAmount = 3;
    if (name.length() >= charAmount) {
      int i = 0;
      while (i < charAmount) {
        System.out.println((i + 1) + ". character: " + name.charAt(i));
        i++;
      }
    }
  }

}