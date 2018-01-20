public class Main {

  public static void main(String[] args) {
    RingingCentre rc = new RingingCentre();

    rc.observe(new Bird("Masked Lapwing", "Vanellus Miles", 2017), "Bathurst");
    rc.observe(new Bird("Masked Plover", "Vanellus Miles", 2017), "Sydney");

    rc.observations(new Bird("Masked Plover", "Vanellus Miles", 2017));
    System.out.println();

    rc.observations(new Bird("Australian Magpie", "Cracticus Tibicen", 2015));
    System.out.println();
  }

}