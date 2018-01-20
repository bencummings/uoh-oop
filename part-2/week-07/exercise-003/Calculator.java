public class Calculator {

  private Reader reader;
  private int calculations;

  public Calculator() {
    reader = new Reader();
    calculations = 0;
  }

  public void start() {
    while (true) {
      System.out.print("Command: ");
      String command = reader.readString();
      if (command.equalsIgnoreCase("end")) {
        break;
      } else if (command.equalsIgnoreCase("sum")) {
        sum();
      } else if (command.equalsIgnoreCase("difference")) {
        difference();
      } else if (command.equalsIgnoreCase("product")) {
        product();
      }
    }
    statistics();
  }

  private void sum() {
    int[] values = getValues();
    System.out.println("The sum of the two values is: " + (values[0] + values[1]));
  }

  private void difference() {
    int[] values = getValues();
    System.out.println("The difference of the two values is: " + (values[0] - values[1]));
  }

  private void product() {
    int[] values = getValues();
    System.out.println("The product of the two values is: " + (values[0] * values[1]));
  }

  private int[] getValues() {
    int[] values = new int[2];
    System.out.print("First Value: ");
    values[0] = reader.readInteger();
    System.out.print("Second Value: ");
    values[1] = reader.readInteger();
    calculations++;
    return values;
  }

  private void statistics() {
    System.out.println("The amount of calculations done: " + calculations);
  }

}