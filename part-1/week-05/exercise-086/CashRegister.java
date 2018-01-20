public class CashRegister {

  private double cashInRegister;
  private final float economicalPrice;
  private int economicalSold;
  private final float gourmetPrice;
  private int gourmetSold;

  public CashRegister() {
    cashInRegister = 1000D;
    economicalPrice = 2.5F;
    gourmetPrice = 4F;
  }

  public double payEconomical(double cashGiven) {
    return payCash(cashGiven, economicalPrice, false);
  }

  public boolean payEconomical(LyyraCard card) {
    return payCard(card, economicalPrice, false);
  }

  public double payGourmet(double cashGiven) {
    return payCash(cashGiven, gourmetPrice, true);
  }

  public boolean payGourmet(LyyraCard card) {
    return payCard(card, gourmetPrice, true);
  }

  private double payCash(double cash, float price, boolean gourmet) {
    if (cash >= price) {
      if (gourmet) {
        gourmetSold++;
      } else {
        economicalSold++;
      }
      cashInRegister += price;
      return cash - price;
    }
    return cash;
  }

  private boolean payCard(LyyraCard card, float price, boolean gourmet) {
    if (card.balance() >= price) {
      if (gourmet) {
        gourmetSold++;
      } else {
        economicalSold++;
      }
      card.pay(price);
      return true;
    }
    return false;
  }

  public void loadMoneyToCard(LyyraCard card, double amount) {
    if (amount >= 0) {
      cashInRegister += amount;
      card.loadMoney(amount);
    }
  }

  @Override
  public String toString() {
    return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
  }

}