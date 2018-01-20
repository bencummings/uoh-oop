package containers;

public class Container {

  private double capacity;
  private double volume;

  public Container(double capacity) {
    if (capacity > 0) {
      this.capacity = capacity;
    } else {
      this.capacity = 0;
    }
    volume = 0;
  }

  public double getVolume() {
    return volume;
  }

  public double getOriginalCapacity() {
    return capacity;
  }

  public double getCurrentCapacity() {
    return capacity - volume;
  }

  public void addToTheContainer(double amount) {
    if (amount > 0) {
      if (amount <= getCurrentCapacity()) {
        volume += amount;
      } else {
        volume = capacity;
      }
    }
  }

  public double takeFromTheContainer(double amount) {
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

  @Override
  public String toString() {
    return "volume = " + volume + ", free space " + getCurrentCapacity();
  }

}