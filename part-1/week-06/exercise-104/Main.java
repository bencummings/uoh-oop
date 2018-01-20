public class Main {

  public static void main(String[] args) {
    int[] values = {8, 3, 7, 9, 1, 2, 4};
    sort(values);
  }

  public static void sort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      print(array);
      swap(array, i, indexOfTheSmallestStartingFrom(array, i));
    }
  }

  public static void print(int[] array) {
    String output = "";
    for (int i = 0; i < array.length; i++) {
      output += array[i];
      if (i != array.length - 1) {
        output += ", ";
      }
    }
    System.out.println("[" + output + "]");
  }

  public static void swap(int[] array, int firstIndex, int secondIndex) {
    int buffer = array[firstIndex];
    array[firstIndex] = array[secondIndex];
    array[secondIndex] = buffer;
  }

  public static int indexOfTheSmallest(int[] array) {
    return indexOfTheSmallestStartingFrom(array, 0);
  }

  public static int indexOfTheSmallestStartingFrom(int[] array, int startIndex) {
    int smallest = smallest(array, startIndex);
    int smallestIndex = startIndex;
    for (int i = startIndex; i < array.length; i++) {
      if (array[i] == smallest) {
        smallestIndex = i;
        break;
      }
    }
    return smallestIndex;
  }

  public static int smallest(int[] array) {
    return smallest(array, 0);
  }

  public static int smallest(int[] array, int startIndex) {
    int smallest = array[startIndex];
    for (int i = startIndex + 1; i < array.length; i++) {
      if (array[i] < smallest) {
        smallest = array[i];
      }
    }
    return smallest;
  }

}