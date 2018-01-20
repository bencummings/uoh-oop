import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {

  private ArrayList<Card> cards;

  public Hand() {
    cards = new ArrayList<Card>();
  }

  public void add(Card card) {
    cards.add(card);
  }

  public void print() {
    for (Card card : cards) {
      System.out.println(card);
    }
  }

  public void sort() {
    Collections.sort(cards);
  }

  public void sortAgainstSuit() {
    Collections.sort(cards, new SortAgainstSuitAndValue());
  }

  @Override
  public int compareTo(Hand other) {
    return getValue() - other.getValue();
  }

  private int getValue() {
    int total = 0;
    for (Card card : cards) {
      total += card.getValue();
    }
    return total;
  }

}