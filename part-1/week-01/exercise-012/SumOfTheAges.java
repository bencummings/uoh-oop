import java.util.Scanner;

public class SumOfTheAges {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int entries = 2;
    String[] names = new String[entries];
    int[] ages = new int[entries];
    for (int i = 0; i < entries; i++) {
      System.out.print("Type your name: ");
      names[i] = reader.nextLine();
      System.out.print("Type your age: ");
      ages[i] = Integer.parseInt(reader.nextLine());
    }
    String output = "";
    int result = 0;
    for (int i = 0; i < entries; i++) {
      if (i > 0) {
        output += " and ";
      }
      output += names[i];
      result += ages[i];
      if (i == entries - 1) {
        output += " are " + result + " years old in total.";
        System.out.println(output);
      }
    }
  }

}