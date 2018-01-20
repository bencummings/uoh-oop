public class Least {

  public static void main(String[] args) {
    System.out.println("Least: " + least(2, 7));
  }

  public static int least(int number1, int number2) {
    return (number1 < number2) ? number1 : number2;
  }

}