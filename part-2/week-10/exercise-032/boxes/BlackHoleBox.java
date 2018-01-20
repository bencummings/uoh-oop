package boxes;

import java.util.HashSet;
import java.util.Set;

public class BlackHoleBox extends Box {

  private Set<Thing> things;

  public BlackHoleBox() {
    things = new HashSet<Thing>();
  }

  @Override
  public void add(Thing thing) {
    things.add(thing);
  }

  @Override
  public boolean isInTheBox(Thing thing) {
    return false;
  }

}