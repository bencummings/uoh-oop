package farmsimulator;

import java.util.Collection;

public class Barn {

  private BulkTank tank;
  private MilkingRobot robot;

  public Barn(BulkTank tank) {
    this.tank = tank;
  }

  public BulkTank getBulkTank() {
    return tank;
  }

  public void installMilkingRobot(MilkingRobot robot) {
    robot.setBulkTank(tank);
    this.robot = robot;
  }

  public void takeCareOf(Cow cow) throws IllegalStateException {
    try {
      robot.milk(cow);
    } catch (NullPointerException e) {
      throw new IllegalStateException("The MilkingRobot hasn't been installed.");
    }
  }

  public void takeCareOf(Collection<Cow> cows) {
    for (Cow cow : cows) {
      takeCareOf(cow);
    }
  }

  @Override
  public String toString() {
    return tank.toString();
  }

}