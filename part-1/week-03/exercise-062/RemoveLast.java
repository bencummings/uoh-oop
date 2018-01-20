import java.util.ArrayList;
import java.util.Collections;

public class RemoveLast {

  public static void main(String[] args) {
    ArrayList<String> people = new ArrayList<String>();
    people.add("Pekka");
    people.add("James");
    people.add("Liz");
    people.add("Brian");
    System.out.println("People:");
    System.out.println(people);
    Collections.sort(people);
    removeLast(people);
    System.out.println(people);
  }

  public static void removeLast(ArrayList<String> list) {
    list.remove(list.size() - 1);
  }

}