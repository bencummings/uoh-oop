import java.util.ArrayList;

public class Contestant implements Comparable<Contestant> {

  private ArrayList<Jump> jumps;
  private String name;

  public Contestant(String name) {
    jumps = new ArrayList<Jump>();
    this.name = name;
  }

  public void jump(ArrayList<Judge> judges) {
    jumps.add(new Jump(judges));
  }

  public String getName() {
    return name;
  }

  public ArrayList<Jump> getJumps() {
    return jumps;
  }

  public Jump getLastJump() {
    return jumps.get(jumps.size() - 1);
  }

  public int getTotal() {
    int total = 0;
    for (Jump jump : jumps) {
      total += jump.getTotal();
    }
    return total;
  }

  @Override
  public int compareTo(Contestant other) {
    return getTotal() - other.getTotal();
  }

  @Override
  public String toString() {
    return name + "'s Total Score: " + getTotal();
  }

}