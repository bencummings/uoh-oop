public class Main {

  public static void main(String[] args) {
    Hand pokerHand = new Hand();

    pokerHand.add(new Card(14, Card.CLUBS));
    pokerHand.add(new Card(9, Card.DIAMONDS));
    pokerHand.add(new Card(14, Card.DIAMONDS));
    pokerHand.add(new Card(10, Card.HEARTS));
    pokerHand.add(new Card(2, Card.SPADES));

    System.out.println();
    System.out.println("Unsorted Cards:");
    pokerHand.print();

    pokerHand.sort();

    System.out.println();
    System.out.println("Sorted Cards (Value):");
    pokerHand.print();

    pokerHand.sortAgainstSuit();

    System.out.println();
    System.out.println("Sorted Cards (Suit):");
    pokerHand.print();
  }

}