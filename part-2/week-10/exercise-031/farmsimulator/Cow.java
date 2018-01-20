package farmsimulator;

import java.util.Random;

public class Cow implements Alive, Milkable {

  private Random random;
  private String name;
  private double capacity;
  private double volume;

  public Cow() {
    this("");
  }

  public Cow(String name) {
    random = new Random();
    if (name.isEmpty()) {
      this.name = generateName();
    } else {
      this.name = name;
    }
    capacity = random.nextInt(26) + 15; // Range: 15-40.
    volume = 0;
  }

  private String generateName() {
    String[] names = {
      "Anu",
      "Arpa",
      "Essi",
      "Heluna",
      "Hely",
      "Hento",
      "Hilke",
      "Hilsu",
      "Hymy",
      "Ihq",
      "Ilme",
      "Ilo",
      "Jaana",
      "Jami",
      "Jatta",
      "Laku",
      "Liekki",
      "Mainikki",
      "Mella",
      "Mimmi",
      "Naatti",
      "Nina",
      "Nyytti",
      "Papu",
      "Pullukka",
      "Pulu",
      "Rima",
      "Soma",
      "Sylkki",
      "Valpu",
      "Virpi"
    };
    return names[random.nextInt(names.length)];
  }

  public double getAmount() {
    return volume;
  }

  public double getCapacity() {
    return capacity;
  }

  public String getName() {
    return name;
  }

  @Override
  public void liveHour() {
    double milk = (random.nextInt(14) + 7) / 10.0; // Range 0.7-2.0.
    if ((milk + volume) < capacity) {
      volume += milk;
    } else {
      volume = capacity;
    }
  }

  @Override
  public double milk() {
    double milk = volume;
    volume = 0;
    return milk;
  }

  @Override
  public String toString() {
    return name + " " + Math.ceil(volume) + "/" + Math.ceil(capacity);
  }

}