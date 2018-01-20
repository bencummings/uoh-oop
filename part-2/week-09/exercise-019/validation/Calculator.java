package validation;

public class Calculator {

  public int multiplication(int fromInteger) {
    if (fromInteger < 0) {
      throw new IllegalArgumentException("The parameter must be non-negative.");
    }
    int multiplication = 1;
    for (int i = 1; i <= fromInteger; i++) {
      multiplication *= i;
    }
    return multiplication;
  }

  public int binomialCoefficient(int setSize, int subsetSize) {
    if (setSize < 0 || subsetSize < 0) {
      throw new IllegalArgumentException("The parameters must be non-negative.");
    } else if (setSize < subsetSize) {
      throw new IllegalArgumentException("The set size must be greater than the subset size.");
    }
    return multiplication(setSize) / (multiplication(subsetSize) * multiplication(setSize - subsetSize));
  }

}