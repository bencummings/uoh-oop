package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

  private ArrayList<Integer> measurements;
  private ArrayList<Sensor> sensors;

  public AverageSensor() {
    measurements = new ArrayList<Integer>();
    sensors = new ArrayList<Sensor>();
  }

  public void addSensor(Sensor sensor) {
    sensors.add(sensor);
  }

  public List<Integer> readings() {
    return measurements;
  }

  @Override
  public boolean isOn() {
    for (Sensor sensor : sensors) {
      if (!sensor.isOn()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public void on() {
    for (Sensor sensor : sensors) {
      sensor.on();
    }
  }

  @Override
  public void off() {
    for (Sensor sensor : sensors) {
      sensor.off();
    }
  }

  @Override
  public int measure() {
    if (isOn()) {
      if (sensors.isEmpty()) {
        return 0;
      } else {
        int result;
        int total = 0;
        for (Sensor sensor : sensors) {
          total += sensor.measure();
        }
        result = total / sensors.size();
        measurements.add(result);
        return result;
      }
    } else {
      throw new IllegalStateException("The sensor must be on to perform a measurement.");
    }
  }

}