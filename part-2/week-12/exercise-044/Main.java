public class Main {

  public static void main(String[] args) {
    String day = "wed";
    System.out.println("'" + day + "' is a valid day of the week: " + isAWeekDay(day));

    String word = "apple";
    System.out.println("'" + word + "' only contains vowels: " + allVowels(word));

    String time = "23:15:00";
    System.out.println("'" + time + "' is a valid time: " + clockTime(time));
  }

  public static boolean isAWeekDay(String string) {
    return string.matches("mon|tue|wed|thu|fri|sat|sun");
  }

  public static boolean allVowels(String string) {
    return string.matches("[aeiouäöy]*");
  }

  public static boolean clockTime(String string) {
    return string.matches("([0-1][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");
  }

}