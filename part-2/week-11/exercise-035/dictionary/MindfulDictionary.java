package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MindfulDictionary {

  private Map<String, String> words;
  private String filename;

  public MindfulDictionary() {
    words = new HashMap<String, String>();
  }

  public MindfulDictionary(String filename) {
    this();
    this.filename = filename;
  }

  public void add(String word, String translation) {
    word = word.toLowerCase();
    translation = translation.toLowerCase();
    if (!words.containsKey(word)) {
      words.put(word, translation);
      words.put(translation, word);
    }
  }

  public boolean load() {
    try {
      Scanner scanner = new Scanner(new File(filename));
      while (scanner.hasNextLine()) {
        String[] parts = scanner.nextLine().split(":");
        add(parts[0], parts[1]);
      }
      scanner.close();
      return true;
    } catch (Exception e) {
      System.out.println("The specified file does not exist.");
      return false;
    }
  }

  public void remove(String word) {
    word = word.toLowerCase();
    if (words.containsKey(word)) {
      words.remove(words.get(word));
      words.remove(word);
    }
  }

  public boolean save() {
    Map<String, String> filteredWords = new HashMap<String, String>();
    for (Map.Entry<String, String> entry : words.entrySet()) {
      String k = entry.getKey();
      String v = entry.getValue();
      if (!filteredWords.containsKey(k) && !filteredWords.containsValue(k)) {
        filteredWords.put(k, v);
      }
    }

    String output = "";
    for (Map.Entry<String, String> entry : filteredWords.entrySet()) {
      output += entry.getKey() + ":" + entry.getValue() + "\n";
    }

    try {
      FileWriter fw = new FileWriter(filename);
      fw.write(output);
      fw.close();
      return true;
    } catch (Exception e) {
      System.out.println("Could not write to the specified file.");
      return false;
    }
  }

  public String translate(String word) {
    word = word.toLowerCase();
    if (words.containsKey(word)) {
      return words.get(word);
    }
    return null;
  }

}