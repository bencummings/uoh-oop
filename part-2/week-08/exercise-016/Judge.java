import java.util.ArrayList;
import java.util.Random;

public class Judge {

  private Random random;
  private ArrayList<Integer> scores;
  private int scoreMax;
  private int scoreMin;

  public Judge() {
    this(10, 20);
  }

  public Judge(int scoreMin, int scoreMax) {
    random = new Random();
    scores = new ArrayList<Integer>();
    this.scoreMin = scoreMin;
    this.scoreMax = scoreMax;
  }

  public int generateScore() {
    int score = random.nextInt((scoreMax + 1) - scoreMin) + scoreMin;
    scores.add(score);
    return score;
  }

  @Override
  public String toString() {
    String output = "Judge's Scores: ";
    for (int i = 0; i < scores.size(); i++) {
      output += scores.get(i);
      if (i != (scores.size() - 1)) {
        output += ", ";
      }
    }
    return output;
  }

}