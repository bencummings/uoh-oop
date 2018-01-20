package farmsimulator;

public class Main {

  public static void main(String[] args) {
    Farm farm = new Farm("Ben", new Barn(new BulkTank()));

    farm.installMilkingRobot(new MilkingRobot());

    for (int i = 0; i < 6; i++) {
      farm.addCow(new Cow());
    }

    for (int i = 0; i < 12; i++) {
      farm.liveHour();
    }

    farm.manageCows();

    System.out.println(farm);
  }

}