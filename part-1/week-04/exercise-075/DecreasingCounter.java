public class DecreasingCounter {

  private int initialValue;
  private int value;

  public DecreasingCounter(int valueAtStart) {
    initialValue = valueAtStart;
    value = valueAtStart;
  }

  public void printValue() {
    System.out.println("value: " + value);
  }

  public void decrease() {
    if (value > 0) {
      value--;
    }
  }

  public void reset() {
    value = 0;
  }

  public void setInitial() {
    value = initialValue;
  }

}