public class Counter {

  private int number;
  private boolean check;

  public Counter() {
    this(0, false);
  }

  public Counter(int startingValue) {
    this(startingValue, false);
  }

  public Counter(boolean check) {
    this(0, check);
  }

  public Counter(int startingValue, boolean check) {
    number = startingValue;
    this.check = check;
  }

  public void increase() {
    increase(1);
  }

  public void increase(int increaseAmount) {
    if (increaseAmount >= 0) {
      number += increaseAmount;
    }
  }

  public void decrease() {
    decrease(1);
  }

  public void decrease(int decreaseAmount) {
    if (decreaseAmount >= 0) {
      number -= decreaseAmount;
      if (number < 0 && check) {
        number = 0;
      }
    }
  }

  public int value() {
    return number;
  }

}