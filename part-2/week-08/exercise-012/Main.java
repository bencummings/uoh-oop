import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Storehouse golfStore = new Storehouse();

    golfStore.addProduct("Driver", 299, 20);
    golfStore.addProduct("Fairway Wood", 249, 10);
    golfStore.addProduct("Iron Set", 699, 5);
    golfStore.addProduct("Wedge Set", 199, 5);
    golfStore.addProduct("Putter", 149, 15);

    Shop golfShop = new Shop(golfStore, new Scanner(System.in));

    golfShop.manage("Ben");
  }

}