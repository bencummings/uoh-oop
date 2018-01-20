package dictionary;

public class Main {

  public static void main(String[] args) {
    MindfulDictionary md = new MindfulDictionary("src/animals.txt");
    md.load();
    md.add("fish", "pescado");
    md.save();
  }

}