public class Main {

  public static void main(String[] args) {
    Phonebook phonebook = new Phonebook();

    phonebook.add("Jack", "02 9999 8888");
    phonebook.add("Jill", "02 8888 9999");

    System.out.println("The phonebook contains the following contacts:");
    phonebook.printAll();
  }

}