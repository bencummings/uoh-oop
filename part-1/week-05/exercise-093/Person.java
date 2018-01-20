import java.util.Calendar;

public class Person {

  private String name;
  private MyDate birthday;

  public Person(String name) {
    this(name, new MyDate(Calendar.getInstance().get(Calendar.DATE), Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR)));
  }

  public Person(String name, int day, int month, int year) {
    this(name, new MyDate(day, month, year));
  }

  public Person(String name, MyDate birthday) {
    this.name = name;
    this.birthday = birthday;
  }

  public int age() {
    return birthday.differenceInYears(new MyDate(Calendar.getInstance().get(Calendar.DATE), Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR)));
  }

  public boolean olderThan(Person compared) {
    return birthday.earlier(compared.birthday);
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return name + ", born " + birthday;
  }

}