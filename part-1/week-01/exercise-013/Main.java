import nhlstats.NHLStatistics;

public class Main {

  public static void main(String[] args) {
    // Output the top 10 players sorted by goals scored.
    NHLStatistics.sortByGoals();
    NHLStatistics.top(10);
    // Output the top 25 players sorted by penalty count.
    NHLStatistics.sortByPenalties();
    NHLStatistics.top(25);
    // Output the player statistics for Sidney Crosby.
    NHLStatistics.searchByPlayer("Sidney Crosby");
    // Output the team statistics for the Philadelphia Flyers.
    NHLStatistics.teamStatistics("PHI");
    // Output the team statistics for the Anaheim Ducks sorted by points.
    NHLStatistics.sortByPoints();
    NHLStatistics.teamStatistics("ANA");
  }

}