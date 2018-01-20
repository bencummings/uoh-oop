import java.util.Scanner;

public class WordInsideWord {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Type the first word: ");
    String firstWord = reader.nextLine();
    System.out.print("Type the second word: ");
    String secondWord = reader.nextLine();
    String outcome = "found";
    if (!firstWord.contains(secondWord)) {
      outcome = "not " + outcome;
    }
    System.out.println("The word '" + secondWord + "' is " + outcome + " in the word '" + firstWord + "'.");
  }

}