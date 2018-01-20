public class MyDate {

  private int day;
  private int month;
  private int year;

  public MyDate(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public boolean earlier(MyDate compared) {
    if (year < compared.year || (year == compared.year && month < compared.month) || (year == compared.year && month == compared.month && day < compared.day)) {
      return true;
    }
    return false;
  }

  public int differenceInYears(MyDate other) {
    // Based on the exercise requirements, assumes that all months contain 30 days.
    return Math.abs((((year - other.year) * 365) + ((month - other.month) * 30) + (day - other.day)) / 365);
  }

  @Override
  public String toString() {
    return day + "." + month + "." + year;
  }

}