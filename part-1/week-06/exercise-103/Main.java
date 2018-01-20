import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    ArrayList<Bird> birds = new ArrayList<Bird>();
    Scanner scanner = new Scanner(System.in);
    String command;
    while (true) {
      System.out.print("? ");
      command = scanner.nextLine();
      if (tidyString(command).equals("quit")) {
        break;
      } else if (tidyString(command).equals("add")) {
        addBird(scanner, birds);
      } else if (tidyString(command).equals("observation")) {
        addObservation(scanner, birds);
      } else if (tidyString(command).equals("statistics")) {
        printAll(birds);
      } else if (tidyString(command).equals("show")) {
        printSingle(scanner, birds);
      } else {
        System.out.println("Invalid command. Please try again.");
      }
    }
  }

  private static void addBird(Scanner scanner, ArrayList<Bird> birds) {
    System.out.print("Name: ");
    String name = scanner.nextLine();
    System.out.print("Latin Name: ");
    String latinName = scanner.nextLine();
    boolean isNew = true;
    for (Bird bird : birds) {
      if (tidyString(bird.getName()).equals(tidyString(name)) || tidyString(bird.getLatinName()).equals(tidyString(latinName))) {
        isNew = false;
        break;
      }
    }
    if (isNew) {
      birds.add(new Bird(name, latinName));
    }
  }

  private static void addObservation(Scanner scanner, ArrayList<Bird> birds) {
    System.out.print("What was observed? ");
    String name = scanner.nextLine();
    boolean isValid = false;
    for (Bird bird : birds) {
      if (tidyString(bird.getName()).equals(tidyString(name)) || tidyString(bird.getLatinName()).equals(tidyString(name))) {
        isValid = true;
        bird.addObservation();
        break;
      }
    }
    if (!isValid) {
      System.out.println("Is not a bird!");
    }
  }

  private static void printAll(ArrayList<Bird> birds) {
    for (Bird bird : birds) {
      System.out.println(bird);
    }
  }

  private static void printSingle(Scanner scanner, ArrayList<Bird> birds) {
    System.out.print("What? ");
    String name = scanner.nextLine();
    boolean isValid = false;
    for (Bird bird : birds) {
      if (tidyString(bird.getName()).equals(tidyString(name)) || tidyString(bird.getLatinName()).equals(tidyString(name))) {
        isValid = true;
        System.out.println(bird);
        break;
      }
    }
    if (!isValid) {
      System.out.println("Is not a bird!");
    }
  }

  private static String tidyString(String text) {
    return text.trim().toLowerCase();
  }

}