import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {

  private Map<String, Integer> prices;
  private Map<String, Integer> stock;

  public Storehouse() {
    prices = new HashMap<String, Integer>();
    stock = new HashMap<String, Integer>();
  }

  public void addProduct(String product, int price, int stock) {
    product = product.toLowerCase();
    prices.put(product, price);
    this.stock.put(product, stock);
  }

  public boolean take(String product) {
    product = product.toLowerCase();
    if (stock.containsKey(product) && stock.get(product) > 0) {
      stock.put(product, stock.get(product) - 1);
      return true;
    }
    return false;
  }

  public int price(String product) {
    product = product.toLowerCase();
    if (prices.containsKey(product)) {
      return prices.get(product);
    }
    return -99;
  }

  public int stock(String product) {
    product = product.toLowerCase();
    if (stock.containsKey(product)) {
      return stock.get(product);
    }
    return 0;
  }

  public Set<String> products() {
    return stock.keySet();
  }

}