package moving.domain;

import java.util.ArrayList;

public class Box implements Thing {

  private int capacity;
  private ArrayList<Thing> things;

  public Box(int capacity) {
    this.capacity = capacity;
    things = new ArrayList<Thing>();
  }

  public boolean addThing(Thing thing) {
    if ((getVolume() + thing.getVolume()) <= capacity) {
      things.add(thing);
      return true;
    }
    return false;
  }

  @Override
  public int getVolume() {
    int total = 0;
    for (Thing thing : things) {
      total += thing.getVolume();
    }
    return total;
  }

  @Override
  public String toString() {
    return "The volume of the box is: " + getVolume() + " dm^3";
  }

}