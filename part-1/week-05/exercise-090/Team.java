import java.util.ArrayList;

public class Team {

  private String name;
  private ArrayList<Player> players;
  private int maxSize;

  public Team(String name) {
    this.name = name;
    players = new ArrayList<Player>();
    maxSize = 16;
  }

  public String getName() {
    return name;
  }

  public void addPlayer(Player player) {
    if (players.size() < maxSize) {
      players.add(player);
    }
  }

  public void printPlayers() {
    for (Player player : players) {
      System.out.println(player);
    }
  }

  public void setMaxSize(int maxSize) {
    this.maxSize = maxSize;
  }

  public int size() {
    return players.size();
  }

  public int goals() {
    int goalTotal = 0;
    for (Player player : players) {
      goalTotal += player.goals();
    }
    return goalTotal;
  }

}