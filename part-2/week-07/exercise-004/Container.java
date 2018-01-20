import java.util.ArrayList;

public class Container {

  private ArrayList<Suitcase> suitcases;
  private int weightLimit;

  public Container(int weightLimit) {
    suitcases = new ArrayList<Suitcase>();
    this.weightLimit = weightLimit;
  }

  public void addSuitcase(Suitcase suitcase) {
    if ((totalWeight() + suitcase.totalWeight()) <= weightLimit) {
      suitcases.add(suitcase);
    }
  }

  public int totalWeight() {
    int weightCurrent = 0;
    for (Suitcase suitcase : suitcases) {
      weightCurrent += suitcase.totalWeight();
    }
    return weightCurrent;
  }

  public void printThings() {
    for (Suitcase suitcase : suitcases) {
      suitcase.printThings();
    }
  }

  @Override
  public String toString() {
    String output = "";
    if (suitcases.size() == 0) {
      output += "empty";
    } else if (suitcases.size() == 1) {
      output += "1 suitcase";
    } else {
      output += suitcases.size() + " suitcases";
    }
    output += " (" + totalWeight() + " kg)";
    return output;
  }

}