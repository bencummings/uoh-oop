package containers;

public class ProductContainerRecorder extends ProductContainer {

  private ContainerHistory volumeHistory;

  public ProductContainerRecorder(String name, double capacity, double volume) {
    super(name, capacity);
    volumeHistory = new ContainerHistory();
    addToTheContainer(volume);
  }

  @Override
  public void addToTheContainer(double amount) {
    super.addToTheContainer(amount);
    volumeHistory.add(super.getVolume());
  }

  public String history() {
    return volumeHistory.toString();
  }

  public void printAnalysis() {
    System.out.println("Product: " + getName());
    System.out.println("History: " + volumeHistory);
    System.out.println("Greatest product amount: " + volumeHistory.maxValue());
    System.out.println("Smallest product amount: " + volumeHistory.minValue());
    System.out.println("Average: " + volumeHistory.average());
    System.out.println("Greatest change: " + volumeHistory.greatestFluctuation());
    System.out.println("Variance: " + volumeHistory.variance());
  }

  @Override
  public double takeFromTheContainer(double amount) {
    amount = super.takeFromTheContainer(amount);
    volumeHistory.add(super.getVolume());
    return amount;
  }

}