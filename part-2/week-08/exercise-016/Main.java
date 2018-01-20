import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Contest contest = new Contest("Kumpula");

    System.out.println(contest.getName() + " ski jumping week");
    System.out.println();

    addContestants(scanner, contest);
    System.out.println();

    System.out.println("The tournament begins!");
    System.out.println();

    startContest(scanner, contest);
    System.out.println();

    System.out.println("Thanks!");
    System.out.println();

    contestResults(contest);
    System.out.println();
  }

  private static void addContestants(Scanner scanner, Contest contest) {
    System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
    while (true) {
      System.out.print(createWhitespace(2) + "Participant name: ");
      String name = scanner.nextLine();
      if (name.isEmpty()) {
        break;
      } else {
        contest.addContestant(name);
      }
    }
  }

  private static void startContest(Scanner scanner, Contest contest) {
    while (true) {
      System.out.print("Write \"jump\" to jump; otherwise you quit: ");
      String command = scanner.nextLine();
      if (!command.equalsIgnoreCase("jump")) {
        break;
      } else {
        System.out.println();
        System.out.println("Round " + contest.getRound());
        System.out.println();
        jumpOrder(contest);
        contest.jump();
        System.out.println();
        jumpResults(contest);
        System.out.println();
      }
    }
  }

  private static void jumpOrder(Contest contest) {
    System.out.println("Jumping order:");
    contest.sortContestants(false);
    for (int i = 0; i < contest.getContestants().size(); i++) {
      System.out.println(createWhitespace(2) + (i + 1) + ". " + contest.getContestants().get(i).getName() + " (" + contest.getContestants().get(i).getTotal() + " points)");
    }
  }

  private static void jumpResults(Contest contest) {
    System.out.println("Results of round " + (contest.getRound() - 1));
    for (Contestant contestant : contest.getContestants()) {
      System.out.println(createWhitespace(2) + contestant.getName());
      System.out.println(createWhitespace(4) + "length: " + contestant.getLastJump().getLength());
      System.out.println(createWhitespace(4) + "judge votes: " + contestant.getLastJump().getScores());
    }
  }

  private static void contestResults(Contest contest) {
    System.out.println("Tournament results:");
    System.out.println("Position" + createWhitespace(4) + "Name");
    contest.sortContestants(true);
    for (int i = 0; i < contest.getContestants().size(); i++) {
      System.out.println((i + 1) + createWhitespace(11) + contest.getContestants().get(i).getName() + " (" + contest.getContestants().get(i).getTotal() + " points)");
      String output = createWhitespace(12) + "jump lengths: ";
      for (int j = 0; j < contest.getContestants().get(i).getJumps().size(); j++) {
        output += contest.getContestants().get(i).getJumps().get(j).getLength();
        output += " m";
        if (j != (contest.getContestants().get(i).getJumps().size() - 1)) {
          output += ", ";
        }
      }
      System.out.println(output);
    }
  }

  private static String createWhitespace(int spaces) {
    String output = "";
    for (int i = 0; i < spaces; i++) {
      output += " ";
    }
    return output;
  }

}