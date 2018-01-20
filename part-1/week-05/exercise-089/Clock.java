public class Clock {

  private BoundedCounter hours;
  private BoundedCounter minutes;
  private BoundedCounter seconds;

  public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
    hours = new BoundedCounter(23);
    hours.setValue(hoursAtBeginning);
    minutes = new BoundedCounter(59);
    minutes.setValue(minutesAtBeginning);
    seconds = new BoundedCounter(59);
    seconds.setValue(secondsAtBeginning);
  }

  public void tick() {
    seconds.next();
    if (seconds.getValue() == 0) {
      minutes.next();
      if (minutes.getValue() == 0) {
        hours.next();
      }
    }
  }

  @Override
  public String toString() {
    return hours + ":" + minutes + ":" + seconds;
  }

}