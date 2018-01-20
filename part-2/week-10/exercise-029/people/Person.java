package people;

public class Person {

  private String name;
  private String address;

  public Person(String name, String address) {
    this.name = name;
    this.address = address;
  }

  protected String generateWhitespace(int amount) {
    String output = "";
    for (int i = 0; i < amount; i++) {
      output += " ";
    }
    return output;
  }

  @Override
  public String toString() {
    return name + "\n" + generateWhitespace(2) + address + "\n";
  }

}