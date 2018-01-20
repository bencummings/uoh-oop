import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    BoundedCounter seconds = new BoundedCounter(59);
    BoundedCounter minutes = new BoundedCounter(59);
    BoundedCounter hours = new BoundedCounter(23);

    System.out.print("Seconds: ");
    seconds.setValue(Integer.parseInt(reader.nextLine()));
    System.out.print("Minutes: ");
    minutes.setValue(Integer.parseInt(reader.nextLine()));
    System.out.print("Hours: ");
    hours.setValue(Integer.parseInt(reader.nextLine()));

    int timer = 120;
    int i = 0;
    while (i <= timer) {
      System.out.println(hours + ":" + minutes + ":" + seconds);
      seconds.next();
      if (seconds.getValue() == 0) {
        minutes.next();
        if (minutes.getValue() == 0) {
          hours.next();
        }
      }
      i++;
    }
  }

}