import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("Enter the exam scores (-1 finalises the entries):");
    ArrayList<Grade> grades = calculateGrades();
    printGrades(grades);
  }

  public static ArrayList<Grade> calculateGrades() {
    ArrayList<Grade> grades = new ArrayList<Grade>();
    Scanner s = new Scanner(System.in);
    int score;
    while (true) {
      score = Integer.parseInt(s.nextLine());
      if (score == -1) {
        break;
      } else if (score >= Grade.MIN_SCORE && score <= Grade.MAX_SCORE) {
        grades.add(new Grade(score));
      }
    }
    return grades;
  }

  public static void printGrades(ArrayList<Grade> grades) {
    System.out.println("Grade distribution:");
    int acceptedCount = 0;
    for (int i = Grade.MAX_GRADE; i >= Grade.MIN_GRADE; i--) {
      String output = i + ": ";
      for (Grade grade : grades) {
        if (grade.getGrade() == i) {
          output += "*";
          if (i >= Grade.ACCEPTED_GRADE) {
            acceptedCount++;
          }
        }
      }
      System.out.println(output);
    }
    double acceptedPercentage = ((double) acceptedCount / grades.size()) * 100.0;
    System.out.println("Acceptance percentage: " + acceptedPercentage);
  }

}