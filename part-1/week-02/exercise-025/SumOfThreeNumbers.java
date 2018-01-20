import java.util.Scanner;

public class SumOfThreeNumbers {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int numQuantity = 3;
    String[] numWords = {"first", "second", "third"};
    int numSum = 0;
    for (int i = 0; i < numQuantity; i++) {
      System.out.print("Type the " + numWords[i] + " number: ");
      numSum += Integer.parseInt(reader.nextLine());
    }
    System.out.println("Sum: " + numSum);
  }

}