import java.io.File;
import java.util.Scanner;

public class Printer {

  private File file;
  private Scanner scanner;

  public Printer(String fileName) {
    file = new File(fileName);
  }

  public void printLinesWhichContain(String word) throws Exception {
    scanner = new Scanner(file, "UTF-8");

    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      if (word.isEmpty() || line.contains(word)) {
        System.out.println(line);
      }
    }

    scanner.close();
  }

}