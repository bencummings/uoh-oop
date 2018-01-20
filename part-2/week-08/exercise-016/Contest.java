import java.util.ArrayList;
import java.util.Collections;

public class Contest {

  private ArrayList<Contestant> contestants;
  private ArrayList<Judge> judges;
  private String name;
  private int rounds;

  public Contest(String name) {
    this(name, 5);
  }

  public Contest(String name, int judgeQuantity) {
    contestants = new ArrayList<Contestant>();
    judges = new ArrayList<Judge>();
    this.name = name;
    rounds = 1;
    addJudge(judgeQuantity);
  }

  private void addJudge(int judgeQuantity) {
    for (int i = 0; i < judgeQuantity; i++) {
      judges.add(new Judge());
    }
  }

  public void addContestant(String name) {
    contestants.add(new Contestant(name));
  }

  public ArrayList<Contestant> getContestants() {
    return contestants;
  }

  public void sortContestants(boolean reverse) {
    Collections.sort(contestants);
    if (reverse) {
      Collections.reverse(contestants);
    }
  }

  public void jump() {
    for (Contestant contestant : contestants) {
      contestant.jump(judges);
    }
    rounds++;
  }

  public String getName() {
    return name;
  }

  public int getRound() {
    return rounds;
  }

  @Override
  public String toString() {
    String names = "";
    for (int i = 0; i < contestants.size(); i++) {
      names += contestants.get(i).getName();
      if (i != (contestants.size() - 1)) {
        names += ", ";
      }
    }
    return "The contest has " + contestants.size() + " contestants (" + names + "} and " + judges.size() + " judges.";
  }

}