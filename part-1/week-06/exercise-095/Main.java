public class Main {

  public static void main(String[] args) {
    Money a = new Money(5, 0);
    Money b = new Money(2, 50);
    Money c = a.plus(b);
    Money d = a.minus(b);

    System.out.println("The value of 'a' is: " + a);
    System.out.println("The value of 'b' is: " + b);
    System.out.println("The value of 'c' is: " + c);
    System.out.println("The value of 'd' is: " + d);

    if (c.less(d)) {
      System.out.println("The value of 'd' is greater than 'c'.");
    } else {
      System.out.println("The value of 'c' is greater than 'd'.");
    }
  }

}