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
    return year < compared.year || (year == compared.year && month < compared.month) || (year == compared.year && month == compared.month && day < compared.day);
  }

  public int differenceInYears(MyDate other) {
    return Math.abs((((year - other.year) * 365) + ((month - other.month) * 30) + (day - other.day)) / 365);
  }

  @Override
  public String toString() {
    return day + "." + month + "." + year;
  }

}