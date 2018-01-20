package farmsimulator;

public class MilkingRobot {

  private BulkTank tank;

  public MilkingRobot() {
  }

  public BulkTank getBulkTank() {
    return tank;
  }

  public void setBulkTank(BulkTank tank) {
    this.tank = tank;
  }

  public void milk(Milkable milkable) throws IllegalStateException {
    try {
      tank.addToTank(milkable.milk());
    } catch (NullPointerException e) {
      throw new IllegalStateException("The MilkingRobot hasn't been installed.");
    }
  }

}