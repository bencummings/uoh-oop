package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {

  private List<Movable> movables;

  public Group() {
    movables = new ArrayList<Movable>();
  }

  public void addToGroup(Movable movable) {
    movables.add(movable);
  }

  @Override
  public void move(int x, int y) {
    for (Movable movable : movables) {
      movable.move(x, y);
    }
  }

  @Override
  public String toString() {
    String output = "";
    for (Movable movable : movables) {
      output += movable + "\n";
    }
    return output;
  }

}