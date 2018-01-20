public class LyyraCard {

  private double balance;

  public LyyraCard(double balance) {
    this.balance = balance;
  }

  public void loadMoney(double amount) {
    if (amount > 0) {
      if (balance + amount > 150) {
        balance = 150;
      } else {
        balance += amount;
      }
    }
  }

  public void payEconomical() {
    makePayment(2.5);
  }

  public void payGourmet() {
    makePayment(4);
  }

  public void makePayment(double cost) {
    if (balance - cost >= 0) {
      balance -= cost;
    }
  }

  @Override
  public String toString() {
    return "The card has " + balance + " euros";
  }

}