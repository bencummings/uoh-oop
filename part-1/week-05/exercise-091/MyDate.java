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

  public void advance() {
    day++;
    // Based on the exercise requirements, assumes that all months contain 30 days.
    if (day > 30) {
      day = 1;
      month++;
      if (month > 12) {
        month = 1;
        year++;
      }
    }
  }

  public void advance(int days) {
    for (int i = 0; i < days; i++) {
      advance();
    }
  }

  public MyDate afterNumberOfDays(int days) {
    MyDate result = new MyDate(day, month, year);
    result.advance(days);
    return result;
  }

  @Override
  public String toString() {
    return day + "." + month + "." + year;
  }

}