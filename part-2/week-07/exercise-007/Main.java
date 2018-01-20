import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Dictionary dictionary = new Dictionary();
    TextUserInterface ui = new TextUserInterface(scanner, dictionary);

    ui.start();

    System.out.println("The dictionary contains the following word pairs:");
    for (String pair : dictionary.translationList()) {
      System.out.println(pair);
    }
  }

}