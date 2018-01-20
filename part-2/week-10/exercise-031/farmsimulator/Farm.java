package farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Farm implements Alive {

  private String owner;
  private Barn barn;
  private List<Cow> cows;

  public Farm(String owner, Barn barn) {
    this.owner = owner;
    this.barn = barn;
    cows = new ArrayList<Cow>();
  }

  public void addCow(Cow cow) {
    cows.add(cow);
  }

  public String getOwner() {
    return owner;
  }

  public void installMilkingRobot(MilkingRobot robot) {
    barn.installMilkingRobot(robot);
  }

  public void manageCows() {
    barn.takeCareOf(cows);
  }

  @Override
  public void liveHour() {
    for (Cow cow : cows) {
      cow.liveHour();
    }
  }

  @Override
  public String toString() {
    String output = "Farm owner: " + owner + "\n" + "Barn bulk tank: " + barn.getBulkTank() + "\n";
    if (!cows.isEmpty()) {
      output += "Animals:" + "\n";
      for (Cow cow : cows) {
        output += Utilities.generateWhitespace(8) + cow + "\n";
      }
    } else {
      output += "No cows." + "\n";
    }
    return output;
  }

}