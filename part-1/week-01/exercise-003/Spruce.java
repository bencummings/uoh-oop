public class Spruce {

  public static void main(String[] args) {
    int colLimit = 9;
    int rowLimit = 6;
    // Iterate through each row.
    for (int i = 0; i < rowLimit; i++) {
      String rowResult = "";
      int innerLength;
      // Determine if the current row is the first or last.
      if (i == 0 || i == rowLimit - 1) {
        innerLength = 1;
      } else {
        innerLength = (i * 2) + 1;
      }
      int outerLength = (colLimit - innerLength) / 2;
      // Iterate through each column.
      for (int j = 0; j < colLimit; j++) {
        if (j < outerLength) {
          rowResult += " ";
        } else if (j < outerLength + innerLength) {
          rowResult += "*";
        } else {
          break;
        }
      }
      System.out.println(rowResult);
    }
  }

}