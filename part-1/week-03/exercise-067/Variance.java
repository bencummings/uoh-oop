import java.util.ArrayList;

public class Variance {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(2);
    list.add(7);
    list.add(2);
    System.out.println("The variance is: " + variance(list));
  }

  public static double variance(ArrayList<Integer> list) {
    if (list.size() > 1) {
      double sampleAverage = average(list);
      double sampleVariance = 0D;
      for (int item : list) {
        sampleVariance += Math.pow(item - sampleAverage, 2);
      }
      return sampleVariance / (list.size() - 1);
    } else {
      return 0D;
    }
  }

  public static int sum(ArrayList<Integer> list) {
    int sum = 0;
    for (int item : list) {
      sum += item;
    }
    return sum;
  }

  public static double average(ArrayList<Integer> list) {
    return (double) sum(list) / list.size();
  }

}