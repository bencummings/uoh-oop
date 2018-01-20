import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Type a number: ");
    int num = Integer.parseInt(reader.nextLine());
    int sum = 1;
    int i = 0;
    while (i < num) {
      i++;
      sum *= i;
    }
    System.out.println("Factorial is " + sum);
  }

}