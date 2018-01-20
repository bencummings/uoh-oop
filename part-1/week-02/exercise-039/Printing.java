public class Printing {

  public static void main(String[] args) {
    printSquare(5);
    System.out.println();
    printRectangle(5, 3);
    System.out.println();
    printTriangle(5);
  }

  public static void printStars(int amount) {
    String output = "";
    int i = 0;
    while (i < amount) {
      output += "*";
      i++;
    }
    System.out.println(output);
  }

  public static void printSquare(int sideSize) {
    int i = 0;
    while (i < sideSize) {
      printStars(sideSize);
      i++;
    }
  }

  public static void printRectangle(int width, int height) {
    int i = 0;
    while (i < height) {
      printStars(width);
      i++;
    }
  }

  public static void printTriangle(int size) {
    int i = 0;
    while (i < size) {
      i++;
      printStars(i);
    }
  }

}