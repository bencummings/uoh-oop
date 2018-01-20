public class Main {

  public static void main(String[] args) {
    MyDate birthday = new MyDate(17, 5, 1985);
    System.out.println("I was one week old on " + birthday.afterNumberOfDays(7) + ".");
  }

}