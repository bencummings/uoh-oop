public class Main {

  public static void main(String[] args) {
    CashRegister cashRegister = new CashRegister();
    LyyraCard customerCard = new LyyraCard(20);

    System.out.println("The cash register status is:");
    System.out.println(cashRegister);
    System.out.println();

    cashRegister.payEconomical(10);
    cashRegister.payGourmet(5);
    cashRegister.payEconomical(customerCard);
    cashRegister.payGourmet(customerCard);

    System.out.println("The cash register status is:");
    System.out.println(cashRegister);
    System.out.println();
  }

}