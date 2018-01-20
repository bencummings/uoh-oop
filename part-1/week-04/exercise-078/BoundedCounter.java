public class BoundedCounter {

  private int currentValue;
  private int upperValue;

  public BoundedCounter(int upperValue) {
    currentValue = 0;
    this.upperValue = upperValue;
  }

  public int getValue() {
    return currentValue;
  }

  public void setValue(int currentValue) {
    if (currentValue >= 0 && currentValue <= upperValue) {
      this.currentValue = currentValue;
    }
  }

  public void next() {
    currentValue++;
    if (currentValue > upperValue) {
      currentValue = 0;
    }
  }

  @Override
  public String toString() {
    String output = Integer.toString(currentValue);
    if (currentValue < 10) {
      output = "0" + output;
    }
    return output;
  }

}