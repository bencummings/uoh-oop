package application;

import java.util.Random;

public class Thermometer implements Sensor {

  private boolean isOn;
  private Random random;

  public Thermometer() {
    isOn = false;
    random = new Random();
  }

  @Override
  public boolean isOn() {
    return isOn;
  }

  @Override
  public void on() {
    isOn = true;
  }

  @Override
  public void off() {
    isOn = false;
  }

  @Override
  public int measure() {
    if (isOn) {
      return random.nextInt(61) - 30; // Range: -30 to 30.
    } else {
      throw new IllegalStateException("The sensor must be on to perform a measurement.");
    }
  }

}