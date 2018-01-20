import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {

  private HashMap<String, String> words;

  public Dictionary() {
    words = new HashMap<String, String>();
  }

  public String translate(String word) {
    word = sanitiseString(word);
    if (words.containsKey(word)) {
      return words.get(word);
    }
    return null;
  }

  public void add(String word, String translation) {
    words.put(sanitiseString(word), sanitiseString(translation));
  }

  public int amountOfWords() {
    return words.size();
  }

  public ArrayList<String> translationList() {
    ArrayList<String> pairs = new ArrayList<String>();
    for (Map.Entry<String, String> entry : words.entrySet()) {
      pairs.add(entry.getKey() + " = " + entry.getValue());
    }
    return pairs;
  }

  private String sanitiseString(String s) {
    return s.toLowerCase().trim();
  }

}