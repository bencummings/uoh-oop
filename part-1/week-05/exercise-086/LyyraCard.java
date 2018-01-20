public class LyyraCard {

  private double balance;

  public LyyraCard(double balance) {
    this.balance = balance;
  }

  public double balance() {
    return balance;
  }

  public void loadMoney(double amount) {
    if (amount >= 0) {
      balance += amount;
    }
  }

  public boolean pay(double amount) {
    if (balance >= amount) {
      balance -= amount;
      return true;
    }
    return false;
  }

}