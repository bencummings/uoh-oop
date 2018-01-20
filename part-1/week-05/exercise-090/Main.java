public class Main {

  public static void main(String[] args) {
    Team averageJoes = new Team("Average Joes");

    averageJoes.addPlayer(new Player("Peter La Fleur", 5));
    averageJoes.addPlayer(new Player("Kate Veatch", 2));
    averageJoes.addPlayer(new Player("Patches O'Houlihan"));

    System.out.println(averageJoes.getName() + " contains " + averageJoes.size() + " players:");
    averageJoes.printPlayers();
    System.out.println(averageJoes.getName() + " has a combined total of " + averageJoes.goals() + " goals.");
  }

}