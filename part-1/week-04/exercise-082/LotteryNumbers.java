import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

  private ArrayList<Integer> numbers;
  private Random random;

  public LotteryNumbers() {
    random = new Random();
    drawNumbers();
  }

  public void drawNumbers() {
    numbers = new ArrayList<Integer>();
    int numQuantity = 7;
    int numMaximum = 39;
    int numCurrent;
    while (numbers.size() < numQuantity) {
      numCurrent = random.nextInt(numMaximum) + 1;
      if (!containsNumber(numCurrent)) {
        numbers.add(numCurrent);
      }
    }
  }

  public boolean containsNumber(int number) {
    return numbers.contains(number);
  }

  public ArrayList<Integer> numbers() {
    return numbers;
  }

}