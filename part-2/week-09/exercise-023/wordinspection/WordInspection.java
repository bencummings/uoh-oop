package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {

  private File file;
  private Scanner scanner;
  private ArrayList<String> words;

  public WordInspection(File file) {
    this.file = file;
    try {
      generateWords();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  private void generateWords() throws Exception {
    words = new ArrayList<String>();
    scanner = new Scanner(file, "UTF-8");
    while (scanner.hasNextLine()) {
      words.add(scanner.nextLine()); // Assumes one word per line.
    }
    scanner.close();
  }

  public int wordCount() {
    return words.size();
  }

  public List<String> wordsContainingZ() {
    ArrayList<String> filteredWords = new ArrayList<String>();
    for (String word : words) {
      if (word.toLowerCase().contains("z")) {
        filteredWords.add(word);
      }
    }
    return filteredWords;
  }

  public List<String> wordsEndingInL() {
    ArrayList<String> filteredWords = new ArrayList<String>();
    for (String word : words) {
      if (word.toLowerCase().charAt(word.length() - 1) == 'l') {
        filteredWords.add(word);
      }
    }
    return filteredWords;
  }

  public List<String> palindromes() {
    ArrayList<String> filteredWords = new ArrayList<String>();
    for (String word : words) {
      if (isPalindrome(word)) {
        filteredWords.add(word);
      }
    }
    return filteredWords;
  }

  private boolean isPalindrome(String word) {
    word = word.toLowerCase();
    for (int i = 0; i < word.length() / 2; i++) {
      if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }

  public List<String> wordsWhichContainAllVowels() {
    ArrayList<String> filteredWords = new ArrayList<String>();
    String finnishVowels = "aeiouyäö";
    for (String word : words) {
      boolean isValid = true;
      for (int i = 0; i < finnishVowels.length(); i++) {
        if (!word.contains(Character.toString(finnishVowels.charAt(i)))) {
          isValid = false;
          break;
        }
      }
      if (isValid) {
        filteredWords.add(word);
      }
    }
    return filteredWords;
  }

}