public class Accounts {

  public static void main(String[] args) {
    Account ben = new Account("Ben's account", 100);
    ben.deposit(20);
    System.out.println(ben);
  }

}