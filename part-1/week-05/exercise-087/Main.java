public class Main {

  public static void main(String[] args) {
    Apartment studioManhattan = new Apartment(1, 16, 5500);
    Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
    Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);

    System.out.println("Property comparison for a Manhattan Studio and a Brooklyn Apartment:");

    if (studioManhattan.larger(twoRoomsBrooklyn)) {
      System.out.println("The larger property is the Manhattan Studio.");
    } else {
      System.out.println("The larger property is the Brooklyn Apartment.");
    }

    if (studioManhattan.moreExpensiveThan(twoRoomsBrooklyn)) {
      System.out.println("The more expensive property is the Manhattan Studio.");
    } else {
      System.out.println("The more expensive property is the Brooklyn Apartment.");
    }

    System.out.println("The price difference is " + studioManhattan.priceDifference(twoRoomsBrooklyn) + ".");
  }

}