package personnel;

public class Main {

  public static void main(String[] args) {
    Employees e = new Employees();
    e.add(new Person("Amy", Education.B));
    e.add(new Person("Ben", Education.M));
    e.print(Education.M);
  }

}