import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    NumberStatistics all = new NumberStatistics();
    NumberStatistics even = new NumberStatistics();
    NumberStatistics odd = new NumberStatistics();

    System.out.println("Type numbers:");

    int num;
    while (true) {
      num = Integer.parseInt(reader.nextLine());
      if (num == -1) {
        break;
      } else {
        all.addNumber(num);
        if (num % 2 == 0) {
          even.addNumber(num);
        } else {
          odd.addNumber(num);
        }
      }
    }

    System.out.println("Sum: " + all.sum());
    System.out.println("Sum of Even: " + even.sum());
    System.out.println("Sum of Odd: " + odd.sum());
  }

}