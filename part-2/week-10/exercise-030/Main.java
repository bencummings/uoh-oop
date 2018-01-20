import containers.ProductContainerRecorder;

public class Main {

  public static void main(String[] args) {
    ProductContainerRecorder pcr = new ProductContainerRecorder("Juice", 500, 500);

    pcr.takeFromTheContainer(150);
    pcr.addToTheContainer(25);

    pcr.takeFromTheContainer(225);
    pcr.addToTheContainer(50);

    pcr.printAnalysis();
  }

}