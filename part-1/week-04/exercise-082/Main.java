public class Main {

  public static void main(String[] args) {
    LotteryNumbers lottoNumbers = new LotteryNumbers();
    System.out.println("Lottery numbers:");
    String output = "";
    int numQuantity = lottoNumbers.numbers().size();
    for (int i = 0; i < numQuantity; i++) {
      output += lottoNumbers.numbers().get(i);
      if (i != numQuantity - 1) {
        output += " ";
      }
    }
    System.out.println(output);
  }

}