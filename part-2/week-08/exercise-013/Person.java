public class Person implements Comparable<Person> {

  private String name;
  private int salary;

  public Person(String name, int salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public int getSalary() {
    return salary;
  }

  @Override
  public String toString() {
    return name + " " + salary;
  }

  @Override
  public int compareTo(Person other) {
    return other.getSalary() - salary;
  }

}