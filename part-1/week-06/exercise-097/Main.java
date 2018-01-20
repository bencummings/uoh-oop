public class Main {

  public static void main(String[] args) {
    int[] array = {5, 1, 3, 4, 2};
    printElegantly(array);
  }

  public static void printElegantly(int[] array) {
    String output = "";
    for (int i = 0; i < array.length; i++) {
      output += array[i];
      if (i != array.length - 1) {
        output += ", ";
      }
    }
    System.out.println(output);
  }

}