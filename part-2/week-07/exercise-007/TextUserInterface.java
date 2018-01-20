import java.util.Scanner;

public class TextUserInterface {

  private Scanner scanner;
  private Dictionary dictionary;

  public TextUserInterface(Scanner scanner, Dictionary dictionary) {
    this.scanner = scanner;
    this.dictionary = dictionary;
  }

  public void start() {
    System.out.println("Valid Commands:");
    System.out.println("  Add        Adds a new word pair to the dictionary.");
    System.out.println("  Translate  Translates the specified word.");
    System.out.println("  Quit       Quits the application.");
    System.out.println();

    while (true) {
      System.out.print("Command: ");
      String command = sanitiseString(scanner.nextLine());

      if (command.equals("quit")) {
        System.out.println("Goodbye!");
        System.out.println();
        break;
      } else if (command.equals("add") || command.equals("translate")) {
        System.out.print("Original Word (Finnish): ");
        String originalWord = sanitiseString(scanner.nextLine());
        if (command.equals("add")) {
          System.out.print("Translated Word (English): ");
          String translatedWord = sanitiseString(scanner.nextLine());
          dictionary.add(originalWord, translatedWord);
        } else {
          System.out.println("The word '" + originalWord + "' (Finnish) is translated to the word '" + dictionary.translate(originalWord) + "' (English).");
        }
      } else {
        System.out.println("Unknown command. Please try again.");
      }

      System.out.println();
    }
  }

  private String sanitiseString(String s) {
    return s.toLowerCase().trim();
  }

}