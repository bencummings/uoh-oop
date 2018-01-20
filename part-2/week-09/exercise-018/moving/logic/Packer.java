package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

public class Packer {

  private int boxVolume;

  public Packer(int boxVolume) {
    this.boxVolume = boxVolume;
  }

  public List<Box> packThings(List<Thing> things) {
    List<Box> boxes = new ArrayList<Box>();
    Box currentBox = new Box(boxVolume);
    for (Thing thing : things) {
      if (thing.getVolume() <= boxVolume) {
        if (!currentBox.addThing(thing)) {
          boxes.add(currentBox);
          currentBox = new Box(boxVolume);
          currentBox.addThing(thing);
        }
      }
    }
    if (currentBox.getVolume() > 0) {
      boxes.add(currentBox);
    }
    return boxes;
  }

}