package file;

import java.io.File;

public class Main {

  public static void main(String[] args) {
    Analysis analysis = new Analysis(new File("src/testfile.txt"));

    try {
      System.out.println("Lines: " + analysis.lines());
      System.out.println("Characters: " + analysis.characters());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

}