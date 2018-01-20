import java.util.HashMap;

public class PromissoryNote {

  private HashMap<String, Double> loans;

  public PromissoryNote() {
    loans = new HashMap<String, Double>();
  }

  public void setLoan(String name, double value) {
    loans.put(sanitiseString(name), value);
  }

  public double howMuchIsTheDebt(String name) {
    name = sanitiseString(name);
    if (loans.containsKey(name)) {
      return loans.get(name);
    }
    return 0;
  }

  private String sanitiseString(String s) {
    return s.toLowerCase().trim();
  }

}