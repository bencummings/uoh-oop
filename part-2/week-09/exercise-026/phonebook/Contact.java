package phonebook;

import java.util.HashSet;
import java.util.Set;

public class Contact implements Comparable<Contact> {

  private Set<String> addresses;
  private String name;
  private Set<String> numbers;

  public Contact(String name) {
    addresses = new HashSet<String>();
    this.name = name;
    numbers = new HashSet<String>();
  }

  public void addAddress(String address) {
    addresses.add(address);
  }

  public void addNumber(String number) {
    numbers.add(number);
  }

  public Set<String> getAddresses() {
    return addresses;
  }

  public String getName() {
    return name;
  }

  public Set<String> getNumbers() {
    return numbers;
  }

  @Override
  public int compareTo(Contact other) {
    return name.compareTo(other.name);
  }

  @Override
  public String toString() {
    return name;
  }

}