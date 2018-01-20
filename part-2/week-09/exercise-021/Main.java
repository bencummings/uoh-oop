public class Main {

  public static void main(String[] args) throws Exception {
    Printer printer = new Printer("src/textfile.txt");

    printer.printLinesWhichContain("");

    System.out.println();
    System.out.println("-----");
    System.out.println();

    printer.printLinesWhichContain("on");
  }

}