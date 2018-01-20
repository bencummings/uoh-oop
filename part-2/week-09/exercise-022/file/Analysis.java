package file;

import java.io.File;
import java.util.Scanner;

public class Analysis {

  private File file;
  private Scanner scanner;

  public Analysis(File file) {
    this.file = file;
  }

  public int characters() throws Exception {
    return countLines(true);
  }

  public int lines() throws Exception {
    return countLines(false);
  }

  private int countLines(boolean countChars) throws Exception {
    scanner = new Scanner(file);
    int total = 0;
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      if (countChars) {
        total += line.length() + 1; // Accounts for new line characters.
      } else {
        total++;
      }
    }
    scanner.close();
    return total;
  }

}