import java.util.ArrayList;

public class Suitcase {

  private ArrayList<Thing> things;
  private int weightLimit;

  public Suitcase(int weightLimit) {
    things = new ArrayList<Thing>();
    this.weightLimit = weightLimit;
  }

  public void addThing(Thing thing) {
    if ((totalWeight() + thing.getWeight()) <= weightLimit) {
      things.add(thing);
    }
  }

  public int totalWeight() {
    int weightCurrent = 0;
    for (Thing thing : things) {
      weightCurrent += thing.getWeight();
    }
    return weightCurrent;
  }

  public Thing heaviestThing() {
    if (things.size() > 0) {
      Thing heaviest = things.get(0);
      for (int i = 1; i < things.size(); i++) {
        if (things.get(i).getWeight() > heaviest.getWeight()) {
          heaviest = things.get(i);
        }
      }
      return heaviest;
    }
    return null;
  }

  public void printThings() {
    for (Thing thing : things) {
      System.out.println(thing);
    }
  }

  @Override
  public String toString() {
    String output = "";
    if (things.size() == 0) {
      output += "empty";
    } else if (things.size() == 1) {
      output += "1 thing";
    } else {
      output += things.size() + " things";
    }
    output += " (" + totalWeight() + " kg)";
    return output;
  }

}