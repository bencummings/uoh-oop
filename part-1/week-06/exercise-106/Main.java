import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numbers = {-1985, -17, -5, 5, 17, 1985};
    System.out.print("Number to search for: ");
    if (BinarySearch.search(numbers, Integer.parseInt(scanner.nextLine()))) {
      System.out.println("Number was found.");
    } else {
      System.out.println("Number was NOT found.");
    }
  }

}