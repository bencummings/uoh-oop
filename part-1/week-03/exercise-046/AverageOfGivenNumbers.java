public class AverageOfGivenNumbers {

  public static void main(String[] args) {
    System.out.println("Average: " + average(4, 3, 6, 1));
  }

  public static double average(int number1, int number2, int number3, int number4) {
    return sum(number1, number2, number3, number4) / 4.0;
  }

  public static int sum(int number1, int number2, int number3, int number4) {
    return number1 + number2 + number3 + number4;
  }

}