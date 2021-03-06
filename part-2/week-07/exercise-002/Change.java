public class Change {

  private char fromCharacter;
  private char toCharacter;

  public Change(char fromCharacter, char toCharacter) {
    this.fromCharacter = fromCharacter;
    this.toCharacter = toCharacter;
  }

  public String change(String word) {
    String changedWord = "";
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == fromCharacter) {
        changedWord += toCharacter;
      } else {
        changedWord += word.charAt(i);
      }
    }
    return changedWord;
  }

}