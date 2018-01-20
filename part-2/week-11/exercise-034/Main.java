import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    FileManager fm = new FileManager();

    // Creates a new file and duplicates the contents from the existing file.
    fm.save("src/output.txt", fm.read("src/input.txt"));
  }

}