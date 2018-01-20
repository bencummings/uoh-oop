public class Main {

  public static void main(String[] args) {
    NightSky a = new NightSky(0.2);
    NightSky b = new NightSky(40, 20);
    NightSky c = new NightSky(0.3, 30, 15);

    a.print();
    System.out.println();
    System.out.println();

    b.print();
    System.out.println();
    System.out.println();

    c.print();
    System.out.println();
    System.out.println();
  }

}