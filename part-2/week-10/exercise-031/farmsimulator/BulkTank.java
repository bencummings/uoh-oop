package farmsimulator;

public class BulkTank {

  private double capacity;
  private double volume;

  public BulkTank() {
    this(2000);
  }

  public BulkTank(double capacity) {
    this.capacity = capacity;
    volume = 0;
  }

  public void addToTank(double amount) {
    if (amount > 0) {
      if (amount < howMuchFreeSpace()) {
        volume += amount;
      } else {
        volume = capacity;
      }
    }
  }

  public double getCapacity() {
    return capacity;
  }

  public double getFromTank(double amount) {
    if (amount > 0) {
      if (amount > volume) {
        amount = volume;
        volume = 0;
      } else {
        volume -= amount;
      }
      return amount;
    }
    return 0;
  }

  public double getVolume() {
    return volume;
  }

  public double howMuchFreeSpace() {
    return capacity - volume;
  }

  @Override
  public String toString() {
    return Math.ceil(volume) + "/" + Math.ceil(capacity);
  }

}