import movable.Group;
import movable.Organism;

public class Main {

  public static void main(String[] args) {
    Group g = new Group();

    g.addToGroup(new Organism(17, 5));
    g.addToGroup(new Organism(19, 85));
    g.addToGroup(new Organism(20, 17));

    System.out.println(g);
  }

}