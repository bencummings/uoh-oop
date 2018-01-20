import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Person> people = new ArrayList<Person>();

    people.add(new Person("Amy", 45000));
    people.add(new Person("Ben", 80000));
    people.add(new Person("Luke", 1000000));

    System.out.print("Unsorted: ");
    System.out.println(people);

    Collections.sort(people);

    System.out.print("Sorted (Salary): ");
    System.out.println(people);
  }

}