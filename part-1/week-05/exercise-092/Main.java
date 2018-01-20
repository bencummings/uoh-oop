public class Main {

  public static void main(String[] args) {
    MyDate x = new MyDate(31, 12, 1999);
    MyDate y = new MyDate(1, 1, 2000);
    MyDate z = new MyDate(15, 7, 2017);

    System.out.println("The difference in years between " + x + " and " + y + " is " + x.differenceInYears(y) + ".");
    System.out.println("The difference in years between " + y + " and " + z + " is " + y.differenceInYears(z) + ".");
  }

}