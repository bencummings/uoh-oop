package containers;

import java.util.ArrayList;
import java.util.List;

public class ContainerHistory {

  private List<Double> volumeHistory;

  public ContainerHistory() {
    volumeHistory = new ArrayList<Double>();
  }

  public void add(double volume) {
    volumeHistory.add(volume);
  }

  public double average() {
    if (!volumeHistory.isEmpty()) {
      double total = 0;
      for (Double volume : volumeHistory) {
        total += volume;
      }
      return (total / volumeHistory.size());
    }
    return 0;
  }

  public double greatestFluctuation() {
    if (volumeHistory.size() > 1) {
      double max = Math.abs(volumeHistory.get(1) - volumeHistory.get(0));
      for (int i = 1; i < (volumeHistory.size() - 1); i++) {
        double current = Math.abs(volumeHistory.get(i + 1) - volumeHistory.get(i));
        if (current > max) {
          max = current;
        }
      }
      return max;
    }
    return 0;
  }

  public double maxValue() {
    if (!volumeHistory.isEmpty()) {
      double max = volumeHistory.get(0);
      for (int i = 1; i < volumeHistory.size(); i++) {
        if (volumeHistory.get(i) > max) {
          max = volumeHistory.get(i);
        }
      }
      return max;
    }
    return 0;
  }

  public double minValue() {
    if (!volumeHistory.isEmpty()) {
      double min = volumeHistory.get(0);
      for (int i = 1; i < volumeHistory.size(); i++) {
        if (volumeHistory.get(i) < min) {
          min = volumeHistory.get(i);
        }
      }
      return min;
    }
    return 0;
  }

  public void reset() {
    volumeHistory.clear();
  }

  public double variance() {
    if (volumeHistory.size() > 1) {
      double average = average();
      double total = 0;
      for (Double volume : volumeHistory) {
        total += Math.pow((volume - average), 2);
      }
      return total / (volumeHistory.size() - 1);
    }
    return 0;
  }

  @Override
  public String toString() {
    return volumeHistory.toString();
  }

}