import java.util.Scanner;

public class SumOfManyNumbers {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int num;
    int sum = 0;
    while (true) {
      num = Integer.parseInt(reader.nextLine());
      if (num == 0) {
        break;
      }
      sum += num;
      System.out.println("Sum is now: " + sum);
    }
    System.out.println("Sum in the end: " + sum);
  }

}