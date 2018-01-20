public class TestProgram {

  public static void main(String[] args) {
    HangmanLogic logic = new HangmanLogic("kissa");
    System.out.println("Word at start: " + logic.hiddenWord());
    System.out.println("Let us guess: A, D, S, F, D");
    logic.guessLetter("A");
    logic.guessLetter("D");
    logic.guessLetter("S");
    logic.guessLetter("F");
    logic.guessLetter("D");
    System.out.println("Guessed letters: " + logic.guessedLetters());
    System.out.println("Number of incorrect guesses: " + logic.numberOfFaults());
    System.out.println("Word is: " + logic.hiddenWord());
  }

}