import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] arrayA = {0, 1, 2, 3, 4};
    int[] arrayB = copy(arrayA);
    int[] arrayC = reverseCopy(arrayA);

    arrayA[0] = 5;

    System.out.println(Arrays.toString(arrayA));
    System.out.println(Arrays.toString(arrayB));
    System.out.println(Arrays.toString(arrayC));
  }

  public static int[] copy(int[] array) {
    int[] arrayCopy = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      arrayCopy[i] = array[i];
    }
    return arrayCopy;
  }

  public static int[] reverseCopy(int[] array) {
    int[] arrayCopy = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      arrayCopy[i] = array[array.length - 1 - i];
    }
    return arrayCopy;
  }

}