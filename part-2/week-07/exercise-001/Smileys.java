public class Smileys {

  public static void main(String[] args) {
    printWithSmileys("METHOD");
  }

  private static void printWithSmileys(String characters) {
    String smiley = ":)";
    String paddingLeft = " ";
    String paddingRight = " ";

    if ((characters.length() % 2) != 0) {
      paddingRight += " ";
    }

    int smileyCount = (characters.length() + paddingLeft.length() + paddingRight.length() + (smiley.length() * 2)) / smiley.length();

    printLine(smiley, smileyCount);
    System.out.println(smiley + paddingLeft + characters + paddingRight + smiley);
    printLine(smiley, smileyCount);
    System.out.println();
  }

  private static void printLine(String characters, int count) {
    String output = "";
    for (int i = 0; i < count; i++) {
      output += characters;
    }
    System.out.println(output);
  }

}