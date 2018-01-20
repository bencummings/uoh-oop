import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int numberDrawn = drawNumber();
    int numberGuessed;
    int guessCount = 0;
    while (true) {
      System.out.print("Guess a number: ");
      numberGuessed = Integer.parseInt(reader.nextLine());
      if (numberGuessed == numberDrawn) {
        break;
      } else {
        guessCount++;
        String outcome;
        if (numberGuessed < numberDrawn) {
          outcome = "greater";
        } else {
          outcome = "lesser";
        }
        System.out.println("The number is " + outcome + ", guesses made: " + guessCount);
      }
    }
    System.out.println("Congratulations, your guess is correct!");
  }

  private static int drawNumber() {
    return new Random().nextInt(101);
  }

}