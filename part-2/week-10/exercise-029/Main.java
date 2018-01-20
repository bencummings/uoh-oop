import java.util.ArrayList;
import java.util.List;
import people.*;

public class Main {

  public static void main(String[] args) {
    List<Person> people = new ArrayList<Person>();

    people.add(new Teacher("Jane", "Sydney, NSW", 4000));
    people.add(new Student("John", "Sydney, NSW"));

    printDepartment(people);
  }

  public static void printDepartment(List<Person> people) {
    for (Person person : people) {
      System.out.println(person);
    }
  }

}