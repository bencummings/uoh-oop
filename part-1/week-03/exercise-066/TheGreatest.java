import java.util.ArrayList;

public class TheGreatest {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(2);
    list.add(7);
    list.add(2);
    System.out.println("The greatest number is: " + greatest(list));
  }

  public static int greatest(ArrayList<Integer> list) {
    int greatest = list.get(0);
    int i = 1;
    while (i < list.size()) {
      if (list.get(i) > greatest) {
        greatest = list.get(i);
      }
      i++;
    }
    return greatest;
  }

}