public class PrintingLikeBoss {

  public static void main(String[] args) {
    xmasTree(5);
  }

  public static void printCharacters(int amount, char character, boolean newline) {
    String output = "";
    int i = 0;
    while (i < amount) {
      output += character;
      i++;
    }
    if (newline) {
      System.out.println(output);
    } else {
      System.out.print(output);
    }
  }

  public static void printStars(int amount) {
    printCharacters(amount, '*', true);
  }

  public static void printWhitespaces(int amount) {
    printCharacters(amount, ' ', false);
  }

  public static void printTriangle(int size) {
    int i = 0;
    while (i < size) {
      i++;
      printWhitespaces(size - i);
      printStars(i);
    }
  }

  public static void xmasTree(int height) {
    int baseHeight = 2;
    int baseWidth = 3;
    int totalHeight = height + baseHeight;
    int i = 0;
    while (i < totalHeight) {
      i++;
      if (i <= totalHeight - baseHeight) {
        printWhitespaces(height - i);
        printStars(i + (i - 1));
      } else {
        printWhitespaces(((height * 2 - 1) - baseWidth) / 2);
        printStars(baseWidth);
      }
    }
  }

}