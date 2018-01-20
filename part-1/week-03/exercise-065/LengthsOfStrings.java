import java.util.ArrayList;

public class LengthsOfStrings {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("Ciao");
    list.add("Moi");
    list.add("Benvenuto!");
    list.add("Badger Badger Badger Badger");
    ArrayList<Integer> lengths = lengths(list);
    System.out.println("The lengths of the strings: " + lengths);
  }

  public static ArrayList<Integer> lengths(ArrayList<String> list) {
    ArrayList<Integer> lengthList = new ArrayList<Integer>();
    for (String item : list) {
      lengthList.add(item.length());
    }
    return lengthList;
  }

}