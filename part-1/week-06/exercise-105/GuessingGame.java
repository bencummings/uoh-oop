import java.util.Scanner;

public class GuessingGame {

  private Scanner reader;

  public GuessingGame() {
    reader = new Scanner(System.in);
  }

  public void play(int lowerLimit, int upperLimit) {
    instructions(lowerLimit, upperLimit);
    while (lowerLimit < upperLimit) {
      int average = average(lowerLimit, upperLimit);
      if (isGreaterThan(average)) {
        lowerLimit = average + 1;
      } else {
        upperLimit = average;
      }
    }
    System.out.println("The number you're thinking of is " + lowerLimit + ".");
  }

  public void instructions(int lowerLimit, int upperLimit) {
    int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);
    System.out.println("Think of a number between " + lowerLimit + "-" + upperLimit + ".");
    System.out.println("I promise you that I can guess the number you are thinking of within " + maxQuestions + " questions.");
    System.out.println("I'll present you with a series of questions. Answer them honestly.");
    System.out.println();
  }

  public static int howManyTimesHalvable(int number) {
    return (int) (Math.log(number) / Math.log(2)) + 1;
  }

  public int average(int firstNum, int secondNum) {
    return (firstNum + secondNum) / 2;
  }

  public boolean isGreaterThan(int value) {
    System.out.println("Is your number greater than " + value + "? (y/n)");
    return reader.nextLine().toLowerCase().equals("y");
  }

}