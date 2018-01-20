import java.util.Scanner;

public class Temperatures {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    while (true) {
      System.out.print("Enter a number: ");
      double num = Double.parseDouble(reader.nextLine());
      if (num >= -30 && num <= 40) {
        Graph.addNumber(num);
      }
    }
  }

}