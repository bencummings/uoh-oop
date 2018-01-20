public class BinarySearch {

  public static boolean search(int[] array, int value) {
    int lowIndex = 0;
    int highIndex = array.length - 1;
    while (lowIndex <= highIndex) {
      int midIndex = (lowIndex + highIndex) / 2;
      if (array[midIndex] == value) {
        return true;
      } else if (array[midIndex] > value) {
        highIndex = midIndex - 1;
      } else {
        lowIndex = midIndex + 1;
      }
    }
    return false;
  }

}