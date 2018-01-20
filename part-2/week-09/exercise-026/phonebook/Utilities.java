package phonebook;

public class Utilities {

  public static String generateWhitespace(int amount) {
    String output = "";
    for (int i = 0; i < amount; i++) {
      output += " ";
    }
    return output;
  }

  public static String sanitiseString(String s) {
    return s.toLowerCase().trim();
  }

}