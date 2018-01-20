package tools;

public class Main {

  public static void main(String[] args) {
    PersonalDuplicateRemover pdr = new PersonalDuplicateRemover();

    pdr.add("apple");
    pdr.add("apple");
    pdr.add("banana");
    pdr.add("orange");

    System.out.println("Unique Words: " + pdr.getUniqueCharacterStrings());
    System.out.println("Duplicate Count: " + pdr.getNumberOfDetectedDuplicates());

    pdr.empty();

    System.out.println("Unique Words: " + pdr.getUniqueCharacterStrings());
    System.out.println("Duplicate Count: " + pdr.getNumberOfDetectedDuplicates());
  }

}