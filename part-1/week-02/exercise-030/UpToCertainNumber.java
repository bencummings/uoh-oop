import java.util.Scanner;

public class UpToCertainNumber {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Up to what number? ");
    int num = Integer.parseInt(reader.nextLine());
    int i = 0;
    while (i < num) {
      i++;
      System.out.println(i);
    }
  }

}