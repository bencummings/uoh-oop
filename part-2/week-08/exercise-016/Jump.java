import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Jump implements Comparable<Jump> {

  private int length;
  private Random random;
  private ArrayList<Integer> scores;
  private ArrayList<Integer> scoresFiltered;

  public Jump(ArrayList<Judge> judges) {
    this(60, 120, judges);
  }

  public Jump(int lengthMin, int lengthMax, ArrayList<Judge> judges) {
    random = new Random();
    length = random.nextInt((lengthMax + 1) - lengthMin) + lengthMin;
    scores = generateScores(judges);
    scoresFiltered = filterScores();
  }

  private ArrayList<Integer> generateScores(ArrayList<Judge> judges) {
    ArrayList<Integer> scores = new ArrayList<Integer>();
    for (Judge judge : judges) {
      scores.add(judge.generateScore());
    }
    return scores;
  }

  private ArrayList<Integer> filterScores() {
    ArrayList<Integer> scoresFiltered = new ArrayList<Integer>();
    for (Integer score : scores) {
      scoresFiltered.add(score);
    }
    if (scoresFiltered.size() > 2) {
      scoresFiltered.remove(Collections.min(scoresFiltered));
      scoresFiltered.remove(Collections.max(scoresFiltered));
    }
    return scoresFiltered;
  }

  public int getLength() {
    return length;
  }

  public ArrayList<Integer> getScores() {
    return scores;
  }

  public ArrayList<Integer> getFilteredScores() {
    return scoresFiltered;
  }

  public int getTotal() {
    int total = length;
    for (Integer score : scoresFiltered) {
      total += score;
    }
    return total;
  }

  @Override
  public int compareTo(Jump other) {
    return getTotal() - other.getTotal();
  }

  @Override
  public String toString() {
    return "Jump's Total Score: " + getTotal();
  }

}