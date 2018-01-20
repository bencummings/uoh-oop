import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<Student>();
    Scanner s = new Scanner(System.in);

    while (true) {
      System.out.print("Name: ");
      String name = s.nextLine();
      if (name.isEmpty()) {
        break;
      }
      System.out.print("Student Number: ");
      String id = s.nextLine();
      students.add(new Student(name, id));
    }

    System.out.println();

    for (Student student : students) {
      System.out.println(student);
    }

    System.out.println();

    System.out.print("Search Term: ");
    String keyword = s.nextLine().toLowerCase();
    ArrayList<Student> filteredStudents = new ArrayList<Student>();
    for (Student student : students) {
      if (student.getName().contains(keyword)) {
        filteredStudents.add(student);
      }
    }

    System.out.println("Results: ");
    for (Student student : filteredStudents) {
      System.out.println(student);
    }
  }

}