import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator<Card> {

  @Override
  public int compare(Card first, Card second) {
    if (first.getSuit() == second.getSuit()) {
      return first.getValue() - second.getValue();
    } else {
      return first.getSuit() - second.getSuit();
    }
  }

}