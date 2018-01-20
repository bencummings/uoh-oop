package boxes;

public class Main {

  public static void main(String[] args) {
    BlackHoleBox bhb = new BlackHoleBox();
    bhb.add(new Thing("Keys", 3));
    System.out.println(bhb.isInTheBox(new Thing("Keys")));

    MaxWeightBox mwb = new MaxWeightBox(4);
    mwb.add(new Thing("Phone", 3));
    mwb.add(new Thing("Wallet", 2));
    System.out.println(mwb.isInTheBox(new Thing("Wallet")));

    OneThingBox otb = new OneThingBox();
    otb.add(new Thing("Watch", 2));
    otb.add(new Thing("Mints", 1));
    System.out.println(otb.isInTheBox(new Thing("Mints")));
  }

}