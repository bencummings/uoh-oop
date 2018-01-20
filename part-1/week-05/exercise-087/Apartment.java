public class Apartment {

  private int rooms;
  private int squareMeters;
  private int pricePerSquareMeter;

  public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
    this.rooms = rooms;
    this.squareMeters = squareMeters;
    this.pricePerSquareMeter = pricePerSquareMeter;
  }

  public boolean larger(Apartment other) {
    return squareMeters > other.squareMeters;
  }

  public int priceDifference(Apartment other) {
    return Math.abs((squareMeters * pricePerSquareMeter) - (other.squareMeters * other.pricePerSquareMeter));
  }

  public boolean moreExpensiveThan(Apartment other) {
    return (squareMeters * pricePerSquareMeter) > (other.squareMeters * other.pricePerSquareMeter);
  }

}