package clicker.applicationlogic;

public class PersonalCalculator implements Calculator {

  private int count;

  public PersonalCalculator() {
    count = 0;
  }

  @Override
  public int giveValue() {
    return count;
  }

  @Override
  public void increase() {
    count++;
  }

}