public class HangmanLogic {

  private String guessedLetters;
  private int numberOfFaults;
  private String word;

  public HangmanLogic(String word) {
    guessedLetters = "";
    numberOfFaults = 0;
    this.word = word.toUpperCase();
  }

  public int numberOfFaults() {
    return numberOfFaults;
  }

  public String guessedLetters() {
    return guessedLetters;
  }

  public int losingFaultAmount() {
    return 12;
  }

  public void guessLetter(String letter) {
    if (!guessedLetters.contains(letter)) {
      guessedLetters += letter;
      if (!word.contains(letter)) {
        numberOfFaults++;
      }
    }
  }

  public String hiddenWord() {
    String output = "";
    for (int i = 0; i < word.length(); i++) {
      boolean isMatch = false;
      for (int j = 0; j < guessedLetters.length(); j++) {
        if (word.charAt(i) == guessedLetters.charAt(j)) {
          isMatch = true;
          break;
        }
      }
      if (isMatch) {
        output += word.charAt(i);
      } else {
        output += "_";
      }
    }
    return output;
  }

}