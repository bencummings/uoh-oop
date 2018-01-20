package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

  private List<Person> employees;

  public Employees() {
    employees = new ArrayList<Person>();
  }

  public void add(Person person) {
    employees.add(person);
  }

  public void add(List<Person> people) {
    for (Person person : people) {
      add(person);
    }
  }

  public void fire(Education education) {
    Iterator<Person> iterator = employees.iterator();
    while (iterator.hasNext()) {
      Person person = iterator.next();
      if (person.getEducation() == education) {
        iterator.remove();
      }
    }
  }

  public void print() {
    Iterator<Person> iterator = employees.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

  public void print(Education education) {
    Iterator<Person> iterator = employees.iterator();
    while (iterator.hasNext()) {
      Person person = iterator.next();
      if (person.getEducation() == education) {
        System.out.println(person);
      }
    }
  }

}