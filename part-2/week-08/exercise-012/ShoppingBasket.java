import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {

  private List<Purchase> purchases;

  public ShoppingBasket() {
    purchases = new ArrayList<Purchase>();
  }

  public void add(String product, int price) {
    product = product.toLowerCase();
    int purchaseIndex = getIndex(product);
    if (purchaseIndex == -1) {
      purchases.add(new Purchase(product, 1, price));
    } else {
      purchases.get(purchaseIndex).increaseAmount();
    }
  }

  private int getIndex(String product) {
    for (int i = 0; i < purchases.size(); i++) {
      if (purchases.get(i).name().equals(product)) {
        return i;
      }
    }
    return -1;
  }

  public int price() {
    int total = 0;
    for (Purchase purchase : purchases) {
      total += purchase.price();
    }
    return total;
  }

  public void print() {
    for (Purchase purchase : purchases) {
      System.out.println(purchase);
    }
  }

}