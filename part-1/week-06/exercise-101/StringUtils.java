public class StringUtils {

  public static boolean included(String word, String query) {
    if (!word.isEmpty() && !query.isEmpty()) {
      return word.toLowerCase().contains(query.trim().toLowerCase());
    }
    return false;
  }

}