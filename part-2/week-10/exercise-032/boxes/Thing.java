package boxes;

public class Thing {

  private String name;
  private int weight;

  public Thing(String name) {
    this(name, 0);
  }

  public Thing(String name, int weight) throws IllegalArgumentException {
    if (weight < 0) {
      throw new IllegalArgumentException("The weight cannot be negative.");
    }
    this.name = name;
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public int getWeight() {
    return weight;
  }

  @Override
  public boolean equals(Object object) {
    if (object != null && object instanceof Thing) {
      Thing other = (Thing) object;
      if (name.equalsIgnoreCase(other.name)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int hashCode() {
    return name.toLowerCase().hashCode();
  }

}