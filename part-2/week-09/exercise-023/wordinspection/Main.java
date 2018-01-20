package wordinspection;

import java.io.File;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    WordInspection wi = new WordInspection(new File("src/shortList.txt"));

    System.out.println("The file contains " + wi.wordCount() + " words.");
    System.out.println("The words which contain the letter 'Z' are as follows: " + outputWords(wi.wordsContainingZ()));
    System.out.println("The words which end with the letter 'L' are as follows: " + outputWords(wi.wordsEndingInL()));
    System.out.println("The words which are palindromes are as follows: " + outputWords(wi.palindromes()));
    System.out.println("The words which contain all of the Finnish vowels are as follows: " + outputWords(wi.wordsWhichContainAllVowels()));
  }

  private static String outputWords(List<String> words) {
    String output = "";
    for (int i = 0; i < words.size(); i++) {
      output += words.get(i);
      if (i != (words.size() - 1)) {
        output += ", ";
      }
    }
    return output;
  }

}