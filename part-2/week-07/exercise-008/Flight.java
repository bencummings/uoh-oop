public class Flight {

  private Airplane airplane;
  private String origin;
  private String destination;

  public Flight(Airplane airplane, String origin, String destination) {
    this.airplane = airplane;
    this.origin = origin.toLowerCase();
    this.destination = destination.toLowerCase();
  }

  @Override
  public String toString() {
    return airplane + " (" + origin.toUpperCase() + "-" + destination.toUpperCase() + ")";
  }

}