package boxes;

import java.util.HashSet;
import java.util.Set;

public class MaxWeightBox extends Box {

  private int maximumWeight;
  private Set<Thing> things;

  public MaxWeightBox(int maximumWeight) {
    this.maximumWeight = maximumWeight;
    things = new HashSet<Thing>();
  }

  @Override
  public void add(Thing thing) {
    if ((getCurrentWeight() + thing.getWeight()) <= maximumWeight) {
      things.add(thing);
    }
  }

  private int getCurrentWeight() {
    int total = 0;
    for (Thing thing : things) {
      total += thing.getWeight();
    }
    return total;
  }

  @Override
  public boolean isInTheBox(Thing thing) {
    return things.contains(thing);
  }

}