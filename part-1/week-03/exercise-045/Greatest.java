public class Greatest {

  public static void main(String[] args) {
    System.out.println("Greatest: " + greatest(2, 7, 3));
  }

  public static int greatest(int number1, int number2, int number3) {
    return Math.max(Math.max(number1, number2), number3);
  }

}