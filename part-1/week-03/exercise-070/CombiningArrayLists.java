import java.util.ArrayList;
import java.util.Collections;

public class CombiningArrayLists {

  public static void main(String[] args) {
    ArrayList<Integer> listOne = new ArrayList<Integer>();
    ArrayList<Integer> listTwo = new ArrayList<Integer>();
    Collections.addAll(listOne, 4, 3);
    Collections.addAll(listTwo, 5, 10, 7);
    combine(listOne, listTwo);
    System.out.println(listOne);
    System.out.println(listTwo);
  }

  public static void combine(ArrayList<Integer> listOne, ArrayList<Integer> listTwo) {
    for (int item : listTwo) {
      listOne.add(item);
    }
  }

}