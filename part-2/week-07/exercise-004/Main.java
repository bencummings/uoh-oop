public class Main {

  public static void main(String[] args) {
    Container container = new Container(1000);
    addSuitcasesFullOfBricks(container);
    System.out.println("The container has the following contents: " + container);
  }

  public static void addSuitcasesFullOfBricks(Container container) {
    int suitcaseQuantity = 100;
    int brickWeight = 1;
    for (int i = 0; i < suitcaseQuantity; i++) {
      Suitcase suitcase = new Suitcase(brickWeight);
      suitcase.addThing(new Thing("Brick", brickWeight));
      container.addSuitcase(suitcase);
      brickWeight++;
    }
  }

}