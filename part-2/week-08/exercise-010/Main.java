public class Main {

  public static void main(String[] args) {
    CivilService civil = new CivilService();
    MilitaryService military = new MilitaryService(730);

    int civilCounter = 0;
    while (civil.getDaysLeft() > 0) {
      civil.work();
      civilCounter++;
    }
    System.out.println("The duration of civil service was " + civilCounter + " days.");

    int militaryCounter = 0;
    while (military.getDaysLeft() > 0) {
      military.work();
      militaryCounter++;
    }
    System.out.println("The duration of military service was " + militaryCounter + " days.");
  }

}