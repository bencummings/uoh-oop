public class Bird {

  private String name;
  private String latinName;
  private int ringingYear;

  public Bird(String name, String latinName, int ringingYear) {
    this.name = name;
    this.latinName = latinName;
    this.ringingYear = ringingYear;
  }

  @Override
  public boolean equals(Object object) {
    if (object != null && object instanceof Bird) {
      Bird other = (Bird) object;
      if (latinName.equals(other.latinName) && ringingYear == other.ringingYear) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int hashCode() {
    return latinName.hashCode() + ringingYear;
  }

  @Override
  public String toString() {
    return latinName + " (" + ringingYear + ")";
  }

}