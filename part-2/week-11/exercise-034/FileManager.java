import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

  public List<String> read(String file) throws FileNotFoundException {
    List<String> lines = new ArrayList<String>();
    Scanner scanner = new Scanner(new File(file));
    while (scanner.hasNextLine()) {
      lines.add(scanner.nextLine());
    }
    scanner.close();
    return lines;
  }

  public void save(String file, String line) throws IOException {
    List<String> lines = new ArrayList<String>();
    lines.add(line);
    save(file, lines);
  }

  public void save(String file, List<String> lines) throws IOException {
    FileWriter fw = new FileWriter(file);
    for (String line : lines) {
      fw.write(line + "\n");
    }
    fw.close();
  }

}