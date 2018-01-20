public class Money {

  private final int euros;
  private final int cents;

  public Money(int euros, int cents) {
    if (cents > 99) {
      euros += cents / 100;
      cents %= 100;
    }
    this.euros = euros;
    this.cents = cents;
  }

  public int euros() {
    return euros;
  }

  public int cents() {
    return cents;
  }

  public Money plus(Money other) {
    return new Money(euros + other.euros, cents + other.cents);
  }

  public Money minus(Money other) {
    int euros = this.euros - other.euros;
    int cents = this.cents - other.cents;
    if (euros < 0 || (euros == 0 && cents < 0)) {
      euros = 0;
      cents = 0;
    } else if (euros > 0 && cents < 0) {
      euros--;
      cents = 100 - Math.abs(cents);
    }
    return new Money(euros, cents);
  }

  public boolean less(Money other) {
    return euros < other.euros || (euros == other.euros && cents < other.cents);
  }

  @Override
  public String toString() {
    String zero = "";
    if (cents < 10) {
      zero = "0";
    }
    return euros + "." + zero + cents + "e";
  }

}