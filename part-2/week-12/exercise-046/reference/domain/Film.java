package reference.domain;

public class Film {

  private String name;

  public Film(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object object) {
    if (object != null && object instanceof Film) {
      Film other = (Film) object;
      if (name.equals(other.name)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int hashCode() {
    return name.hashCode();
  }

  @Override
  public String toString() {
    return name;
  }

}