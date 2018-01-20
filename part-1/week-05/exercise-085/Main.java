public class Main {

  public static void main(String[] args) {
    Reformatory reformatory = new Reformatory();
    Person jane = new Person("Jane", 22, 160, 55);
    Person john = new Person("John", 32, 190, 78);

    System.out.println(jane.getName() + " has a starting weight of " + reformatory.weight(jane) + " kilograms.");
    System.out.println(john.getName() + " has a starting weight of " + reformatory.weight(john) + " kilograms.");

    reformatory.feed(jane);
    reformatory.feed(john);
    reformatory.feed(john);

    System.out.println(jane.getName() + " has a final weight of " + reformatory.weight(jane) + " kilograms.");
    System.out.println(john.getName() + " has a final weight of " + reformatory.weight(john) + " kilograms.");

    System.out.println("The total amount of weight measurements taken was " + reformatory.totalWeightsMeasured() + ".");
  }

}