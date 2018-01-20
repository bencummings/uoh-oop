package moving;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Item;
import moving.domain.Thing;
import moving.logic.Packer;

public class Main {

  public static void main(String[] args) {
    List<Thing> things = new ArrayList<Thing>();

    things.add(new Item("Book", 3));
    things.add(new Item("Computer", 7));
    things.add(new Item("Phone", 1));

    Packer packer = new Packer(8);

    List<Box> boxes = packer.packThings(things);

    System.out.println(boxes.size() + " boxes were packed.");

    for (Box box : boxes) {
      System.out.println(box);
    }
  }

}