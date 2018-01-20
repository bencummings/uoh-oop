import java.util.Scanner;

public class Reader {

  private Scanner s;

  public Reader() {
    s = new Scanner(System.in);
  }

  public String readString() {
    return s.nextLine();
  }

  public int readInteger() {
    return Integer.parseInt(s.nextLine());
  }

}