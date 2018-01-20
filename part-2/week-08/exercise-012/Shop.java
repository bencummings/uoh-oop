import java.util.Scanner;

public class Shop {

  private Storehouse store;
  private Scanner scanner;

  public Shop(Storehouse store, Scanner scanner) {
    this.store = store;
    this.scanner = scanner;
  }

  public void manage(String customer) {
    ShoppingBasket basket = new ShoppingBasket();

    System.out.println("Welcome to our shop, " + customer + "!");
    System.out.println("Our sales offers are as follows:");

    for (String product : store.products()) {
      System.out.println(product);
    }

    while (true) {
      System.out.print("What would you like to purchase? ");
      String product = scanner.nextLine();

      if (product.isEmpty()) {
        break;
      } else if (store.take(product)) {
        basket.add(product, store.price(product));
      }
    }

    System.out.println("Your purchases are as follows:");
    basket.print();
    System.out.println("The basket cost is $" + basket.price());
  }

}