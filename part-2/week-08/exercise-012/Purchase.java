public class Purchase {

  private String product;
  private int amount;
  private int price;

  public Purchase(String product, int amount, int price) {
    this.product = product.toLowerCase();
    this.amount = amount;
    this.price = price;
  }

  public String name() {
    return product;
  }

  public int price() {
    return amount * price;
  }

  public void increaseAmount() {
    amount++;
  }

  @Override
  public String toString() {
    return product + ": " + amount;
  }

}