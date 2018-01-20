import java.util.ArrayList;
import java.util.Collections;

public class SmartCombining {

  public static void main(String[] args) {
    ArrayList<Integer> listOne = new ArrayList<Integer>();
    ArrayList<Integer> listTwo = new ArrayList<Integer>();
    Collections.addAll(listOne, 4, 3);
    Collections.addAll(listTwo, 5, 10, 4, 3, 7);
    smartCombine(listOne, listTwo);
    System.out.println(listOne);
    System.out.println(listTwo);
  }

  public static void smartCombine(ArrayList<Integer> listOne, ArrayList<Integer> listTwo) {
    for (int item : listTwo) {
      if (!listOne.contains(item)) {
        listOne.add(item);
      }
    }
  }

}