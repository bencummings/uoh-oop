import java.util.Scanner;

public class LoopsEndingRemembering {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Type numbers:");
    int sum = 0;
    int count = 0;
    int even = 0;
    int num = 0;
    while (num != -1) {
      num = Integer.parseInt(reader.nextLine());
      if (num != -1) {
        sum += num;
        count++;
        if (num % 2 == 0) {
          even++;
        }
      }
    }
    System.out.println("Thank you and see you later!");
    System.out.println("The sum is " + sum);
    System.out.println("How many numbers: " + count);
    System.out.println("Average: " + ((double) sum / count));
    System.out.println("Even numbers: " + even);
    System.out.println("Odd numbers: " + (count - even));
  }

}