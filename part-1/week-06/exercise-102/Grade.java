public class Grade {

  private int score;
  private int grade;

  public static final int MIN_SCORE = 0;
  public static final int MAX_SCORE = 60;
  public static final int MIN_GRADE = 0;
  public static final int MAX_GRADE = 5;
  public static final int ACCEPTED_GRADE = 1;

  public Grade(int score) {
    this.score = score;
    grade = convertScore(score);
  }

  private int convertScore(int score) {
    if (score >= 50) {
      return 5;
    } else if (score >= 45) {
      return 4;
    } else if (score >= 40) {
      return 3;
    } else if (score >= 35) {
      return 2;
    } else if (score >= 30) {
      return 1;
    } else {
      return 0;
    }
  }

  public int getScore() {
    return score;
  }

  public int getGrade() {
    return grade;
  }

  @Override
  public String toString() {
    return "The grade is " + grade + ".";
  }

}