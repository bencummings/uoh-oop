package phonebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PhoneBook {

  private Map<String, Contact> contactNames;
  private Map<String, Set<Contact>> contactNumbers;
  private Scanner scanner;

  public PhoneBook() {
    contactNames = new HashMap<String, Contact>();
    contactNumbers = new HashMap<String, Set<Contact>>();
    scanner = new Scanner(System.in);
  }

  private void addAddress(String name, String address) {
    if (!contactNames.containsKey(name)) {
      contactNames.put(name, new Contact(name));
    }
    contactNames.get(name).addAddress(address);
  }

  private void addNumber(String name, String number) {
    if (!contactNames.containsKey(name)) {
      contactNames.put(name, new Contact(name));
    }
    contactNames.get(name).addNumber(number);

    if (!contactNumbers.containsKey(number)) {
      contactNumbers.put(number, new HashSet<Contact>());
    }
    contactNumbers.get(number).add(contactNames.get(name));
  }

  private void deleteContact(String name) {
    if (contactNames.containsKey(name)) {
      for (String number : contactNames.get(name).getNumbers()) {
        contactNumbers.get(number).remove(contactNames.get(name));
        if (contactNumbers.get(number).isEmpty()) {
          contactNumbers.remove(number);
        }
      }
      contactNames.remove(name);
    }
  }

  private List<Contact> filterContacts(String keyword) {
    List<Contact> filteredContacts = new ArrayList<Contact>();
    for (Contact contact : contactNames.values()) {
      if (contact.getName().contains(keyword) || searchSet(contact.getAddresses(), keyword) || searchSet(contact.getNumbers(), keyword)) {
        filteredContacts.add(contact);
      }
    }
    return filteredContacts;
  }

  private void inputDeleteInfo() {
    System.out.print("whose information: ");
    String name = Utilities.sanitiseString(scanner.nextLine());
    deleteContact(name);
  }

  private void inputEnterAddress() {
    System.out.print("whose address: ");
    String name = Utilities.sanitiseString(scanner.nextLine());
    System.out.print("street: ");
    String street = Utilities.sanitiseString(scanner.nextLine());
    System.out.print("city: ");
    String city = Utilities.sanitiseString(scanner.nextLine());
    addAddress(name, street + " " + city);
  }

  private void inputEnterNumber() {
    System.out.print("whose number: ");
    String name = Utilities.sanitiseString(scanner.nextLine());
    System.out.print("number: ");
    String number = Utilities.sanitiseString(scanner.nextLine());
    addNumber(name, number);
  }

  private void inputSearchByName() {
    System.out.print("whose number: ");
    String name = Utilities.sanitiseString(scanner.nextLine());
    if (contactNames.containsKey(name)) {
      Set<String> numbers = contactNames.get(name).getNumbers();
      if (!numbers.isEmpty()) {
        printSet(numbers, 2, '\n');
      } else {
        System.out.println(Utilities.generateWhitespace(2) + "phone number not found");
      }
    } else {
      System.out.println(Utilities.generateWhitespace(2) + "not found");
    }
  }

  private void inputSearchByNumber() {
    System.out.print("number: ");
    String number = Utilities.sanitiseString(scanner.nextLine());
    if (contactNumbers.containsKey(number)) {
      printSet(contactNumbers.get(number), 2, '\n');
    } else {
      System.out.println(Utilities.generateWhitespace(2) + "not found");
    }
  }

  private void inputSearchContacts() {
    System.out.print("keyword (if empty, all listed): ");
    String keyword = Utilities.sanitiseString(scanner.nextLine());
    List<Contact> contacts = filterContacts(keyword);
    if (!contacts.isEmpty()) {
      Collections.sort(contacts);
      for (Contact contact : contacts) {
        System.out.println();
        System.out.println(Utilities.generateWhitespace(2) + contact.getName());
        Set<String> addresses = contact.getAddresses();
        if (!addresses.isEmpty()) {
          System.out.print(Utilities.generateWhitespace(4) + "address:");
          printSet(addresses, 1, ',');
        } else {
          System.out.println(Utilities.generateWhitespace(4) + "address unknown");
        }
        Set<String> numbers = contact.getNumbers();
        if (!numbers.isEmpty()) {
          System.out.println(Utilities.generateWhitespace(4) + "phone numbers:");
          printSet(numbers, 6, '\n');
        } else {
          System.out.println(Utilities.generateWhitespace(4) + "phone number not found");
        }
      }
    } else {
      System.out.println(Utilities.generateWhitespace(2) + "keyword not found");
    }
  }

  private void inputSearchInfo() {
    System.out.print("whose information: ");
    String name = Utilities.sanitiseString(scanner.nextLine());
    if (contactNames.containsKey(name)) {
      Set<String> addresses = contactNames.get(name).getAddresses();
      if (!addresses.isEmpty()) {
        System.out.print(Utilities.generateWhitespace(2) + "address:");
        printSet(addresses, 1, ',');
      } else {
        System.out.println(Utilities.generateWhitespace(2) + "address unknown");
      }
      Set<String> numbers = contactNames.get(name).getNumbers();
      if (!numbers.isEmpty()) {
        System.out.println(Utilities.generateWhitespace(2) + "phone numbers:");
        printSet(numbers, 4, '\n');
      } else {
        System.out.println(Utilities.generateWhitespace(2) + "phone number not found");
      }
    } else {
      System.out.println(Utilities.generateWhitespace(2) + "not found");
    }
  }

  public void manage() {
    while (true) {
      System.out.println();
      System.out.print("command: ");
      String command = Utilities.sanitiseString(scanner.nextLine());
      if (command.equals("x")) {
        break;
      } else if (command.equals("1")) {
        inputEnterNumber();
      } else if (command.equals("2")) {
        inputSearchByName();
      } else if (command.equals("3")) {
        inputSearchByNumber();
      } else if (command.equals("4")) {
        inputEnterAddress();
      } else if (command.equals("5")) {
        inputSearchInfo();
      } else if (command.equals("6")) {
        inputDeleteInfo();
      } else if (command.equals("7")) {
        inputSearchContacts();
      }
    }
  }

  public void menu() {
    System.out.println("phone search");
    System.out.println("available operations:");
    System.out.println(" 1 add a number");
    System.out.println(" 2 search for a number");
    System.out.println(" 3 search for a person by phone number");
    System.out.println(" 4 add an address");
    System.out.println(" 5 search for personal information");
    System.out.println(" 6 delete personal information");
    System.out.println(" 7 filtered listing");
    System.out.println(" x quit");
  }

  private <T> void printList(List<T> list, int whitespace, char delimiter) {
    String output = "";
    for (int i = 0; i < list.size(); i++) {
      output += Utilities.generateWhitespace(whitespace) + list.get(i);
      if (i != (list.size() - 1)) {
        output += delimiter;
      }
    }
    System.out.println(output);
  }

  private <T> void printSet(Set<T> set, int whitespace, char delimiter) {
    printList(new ArrayList<T>(set), whitespace, delimiter);
  }

  private boolean searchSet(Set<String> set, String keyword) {
    for (String value : set) {
      if (value.contains(keyword)) {
        return true;
      }
    }
    return false;
  }

}