package reference.domain;

public class Person {

  private String name;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object object) {
    if (object != null && object instanceof Person) {
      Person other = (Person) object;
      if (name.equals(other.name)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int hashCode() {
    return name.hashCode();
  }

  @Override
  public String toString() {
    return name;
  }

}