import application.AverageSensor;
import application.Thermometer;

public class Main {

  public static void main(String[] args) {
    AverageSensor sydney = new AverageSensor();

    for (int i = 0; i < 5; i++) {
      sydney.addSensor(new Thermometer());
    }

    sydney.on();

    for (int i = 0; i < 5; i++) {
      sydney.measure();
    }

    System.out.println("The temperature readings for Sydney were: " + sydney.readings());
  }

}